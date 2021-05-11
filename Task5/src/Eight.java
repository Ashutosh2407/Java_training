import java.util.ArrayDeque;
import java.util.Deque;

public class Eight {

	public static void main(String[] args) {
		String expr = "({[]})";
		if(balanced_brackets(expr)) {
			System.out.println(true);
		}
		else {
			System.out.println(false);
		}

	}
	
	
	public static boolean balanced_brackets(String expr) {
		Deque<Character> stack = new ArrayDeque<Character>();
		for(int i =0;i < expr.length();i++) {
			char x = expr.charAt(i);
			if (x == '(' || x == '[' || x =='{') {
				stack.push(x);
				continue;
			}
			if(stack.isEmpty())
				return false;
			char check;
			switch (x) {
			case ')':
				check = stack.pop();
				if (check == '{' || check == '[') {
					return false;
				}
				break;
				
			case '}':
                check = stack.pop();
                if (check == '(' || check == '[')
                    return false;
                break;
 
            case ']':
                check = stack.pop();
                if (check == '(' || check == '{')
                    return false;
                break;
			}
		}
		return stack.isEmpty();
	}
}
