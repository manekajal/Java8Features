package java8features.lambdaExpression;

/*Java lambda expression is consisted of three components.

1) Argument-list: It can be empty or non-empty as well.

2) Arrow-token: It is used to link arguments-list and body of expression.
3) Body: It contains expressions and statements for lambda expression.*/

public class Main  {
    public static void main(String[] args) {
        // Multiple parameters in lambda expression
        Addition ad1=(a,b)->(a+b);
        System.out.println(ad1.add(10,20));

        // Multiple parameters with data type in lambda expression
        Addition ad2=(int a,int b)->(a+b);
        System.out.println(ad2.add(100,200));
    }


}
