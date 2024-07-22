import java.util.Scanner;

public class ConcatenazioneStringhe {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Inserisci la prima stringa:");
        String primaStringa = scanner.nextLine();

        System.out.println("Inserisci la seconda stringa:");
        String secondaStringa = scanner.nextLine();

        System.out.println("Inserisci la terza stringa:");
        String terzaStringa = scanner.nextLine();

        // Concatenazione delle stringhe in ordine di inserimento
        String concatenazioneDiretta = primaStringa + secondaStringa + terzaStringa;
        System.out.println("Concatenazione in ordine di inserimento: " + concatenazioneDiretta);

        // Concatenazione delle stringhe in ordine inverso di inserimento
        String concatenazioneInversa = terzaStringa + secondaStringa + primaStringa;
        System.out.println("Concatenazione in ordine inverso di inserimento: " + concatenazioneInversa);

        scanner.close();
    }
}






