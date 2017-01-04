package boosting;

import parser.Instances;
import tree.ADTree;

/**
 * Main interface for all possible boosting algorithms.
 *
 * @author Philipp Bergt
 */
public interface Boostable<T> {

    /**
     * Appyling boosting algorithm on given tree, based on training dataset and iterations.
     *
     * @param tree decision tree
     * @param instances training data
     * @param iterations max iterations
     */
    void boost(ADTree<T> tree, Instances<T> instances, int iterations);

}
