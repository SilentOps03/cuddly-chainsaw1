import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

   public static void main(String[] args) {
        Scanner KB = new Scanner(System.in) ;

        String operazione = "", fineoperazione = "N";
        List<Integer>  numeri = new ArrayList<>();
        int risultato = 0 ;
        do {

          System.out.println("Specifica l'operazione da effettuare: (+, -, *, /) ");
          operazione = KB.nextLine();

        }while(!operazione.equals("+") && !operazione.equals("-") && !operazione.equals("*") && !operazione.equals("/"));

        do {

            System.out.println("Inserisci il numero: ");
           numeri.add(KB.nextInt());
            if(numeri.size()>1){
                 System.out.println("Vuoi eseguire un operazione? (Y/N)");
                 fineoperazione = KB.next();

            }

        }while(!fineoperazione.equalsIgnoreCase("Y"));

        switch (operazione){
            case "+":
                for (Integer n : numeri) {
                    risultato += n ;

                }
                break;
            case "-":
                risultato = numeri.getFirst();
                for (int i = 1; i<numeri.size(); i++) {
                    risultato -= numeri.get(i);
                }
                break;
            case "*":
                risultato = 1;
                for (Integer n : numeri) {
                    risultato *= n;
                }
                break;
            case "/":
                risultato = numeri.getFirst();
                for (int i = 1; i<numeri.size(); i++) {
                    risultato /= numeri.get(i);
                }
                break;
        }

        System.out.println(risultato);


   }
}