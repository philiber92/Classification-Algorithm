package boosting;

import parser.Instances;
import tree.BinaryClassADTree;

import java.util.Vector;

/**
 * @author Philipp Bergt
 */
public class LT1PCBoost implements Boosting<Vector, Vector> {

    @Override
    public void boost(BinaryClassADTree tree, Instances<Vector> instances, int iterations) {

    }
}
