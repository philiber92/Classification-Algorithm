package parser;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Simple wrapper class which is able to hold multiple elements of type {@link Instance}.
 *
 * @param <T> x data type or dimension
 * @author Philipp Bergt
 */
public class Instances<T> implements Iterable<Instance<T>>{

    final List<Instance<T>> _instances = new ArrayList<>();

    /**
     * Adds given instance to collection.
     *
     * @param instance
     */
    public void add(final Instance<T> instance) {
        _instances.add(instance);
    }

    /**
     * Adds given instance constructed by given arguments and a weight of 1.
     *
     * @param data x data type or dimension
     * @param label data label
     */
    public void add(T data, int label) {
        _instances.add(new Instance<>(data, label));
    }

    @Override
    public Iterator<Instance<T>> iterator() {
        return _instances.iterator();
    }

}
