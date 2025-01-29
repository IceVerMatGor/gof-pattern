package interpreter;

import java.util.List;

/**
 *
 * Operator.
 * These class implement the composite pattern(Branch)
 */
public class NonTerminalExpression implements Expression {
    private List<Expression> expressionList;

    public NonTerminalExpression(List<Expression> expressionList) {
        this.expressionList = expressionList;
    }

    @Override
    public void interpret(Context context) {

    }
}
