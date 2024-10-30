package src;

import java.util.InputMismatchException;
import java.util.Scanner;

public class NumberTriangle {

    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        int rowsNumber = 0;
    
        try {

            /* Input request rows number */

            System.out.println("Insert the rows number:");
            rowsNumber = scanner.nextInt();

            scanner.close();
            
            /* Checking if the input value is: >0 */

            if (rowsNumber > 0) {

                //PrintTriangle print = new PrintTriangle();  // 1st method
                PrintTriangle1 print = new PrintTriangle1();  // 2nd method (more faster than 1st)
1
                print.printTriangle(rowsNumber);

            } else { 

                System.err.println("Wrong input value!!!"); // Error message in case the input value is: <1

            }

        } catch (InputMismatchException e) {  

            System.err.println("Wrong input value!!!");  // Error message in case the input value is not an integer

        }           


    }
    
}
