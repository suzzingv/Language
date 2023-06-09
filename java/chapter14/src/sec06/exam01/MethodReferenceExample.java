package sec06.exam01;

import java.util.function.IntBinaryOperator;

public class MethodReferenceExample {
    public static void main(String[] args) {
        IntBinaryOperator operator;

        operator = (x, y) -> Calculator.staticMethod(x, y);
        System.out.println("결과1: " + operator.applyAsInt(1, 2));

        operator = Calculator :: staticMethod;
        System.out.println("결과2: " + operator.applyAsInt(3, 4));

        Calculator obj = new Calculator(); //인스턴스 메소드는 객체 만들어야 사용 가능
        operator = (x, y) -> obj.instanceMethod(x, y);
        System.out.println("결과3: " + operator.applyAsInt(5, 6));
        
        operator = obj :: instanceMethod;
        System.out.println("결과4: " + operator.applyAsInt(7, 8));
    }
}
