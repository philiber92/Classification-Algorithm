package util;

/**
 * @author Philipp Bergt
 */
public class Condition {

    private ConditionType _conditionType;
    private int _dimensionIndex;
    private double _value;

    enum ConditionType {
        EQUAL,
        GREATER,
        LESS,
        GREATER_THAN,
        LESS_THAN
    }

    public Condition(double value, int dimensionIndex, ConditionType conditionType) {
        _value = value;
        _dimensionIndex = dimensionIndex;
        _conditionType = conditionType;
    }

    public boolean check(double value) {

    }

    public boolean isTrue() {

    }

    public int getDimension() {
        return _dimensionIndex;
    }


}
