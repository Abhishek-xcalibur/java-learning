public class Typecasting{
    public static void main(String[] args){
        /* Typecasting is the process of converting one data type into another data type in Java.
        There are two types of typecasting in Java:
        1.Implicit Typecasting: This is the process of converting a smaller data type into a larger data type in Java. It is also known as widening conversion.
        2.Explicit Typecasting: This is the process of converting a larger data type into a smaller data type in Java. It is also known as narrowing conversion. */
        //Implicit Typecasting
        int num1=10;
        float num2=num1; //Implicit Typecasting from int to float
        System.out.println("The value of num1 is: "+num1);
        System.out.println("The value of num2 is: "+num2);
        //Explicit Typecasting
        float num3=10.5f;
        int num4=(int)num3; //Explicit Typecasting from float to int
        System.out.println("The value of num3 is:"+num3);
        System.out.println("The value of num4 is:"+num4);

    }
}