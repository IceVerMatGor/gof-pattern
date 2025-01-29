package interpreter;


/**
 * Operand.
 * These class implement the composite pattern(Leaf)
 */
public class TerminalExpression implements Expression {

    private String data;

    public TerminalExpression(String data) {
        this.data = data;
    }


    @Override
    public void interpret(Context context) {

    }
}
