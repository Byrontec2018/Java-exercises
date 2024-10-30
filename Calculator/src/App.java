import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        double dnumber1 = 0;   // Input 1st number
        double dNumber2 = 0;   // Input 2nd number
        String sOperator ="";  // Input operator type
        String sErr = "";      // Error message     

        try {

            /* Requesting input values */
            System.out.println("Enter the first number:");
            dnumber1 = scanner.nextDouble();
            System.out.println("Enter the type of operation (+,-,*,/):");
            sOperator = scanner.next();
            System.out.println("Enter the second number:");
            dNumber2 = scanner.nextDouble();
            

        } catch (InputMismatchException e) { 

            /* Error message when typing wrong value */
            sErr = "The entered value is invalid!";

        } 

        
        if (sErr == "") {

            /* Calling Calculator class by sending data and type of operation */
            Calculator Calculator = new Calculator(dnumber1, dNumber2, sOperator);    

            if  (Calculator.sErr == "") {

                /* Displaying the result */
                System.out.println("The result of this operation is: " + Calculator.sResult);

            } else {

               /* Displaying the error message if an operator type (other than +, -, *, /) has been typed */
                System.err.println(Calculator.sErr);
            }
            
        } else {

            /* Displaying the error message committed during input */
            System.err.println(sErr);

        }
        
        scanner.close();
        
    }
         
    
}
