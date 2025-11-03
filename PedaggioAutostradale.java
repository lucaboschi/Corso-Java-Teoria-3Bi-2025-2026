import java.util.Scanner;

public class PedaggioAutostradale{
    
    public static void main(String[] args){
        /*
         * Dati di input: 
         * numero di chilometri percorsi, 
         * zona (Nord, Centro, Sud)
         * tipo di veicolo con cui è avvenuto il viaggio
         */
        
         int chilometri;
         String zona;
         String veicolo;
         double tariffa;
   
         Scanner tastiera = new Scanner(System.in);

         System.out.println("Calcolo pedaggio autostradale");

         System.out.print("Inserire il numero di chilometri percorsi: ");
         chilometri = tastiera.nextInt();

         // validazione chilometri percorsi
         if (chilometri>0) 
         { 
             System.out.print("Inserire la zona del viaggio (NORD - CENTRO - SUD): ");
             zona = tastiera.next().toUpperCase();

             // validazione zona
             if (zona.equals("NORD") || zona.equals("CENTRO") || zona.equals("SUD"))  {
                 
                 System.out.print("Inserire il tipo di veicolo (M1 - M2 - M3): ");
                 veicolo = tastiera.next().toUpperCase();

                 // validazione veicolo
                 if (veicolo.equals("M1") || veicolo.equals("M2") || veicolo.equals("M3")) {
                    
                    // calcolo la tariffa in base alla zona
                    if (zona.equals("NORD")) {
                        tariffa = 0.08*chilometri;
                    }
                    else if (zona.equals("CENTRO")){
                        tariffa = 0.075*chilometri;
                    }
                    else{
                        tariffa = 0.065*chilometri;
                    }

                    // calcolo la tariffa in base al tipo di veicolo
                    if (veicolo.equals("M2")) {
                        tariffa = tariffa*1.1;  // incremento la tariffa del 10%
                    }
                    else if(veicolo.equals("M3")){
                        tariffa = tariffa*1.15;  // incremento la tariffa del 15%
                    }

                    // impatto ambientale
                    if (chilometri<=100) {
                        tariffa = tariffa + (chilometri*0.02);
                        //tariffa += (chilometri*0.02);
                    }
                    else{
                        tariffa += (chilometri-100)*0.01 + (100 * 0.02);
                    }

                    // IVA al 22%
                    tariffa *=1.22;

                    // arrotondamento
                    tariffa = Math.round(tariffa * 100.0)/100.0;

                    System.out.println("Importo finale: "+tariffa);

                 }
                 else{
                    System.out.println("Attenzione: il tipo di veicolo può essere M1-M2-M3");
                 }
             }
             else{
                System.out.println("Attenzione: il valore della zona può essere NORD-CENTRO-SUD");
             }
    
         }
         else{
            System.out.println("Attenzione: il valore dei km deve essere positivo");
         }

        



    }
}