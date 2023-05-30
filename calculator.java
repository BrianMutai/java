import java.util.Scanner;
public class calculator {
    public static void main(String args[]){
        Scanner brian= new Scanner(System.in);
        double num1, num2, answer;
        System.out.println("Enter first number: ");
        num1= brian.nextDouble();
        System.out.println("Enter second number: ");
        num2= brian.nextDouble();
        answer= num1+num2;
        System.out.println(answer);


    }
}
