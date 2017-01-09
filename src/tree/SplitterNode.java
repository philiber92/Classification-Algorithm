package tree;

import util.Condition;

/**
 * @author Philipp Bergt
 */
public interface SplitterNode {

    /**
     *
     * @return
     */
    Condition getCondition();

    /**
     *
     * @return
     */
    PredictionNode getTruePrediction();

    /**
     *
     * @return
     */
    PredictionNode getFalsePrediction();
}
