package boosting;

import parser.Instances;
import tree.BoostableADTree;

/**
 * Main interface for all possible boosting algorithms.
 *
 * @author Philipp Bergt
 */
public interface Boosting<Input, PredictionType> {

    /**
     * Appyling boosting algorithm on given tree, based on training dataset and iterations.
     *
     * @param tree decision tree
     * @param instances training data
     * @param iterations max iterations
     */
    void boost(BoostableADTree<Input, PredictionType> tree, Instances<Input> instances, int iterations);

}
