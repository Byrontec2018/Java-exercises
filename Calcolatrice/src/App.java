import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        double operando1 = 0;   //Primo valore dell'operazione
        double operando2 = 0;   //Secondo valore dell'operazione
        String operazione ="";  //Tipo dell'operazione richiesta
        String errore = "";     //Messaggio di errore       

        try {

            /* Richiesta dei valori in input */
            System.out.println("Digita il primo numero:");
            operando1 = scanner.nextDouble();
            System.out.println("Digita il tipo di operazione (+,-,*,/):");
            operazione = scanner.next();
            System.out.println("Digita il secondo numero:");
            operando2 = scanner.nextDouble();
            

        } catch (InputMismatchException e) { 

            /* Errore in caso di input errato */
            errore = "Il valore inserito non è valido!";

        } 

        
        if (errore == "") {

            /* Richiamo la classe Calcolatrice inviando i dati ed il tipo di operazione */
            Calcolatrice calcolatrice = new Calcolatrice(operando1, operando2, operazione);    

            if  (calcolatrice.err == "") {

                /* Mando a video il risultato dell'operazione */
                System.out.println("Il risultato dello'operazione è: " + calcolatrice.risultato);

            } else {

               /* Mando a video il messaggio di errore nel caso immetto un tipo di operazione diverso da +, -, *, / */
                System.err.println(calcolatrice.err);
            }
            
        } else {

            /* Mando a video il messaggio di errore commesso in fase di input */
            System.err.println(errore);

        }
        
        scanner.close();
        
    }
         
    
}
