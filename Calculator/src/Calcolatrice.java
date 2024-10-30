public class Calcolatrice {

    public double operando1 = 0, operando2 = 0;
    public String operazione = "", err = "", risultato = ""; 

    public Calcolatrice(double operando1, double operando2, String operazione) {

        this.operando1 = operando1;     //Valore del primo operando ricevuto
        this.operando2 = operando2;     //Valore del secondo operando ricevuto
        this.operazione = operazione;   //Tipo di operazione ricevuto
                
        switch (this.operazione) {

                case "+":
                    /* Calcolo la somma e compongo la stringa da stapare a video */
                    this.risultato = this.operando1 + " " + this.operazione + " " + this.operando2 + " = " + (this.operando1 + this.operando2);
                    break;
                case "-":
                    /* Calcolo la sottrazione e compongo la stringa da stapare a video */              
                    this.risultato = this.operando1 + " " + this.operazione + " " + this.operando2 + " = " + (this.operando1 - this.operando2);
                    break;
                case "*":
                    /* Calcolo la moltiplicazione e compongo la stringa da stapare a video */
                    this.risultato = this.operando1 + " " + this.operazione + " " + this.operando2 + " = " + (this.operando1 * this.operando2);
                    break;
                case "/":
                    /* Calcolo la divisione e compongo la stringa da stapare a video */
                    this.risultato = this.operando1 + " " + this.operazione + " " + this.operando2 + " = " + (this.operando1 / this.operando2);
                    break;            
                default:                    
                    /* Messaggio di Errore nel caso che il valore di operazione è diverso da +, -, * o / */
                    this.err = "Hai inserito un tipo di operazione errato!";
                    break;

        }

    }    
    
}
