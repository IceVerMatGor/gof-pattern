package interpreter;

/**
 * This class parse expression,
 * build expression tree({@code NonTerminalExpression} - branch, {@code TerminalExpression} - leaf )
 */
public class Interpreter {

    private Context context;

    public Interpreter(Context context) {
        this.context = context;
    }

    /**
     *
     * @param expression to parse
     */
    public void interpret(String expression) {
        // logic to parse
        // logic to create expression tree
        // logic to execute and return result

    }

}
