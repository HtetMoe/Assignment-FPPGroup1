package assignment10.prob1;

import javax.naming.AuthenticationNotSupportedException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TestMain {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number from 0 to 100: ");
        int number;
        while(true){
            try{
                number = input.nextInt();
                if (number < 0 || number > 100){
                    throw new InputMismatchException();
                }
                else
                    break;
            }catch(InputMismatchException e){
                System.out.println("Please enter a number from 0 to 100: ");
                input.next();
            }
        }

    }
}
