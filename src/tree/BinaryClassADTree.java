package tree;

import boosting.AdaBoost;
import parser.Instance;
import parser.Instances;
import util.Condition;

import java.util.List;
import java.util.Optional;
import java.util.Vector;

/**
 * Represents a simple alternating decision tree, which is only able to handle binary class problems.
 *
 * @author Philipp Bergt
 */
public class BinaryClassADTree extends BoostableADTree<Vector<Double>, Double> {

    private int _positiveLabel, _negativeLabel;

    public BinaryClassADTree() {
        boostStrategy = new AdaBoost();
    }

    @Override
    public Instances<Vector<Double>> classify(Instances<Vector<Double>> instances) {
        for(Instance instance : instances) {
            classify(instance);
        }
        return instances;
    }

    @Override
    public Instance<Vector<Double>> classify(Instance<Vector<Double>> instance) {
        double value = simulate(instance);
        if(value >= 0.0) {
            instance.setLabel(_positiveLabel);
        } else {
            instance.setLabel(_negativeLabel);
        }
        return instance;
    }

    @Override
    public Double simulate(Instance<Vector<Double>> instance) {
        final PredictionNode root = (PredictionNode) rootNode.get();
        double value = root.getValue();
        return value + simulateSplitter(root.getSplitter(), instance);
    }

    @Override
    public void train(Instances instances, int iterations) {
        final List<Integer> labels = instances.getLabels();
        _positiveLabel = labels.get(0);
        _negativeLabel = labels.get(1);
        boostStrategy.boost(this, instances, iterations);
    }

    public int getPositiveLabel() {
        return _positiveLabel;
    }

    public int getNegativeLabel() {
        return _negativeLabel;
    }

    private double simulateSplitter(Optional<tree.SplitterNode<Double>> splitter, Instance<Vector<Double>> instance) {
        if(!splitter.isPresent()) {
            return 0.0;
        }
        final tree.SplitterNode<Double> splitterNode = splitter.get();
        final Condition condition = splitterNode.getCondition();
        final int dimension = condition.getDimension();
        final tree.PredictionNode<Double> truePrediction = splitterNode.getTruePrediction();
        final tree.PredictionNode<Double> falsePrediction = splitterNode.getFalsePrediction();

        return (condition.check(instance.getData().get(dimension)))
                ? truePrediction.getValue() + simulateSplitter(truePrediction.getSplitter(), instance)
                : falsePrediction.getValue() + simulateSplitter(falsePrediction.getSplitter(), instance);
    }
}
