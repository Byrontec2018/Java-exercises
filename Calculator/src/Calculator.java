public class Calculator {

    public double dNumber1 = 0, dNumber2 = 0;
    public String sOperator = "", sErr = "", sResult = ""; 

    public Calculator(double dNumber1, double dNumber2, String sOperator) {

        this.dNumber1 = dNumber1;     // Inout 1st number
        this.dNumber2 = dNumber2;     // Input 2nd number
        this.sOperator = sOperator;   // Input operator type (+, -, / or *)
                
        switch (this.sOperator) {

                case "+":
                    /* Sum calculation and composition of the string to be displayed */
                    this.sResult = this.dNumber1 + " " + this.sOperator + " " + this.dNumber2 + " = " + (this.dNumber1 + this.dNumber2);
                    break;
                case "-":
                    /* Subtraction calculation and composition of the string to be displayed */              
                    this.sResult = this.dNumber1 + " " + this.sOperator + " " + this.dNumber2 + " = " + (this.dNumber1 - this.dNumber2);
                    break;
                case "*":
                    /* Multiplication calculation and composition of the string to be displayed */
                    this.sResult = this.dNumber1 + " " + this.sOperator + " " + this.dNumber2 + " = " + (this.dNumber1 * this.dNumber2);
                    break;
                case "/":
                    /* Division calculation and composition of the string to be displayed */
                    this.sResult = this.dNumber1 + " " + this.sOperator + " " + this.dNumber2 + " = " + (this.dNumber1 / this.dNumber2);
                    break;            
                default:                    
                    /* Error message in case the operator type is wrong (not +, -, * or /) */
                    this.sErr = "ERROR: Wrong operator type!";
                    break;

        }

    }    
    
}
