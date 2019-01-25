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

        try{
            this.ans = firstNum/secondNum;
        }
        catch (ArithmeticException e){
            System.out.println("Sorry, can't divide " + firstNum + " by 0");
        }

        return ans;
    }

    public static void main(String[] args) {

    }


}
