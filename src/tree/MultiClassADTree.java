package tree;

import boosting.LTBoost;
import parser.Instance;
import parser.Instances;

import java.util.Vector;

/**
 * Represents an adaption of classic
 *
 * @author Philipp Bergt
 */
public class MultiClassADTree extends BoostableADTree<Vector, Vector> {

    /**
     *
     */
    public MultiClassADTree() {
        super();
        boostStrategy = new LTBoost();
    }

    @Override
    public Instances<Vector> classify(Instances<Vector> instances) {
        return null;
    }

    @Override
    public Instance<Vector> classify(Instance<Vector> instance) {
        return null;
    }

    @Override
    public Vector simulate(Instance<Vector> instance) {
        return null;
    }

    @Override
    public void train(Instances instances, int iterations) {

    }
}
