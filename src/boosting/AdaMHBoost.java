package boosting;

import parser.Instances;
import tree.BinaryClassADTree;

import java.util.Vector;

/**
 * Represents and adaption of basic AdaBoost algorithm, which is able to handle multi-class problems.
 *
 * @author Philipp Bergt
 */
public class AdaMHBoost implements Boosting<Vector, Vector>{
    @Override
    public void boost(BinaryClassADTree tree, Instances<Vector> instances, int iterations) {

    }
}
