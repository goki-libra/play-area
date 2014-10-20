package misc;

import java.util.Stack;

class BraceMatch {

	public static void main(String args[]) {
		String[] words = new String[] { ")(){}"
				, "[]({})", "([])", "{()[]}","([)]" };
		match_braces(words);

	}

	public static void match_braces(String[] expressions) {
		for (String word : expressions) {
			Stack<Character> braceStack = new Stack<Character>();
			int result = 1;
			for (int i = 0; i < word.length(); i++) {
				char brace = word.charAt(i);
				if (brace == '(' || brace == '{' || brace == '[') {
					braceStack.push(brace);
				} else {
					if(braceStack.isEmpty()){
						result = 0;
						break;
					}
					Character pop = braceStack.pop();
					if (!checkDoublet(pop, brace)){
						result = 0;
						break;
					}
				}
			}
			System.out.println(result);
		}
	}

	private static boolean checkDoublet(char pop, char val){
		if ((pop == '(' && val == ')') || (pop == '{' && val == '}') || (pop == '[' && val == ']')){
			return true;
		}
		return false;
	}
}