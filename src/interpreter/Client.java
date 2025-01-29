package interpreter;

public class Client {
    public static void main(String[] args) {
        String expression = "";

        Context context = new Context();
        Interpreter interpreter = new Interpreter(context);


        // parse + build expression tree + execute
        interpreter.interpret(expression);

    }
}
