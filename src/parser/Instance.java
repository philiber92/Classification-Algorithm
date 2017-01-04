package parser;

import tree.ADTree;

/**
 * Represents a training dataset, which contains both data and label.
 *
 * @author Philipp Bergt
 */
public class Instance<T> {

    final private T _data;
    private int _label;
    private double _weight;

    /**
     * Constructs new {@link Instance} by given data and label.
     * Sets {@link #_weight} to a value of 1.
     *
     * @param data x data type or dimension
     * @param label data label
     */
    public Instance(final T data, final int label) {
        _data = data;
        _label = label;
        _weight = 1;
    }

    /**
     * Updates weight based on currently set weight and prediction.
     *
     * @param tree currently constructed decision tree
     */
    public void updateWeight(final ADTree<T> tree) {
        //TODO: perhaps move this to an external call
        double predicition = tree.simulate(_data);
        _weight = _weight * Math.exp((-1)*_label*predicition);
    }

    /**
     * @return related label
     */
    public int getLabel() {
        return _label;
    }

    /**
     * @return related data
     */
    public T getData() {
        return _data;
    }

}
