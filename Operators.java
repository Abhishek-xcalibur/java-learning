public class Operators{
    public static void main(String[] args){
        /* Operators are used to perform operation on variables and values in Java.
        There are different types of operators in Java.
        1. Arithmetic Operators: These are used to perform arithmetic operations on variables and values in Java. The arithmetic operators in Java are +, -, *, /, and %.
        2. Relational Operators: These are used to compare two values in Java. The relational operators in Java are ==, !=, >, <, >=, and <=.
        3. Logical Operators: These are used to perform logical operations on variables and values in Java.The logical operators in Java are &&, ||, and !.
        4. Assignment Operators: These are used to assign values to variables in Java. The assignment operators in Java are =, +=, -=, *=, /=, and %=.
        5. Unary Operators: These are used to perform operation on a single variable or value in Java. The unary operators in Java are +, -, ++, --, and !.
        6. Bitwise Operators: These are used to perform bitwise operations on variables and values in Java. The bitwise operators in Java are &, |, ^, ~, <<, >>, and >>>.
        7. Ternary Operator: This is used to perform operation on three variables or values in Java. The ternary operator in Java is ? :.
        */
        //Arithmetic Operators
        int num1=10;
        int num2=5;
        int sum=num1+num2;
        int difference=num1-num2;
        int product=num1*num2;
        int quotient=num1/num2;
        int remainder=num1%num2;
        System.out.println("The sum of num1 and num2 is:"+sum);
        System.out.println("The difference of num1 and num2 is:"+difference);
        System.out.println("The product of num1 and num2 is:"+product);
        System.out.println("The quotient of num1 and num2 is:"+quotient);
        System.out.println("The remainder of num1 and num2 is:"+remainder);
        //Relational Operators
        boolean isEqual=num1==num2;
        boolean isNotEqual=num1!=num2;
        boolean isGreater=num1>num2;
        boolean isLess=num1<num2;
        boolean isGreaterOrEqual=num1>=num2;
        boolean isLessOrEqual=num1<=num2;
        System.out.println("Is num1 equal to num2? "+isEqual);
        System.out.println("Is num1 not equal to num2? "+isNotEqual);
        System.out.println("Is num1 greater than num2? "+isGreater);
        System.out.println("Is num1 less than num2? "+isLess);
        System.out.println("Is num1 greater than or equal to num2? "+isGreaterOrEqual);
        System.out.println("Is num1 less than or equal to num2? "+isLessOrEqual);
        //Logical Operators
        boolean isTrue=true;
        boolean isFalse=false;
        boolean andResult=isTrue && isFalse;
        boolean orResult=isTrue || isFalse;
        boolean notResult=!isTrue;
        System.out.println("The result of isTrue AND isFalse is:"+andResult);
        System.out.println("The result of isTrue OR isFalse is:"+orResult);
        System.out.println("The result of NOT isTrue is:"+notResult);   
        

    }
}