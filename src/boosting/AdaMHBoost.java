package boosting;

import parser.Instances;
import tree.BoostableADTree;

import java.util.Vector;

/**
 * Represents and adaption of basic AdaBoost algorithm, which is able to handle multi-class problems.
 *
 * @author Philipp Bergt
 */
public class AdaMHBoost implements Boosting<Vector, Vector>{
    @Override
    public void boost(BoostableADTree<Vector, Vector> tree, Instances<Vector> instances, int iterations) {

    }
}
