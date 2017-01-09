package tree;

import java.util.Optional;

/**
 * @author Philipp Bergt
 */
public interface PredictionNode<Input> {

    /**
     *
     * @param splitter
     */
    void setSplitter(SplitterNode splitter);

    /**
     *
     * @return
     */
    boolean hasSplitter();

    /**
     *
     * @return
     */
    Optional<SplitterNode> getSplitter();

    /**
     *
     * @return
     */
    Input getValue();
}
