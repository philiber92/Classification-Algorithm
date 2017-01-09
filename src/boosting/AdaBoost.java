package boosting;

import parser.Instances;
import tree.BoostableADTree;

import java.util.Vector;

/**
 * Represents the basic AdaBoost algorithm, which it's able to classify binary problems.
 *
 * @author Philipp Bergt
 */
public class AdaBoost implements Boosting<Vector, Double>{

    private Instances<Vector> _instances;
    private BoostableADTree<Vector, Double> _adTree;
    private Vector<Double> _weights;
    private int _iterations;
    private int _positiveLabel;

    @Override
    public void boost(BoostableADTree<Vector, Double> tree, Instances<Vector> instances, int iterations) {
        if(instances.countClasses() != 2)
            throw new RuntimeException("AdaBoost is only able two handle binary class problems!");
        if(iterations <= 0)
            throw new RuntimeException("Number of iterations must be greater or equal than one!");
        _instances = instances;
        _adTree = tree;
        _iterations = iterations;
        _positiveLabel = _instances.get(0).getLabel();
        init();
    }

    private void init() {
        initWeights();
        initRootNode();
    }

    private void initWeights() {
        _weights = new Vector<>();
        int numInstances = _instances.size();
        _instances.forEach(vectorInstance -> _weights.add(1.0/numInstances));
    }

    private void initRootNode() {
        double positiveWeight = 0.0;
        double factor = 1.0/_instances.size();
        for(int i = 0; i < _instances.size(); i++) {
            if(_instances.get(i).getLabel() == _positiveLabel) {
                positiveWeight += factor;
            }
        }
        double negativeWeight = 1.0 - positiveWeight;
        double alpha = 0.5 * Math.log(positiveWeight/negativeWeight);
        _adTree.setRootPrediction(alpha);
    }
}
