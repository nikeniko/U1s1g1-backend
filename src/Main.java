
import java.util.Scanner;

public class Main {


    public static int moltiplica(int a, int b) {
        return a * b;
    }


    public static String concatena(String str, int num) {
        return str + num;
    }

    public static String[] inserisciInArray(String[] array, String str) {
        String[] nuovoArray = new String[6];
        nuovoArray[0] = array[0];
        nuovoArray[1] = array[1];
        nuovoArray[2] = str;
        nuovoArray[3] = array[2];
        nuovoArray[4] = array[3];
        nuovoArray[5] = array[4];
        return nuovoArray;
    }


    public static void main(String[] args) {
        // Invocazione del metodo moltiplica
        int risultatoMoltiplica = moltiplica(3, 4);
        System.out.println("Il prodotto di 3 e 4 è: " + risultatoMoltiplica);


        String risultatoConcatena = concatena("Numero ", 5);
        System.out.println(risultatoConcatena);


        String[] arrayOriginale = {"a", "b", "c", "d", "e"};
        String[] arrayRisultato = inserisciInArray(arrayOriginale, "inserito");
        System.out.println("array");
        for (String elemento : arrayRisultato) {
            System.out.println(elemento);
        }
    }
}


