import java.util.Scanner;

public class MetodiGeometrici {


    public static double perimetroRettangolo(double lato1, double lato2) {
        return 2 * (lato1 + lato2);
    }


    public static int pariDispari(int numero) {
        return (numero % 2 == 0) ? 0 : 1;
    }

    // Metodo per calcolare l'area di un triangolo usando la formula di Erone
    public static double areaTriangolo(double lato1, double lato2, double lato3) {
        double semiPerimetro = (lato1 + lato2 + lato3) / 2;
        return Math.sqrt(semiPerimetro * (semiPerimetro - lato1) * (semiPerimetro - lato2) * (semiPerimetro - lato3));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("primo lato del rettangolo:");
        double lato1Rettangolo = scanner.nextDouble();
        System.out.println("secondo lato del rettangolo:");
        double lato2Rettangolo = scanner.nextDouble();
        double perimetroRett = perimetroRettangolo(lato1Rettangolo, lato2Rettangolo);
        System.out.println("Il perimetro del rettangolo è: " + perimetroRett);


        System.out.println("Inserisci un numero intero:");
        int numero = scanner.nextInt();
        int risultatoPariDispari = pariDispari(numero);
        if (risultatoPariDispari == 0) {
            System.out.println("Il numero è pari.");
        } else {
            System.out.println("Il numero è dispari.");
        }

        // Input e calcolo dell'area del triangolo usando la formula di Erone
        System.out.println("Inserisci la lunghezza del primo lato del triangolo:");
        double lato1Triangolo = scanner.nextDouble();
        System.out.println("Inserisci la lunghezza del secondo lato del triangolo:");
        double lato2Triangolo = scanner.nextDouble();
        System.out.println("Inserisci la lunghezza del terzo lato del triangolo:");
        double lato3Triangolo = scanner.nextDouble();
        double areaTriang = areaTriangolo(lato1Triangolo, lato2Triangolo, lato3Triangolo);
        System.out.println("L'area del triangolo è: " + areaTriang);

        scanner.close();
    }
}
