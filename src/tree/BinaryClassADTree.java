package tree;

import parser.Instance;
import parser.Instances;

import java.util.Vector;

/**
 * Represents a simple alternating decision tree, which is only able to handle binary class problems.
 *
 * @author Philipp Bergt
 */
public class BinaryClassADTree extends BoostableADTree<Vector, Double>{
    @Override
    public Instances<Vector> classify(Instances<Vector> instances) {
        return null;
    }

    @Override
    public Instance<Vector> classify(Instance<Vector> instance) {
        return null;
    }

    @Override
    public Double simulate(Instance<Vector> instance) {
        return null;
    }

    @Override
    public void train(Instances instances, int iterations) {

    }
}
