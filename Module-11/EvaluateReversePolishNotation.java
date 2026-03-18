// LeetCode 150 - Evaluate Reverse Polish Notation (Medium)

import java.util.Stack;

public class EvaluateReversePolishNotation {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for (String token : tokens) {
            if (token.equals("+")) {
                stack.push(stack.pop() + stack.pop());
            } else if (token.equals("-")) {
                int b = stack.pop();
                int a = stack.pop();
                stack.push(a - b);
            } else if (token.equals("*")) {
                stack.push(stack.pop() * stack.pop());
            } else if (token.equals("/")) {
                int b = stack.pop();
                int a = stack.pop();
                stack.push(a / b);
            } else {
                stack.push(Integer.parseInt(token));
            }
        }
        return stack.pop();
    }

    public static void main(String[] args) {
        EvaluateReversePolishNotation er = new EvaluateReversePolishNotation();
        String[] tokens = {"2", "1", "+", "3", "*"};
        System.out.println(er.evalRPN(tokens));
        String[] tokens2 = {"4", "13", "5", "/", "+"};
        System.out.println(er.evalRPN(tokens2));
    }
}
