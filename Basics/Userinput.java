/*The scanner class is used to take input from the user.
The scanner class is part of the java.util package and providees
methods to read different types of input like int,double,float,String etc.*/

import java.util.Scanner;

class Userinput
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name:");
        String name=sc.nextLine();
        System.out.println("Hello, " + name + "!");
    }
}