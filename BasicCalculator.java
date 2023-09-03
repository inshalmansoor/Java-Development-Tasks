package T1;
import java.util.Scanner;
public class Calculator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Calculator to perform basic operations");
        System.out.println("Four basic operations that can be perform are: ");
        System.out.println("1) Addition");
        System.out.println("2) Subtraction");
        System.out.println("3) Multiplication");
        System.out.println("4) Division");
        System.out.print("Select an operation number from the above options(1-4): ");
        int op = sc.nextInt();
        System.out.print("Enter the first number: ");
        double num1 = sc.nextDouble();
        System.out.print("Enter the second number: ");
        double num2 = sc.nextDouble();
        double result = 0.0;
        if (op==1){
            result = num1 + num2;
            System.out.print("The result of "+num1+" + "+num2+" is "+result);
        }
        else if (op==2){
            result = num1 - num2;
            System.out.print("The result of "+num1+" - "+num2+" is "+result);
        }
        else if (op==3){
            result = num1 * num2;
            System.out.print("The result of "+num1+" * "+num2+" is "+result);
        }
        else if (op==4){
            if (num2==0){
                System.out.println("Divisor must be a non zero number!");
                System.out.println("Please try again and enter a number other than zero: "); 
                num2 = sc.nextDouble();  
                sc.close();
            }
            result = num1 / num2;
            System.out.print("The result of "+num1+" / "+num2+" is "+result);
        }
        else {
            System.out.print("Invalid operation!");
        }
    }
}
