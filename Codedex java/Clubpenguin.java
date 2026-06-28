import java.util.Scanner;

public class Clubpenguin{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double exchangerate= 0.0045;
        System.out.println("Welcome to the Club Penguin Currency Coneverter!");
        System.out.println("Please enter the amount in penguin coins you would like to convert to USD:");
        int coins= scanner.nextInt();

        double usd=coins * exchangerate;

        System.out.println("You have the following amount in USD:");
        System.out.println(usd);

    }
}