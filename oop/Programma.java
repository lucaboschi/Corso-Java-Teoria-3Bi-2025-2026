package oop;

public class Programma {

    public static void main(String[] args) {
        // Come utilizziamo le classi?

        // Come nuovo tipo di dato (sono infatti degli UDT, ossia, User Data Type,
        // cioè tipi di dato definiti dall'utente programmatore)

        // Cosa ci facciamo con il tipo di dato?
        // Dichiariamo variabili di quel tipo

        // La dichiarazione di una variabile segue il classico standard:
        // TIPO_DATO    NOME_VARIABILE  ;
        Studente s;

        // Che cosa produce la dichiarazione di una variabile di tipo Studente?
        // Ossia, quanto è grande questa variabile? Che cosa contiene?
        // La dichiarazione di s è equivalente alla dichiarazione di un array   int[] v;
        // v ed s conterranno riferimenti ad oggetti e pertanto, in una architettura
        // a 64 bit, occuperanno 64 bit di memoria, ossia, lo spazio giusto
        // per contenere un indirizzo: l'indirizzo dell'oggeto che deve ancora essere creato

        // Come si fa per creare l'oggetto vettore che ha una certa dimensione?
        // Utilizzando l'operatore new.
        // new int[10];     questa istruzione crea un oggetto grande 32x10 bit
        //                  e mi restituisce l'indirizzo della prima locazione 
        // Scrivendo  v = new int[10];    associo a v l'indirizzo dell'oggetto.

        // Con le classi, si procede in maniera analoga

        // Creo una istanza della classe Studente
        // new Studente();      scritta da sola, crea l'istanza ma io programmatore NON HO
        //                      la possibilità di poterla gestire

       s = new Studente();     // assegna alla variabile s l'oggetto creato con l'operatore new

        

    }
}
