package boosting;

import parser.Instances;
import tree.BoostableADTree;

import java.util.Vector;

/**
 * @author Philipp Bergt
 */
public class LT1PCBoost implements Boosting<Vector, Vector> {

    @Override
    public void boost(BoostableADTree<Vector, Vector> tree, Instances<Vector> instances, int iterations) {

    }
}
