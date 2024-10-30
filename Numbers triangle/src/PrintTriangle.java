package src;

/* Method for print the numeric triangle using numbers*/

public class PrintTriangle {

    public void printTriangle(int rowsNumber) {

        for (int row = 1; row <= rowsNumber; row++) { 
            
            int number = 1;

            for (int col = 1; col <= row; col++) {
                              
                /* Loop for print the numeric string */
                
                if (number < 10) {

                    System.out.print(number);
                    number ++;

                } else {

                    System.out.print(0);
                    number = 1;

                }
                
            }

            System.err.println();
            
        }

               

    }

}
