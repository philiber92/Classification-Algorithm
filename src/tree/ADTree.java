package tree;

import parser.Instances;
import util.Condition;

/**
 * @author Philipp Bergt
 */
public abstract class ADTree<T> {

    public abstract int classify(T data);

    public abstract double simulate(T data);

    public abstract void train(Instances<T>, int iterations);

    class SplitterNode {
        private Condition _condition;
        private PredictionNode _truePrediction;
        private PredictionNode _falsePrediction;

        public SplitterNode(Condition condition, double truePrediction, double falsePrediction) {
            _condition = condition;
            _truePrediction = new PredictionNode(truePrediction);
            _falsePrediction = new PredictionNode(falsePrediction);
        }

        public PredictionNode getNextPredictionNode(int value) {

        }

        public int getConditionDimension() {
            return _condition.getDimension();
        }

        public PredictionNode getTruePredictionNode() {
            return _truePrediction;
        }

        public PredictionNode getFalsePredictionNode() {
            return _falsePrediction;
        }
    }

    class PredictionNode {
        private double _value;
        private SplitterNode _childNode;

        public PredictionNode(final double value) {
            _value = value;
        }

        public void addChildNode(final SplitterNode splitter) {
            _childNode = splitter;
        }

        public SplitterNode getChildNode() {
            return _childNode;
        }

        public double getValue() {
            return _value;
        }
    }

}
