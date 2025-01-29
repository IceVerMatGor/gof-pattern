package interpreter;


/**
 * interface Expression,
 * first impl {@code NonTerminalExpression},
 * second impl {@code TerminalExpression}.
 * These classes implement the composite pattern
 *
 */
public interface Expression {
    void interpret(Context context);
}
