import java.util.Scanner;
import java.util.Stack;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            String input=sc.next();
            Stack<Character> stack = new Stack<>();
            boolean result = true;
            for (char c : input.toCharArray()){
                if (c == '{' || c == '(' || c == '[') {
                    stack.push(c);
                } else {
                    if (stack.isEmpty()) {
                        result = false;
                        break;
                    }
                    char popped = stack.pop();
                    if ((popped == '{' && c != '}') ||
                            (popped == '(' && c != ')') ||
                            (popped == '[' && c != ']')) {
                        result = false;
                        break;
                    }
                }
            }
            if (!stack.isEmpty()) {
                result = false;
            }
            System.out.println(result);
        }
    }
}