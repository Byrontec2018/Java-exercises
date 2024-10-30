package src;

/* Method for print the numeric triangle using a string of chars */

public class PrintTriangle1 {
      
    public void printTriangle(int rowsNumber) {

        String stringTriangle = ""; // String to print

        /* Create string to print */

        for (int index = 0; index <= (rowsNumber/10) ; index++) {
            stringTriangle += "1234567890";            
        }

        /* Print the correct part of the string for each row */

        for (int row = 1; row <= rowsNumber; row++) {
            System.out.println(stringTriangle.substring(0, row));            
        }

    }

}
