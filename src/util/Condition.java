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
        LESS
    }

    public Condition(double value, int dimensionIndex, ConditionType conditionType) {
        _value = value;
        _dimensionIndex = dimensionIndex;
        _conditionType = conditionType;
    }

    public boolean check(int value) {

    }

    public boolean check(double value) {

    }

    public int getDimension() {
        return _dimensionIndex;
    }


}
