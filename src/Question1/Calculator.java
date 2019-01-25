package Question1;

import java.util.Scanner;

public class Calculator {
    double firstNum;
    double secondNum;
    double ans;
    String name;

    public Calculator(){

    }

    public Calculator(String calName){
        this.name = calName;
    }

    Scanner sc = new Scanner(System.in);

    public double divideNumbers(double firstNum, double secondNum){
        this.firstNum = firstNum;
        this.secondNum = secondNum;

        try
        {
            this.ans = firstNum/secondNum;
        }
        catch (ArithmeticException e)
        {
            System.out.println("Sorry, can't divide " + firstNum + " by 0");
        }

        return this.ans;
    }

    public double squareNumber(double firstNum){
        this.firstNum = firstNum;

        this.ans = firstNum*firstNum;

        return this.ans;
    }

    public double rootOfNumber(double firstNum){
        this.firstNum = firstNum;

        try
        {
            this.ans = Math.sqrt(firstNum);
        }
        catch (ArithmeticException e)
        {
            System.out.println("Sorry, can't determine the square root of a negative number");
        }

        return this.ans;
    }

    public static void main(String[] args) {
        Calculator cal1= new Calculator();
        System.out.println(cal1.divideNumbers(10,0));
        System.out.println(cal1.rootOfNumber(-8));
        System.out.println(cal1.squareNumber(-5));

    }


}
