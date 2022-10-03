package interpreter;

import java.util.Map;

public interface PostfixExpression {

	//	VariableExpression, PlusExpression, MinusExpression class를 아래와 같이 변경하고 parser에서 사용 가능
	static PostfixExpression plus(PostfixExpression left, PostfixExpression right) {
		return context -> left.interpret(context) + right.interpret(context);
	}

	static PostfixExpression minus(PostfixExpression left, PostfixExpression right) {
		return context -> right.interpret(context) - left.interpret(context);
	}

	static PostfixExpression variable(char c) {
		return context -> context.get(c);
	}

	int interpret(Map<Character, Integer> context);

}
