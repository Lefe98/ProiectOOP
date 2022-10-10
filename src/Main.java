import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /* EX.1 - Cititi un numar de la tastatura si stocati valoarea lui intr-o variabila. Generati un numar random intre 1 si 100 si stocati acel numar intr-o alta variabila. Daca numarul introdus de la tastatura este mai miC decat numarul random generat, afisati mesajul “Numarul introdus este mai mic decat <numar_random>” (inserati valoarea numarului random generat in textul afisat). */

        System.out.println("\tTEMA CAPITOLUL 2, subpunctul B");
        System.out.println("\tEXERCITIUL 1");

        System.out.println("Introdu un numar intre 1 si 100 ");
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = (int) (Math.random() * 100);
        System.out.println("Numarul random generat este " + b);

        if (a < b) {
            System.out.println("Numarul tau " + a + " este mai mic ca numarul random " + b);
        } else {
            System.out.println("Numarul random " + b + " este mai mic decat numarul tau");
        }

        /* EX.2: Cititi un caracter si 2 numere de la tastatura, si stocati-le in variabile. Folosind structura switch, daca s-a introdus un caracter anume, realizati operatia respectiva cu cele 2 numere, si afisati rezultatul pe ecran: ‘a’: adaugare ; ‘s’: scadere; ‘i’: inmultire; ‘p’: impartire; ‘m’: modul.       Daca nu s-a introdus un caracter valid, afisati un mesaj de eroare. */

        System.out.println("\tEXERCITIUL 2");

        System.out.println("Introdu un caracter de la tastatura(a, s, i, p, m)");
        Scanner cititor = new Scanner(System.in);
        String caracterIntrodus = cititor.next();
        System.out.println("Caracterul introdus este: " + caracterIntrodus);
        System.out.println("Introdu un numar x de la tastatura");
        double numarX = cititor.nextDouble();
        System.out.println("Numarul X introdus este: " + numarX);
        System.out.println("Introdu numar Y de la tastatura");
        double numarY = cititor.nextDouble();
        System.out.println("Numarul Y introdus este: " + numarY);

        switch (caracterIntrodus) {
            case "a": {
                System.out.println("'a': adunam X+Y");
                System.out.println(numarX + numarY);
                break;
            }
            case "s": {
                System.out.println("'s': scadem X-Y");
                System.out.println(numarX - numarY);
                break;
            }
            case "i": {
                System.out.println("'i': inmultim X*Y");
                System.out.println(numarX * numarY);
                break;
            }
            case "p": {
                System.out.println("'p': impartim X:Y");
                System.out.println(numarX / numarY);
                break;
            }
            case "m": {
                System.out.println("'m': modul(restul) X:Y");
                System.out.println(numarX % numarY);
                break;
            }
            default: {
                System.out.println("Eroare: Caracterul introdus nu este corect!");
                break;
            }
        }

        /* EX.3 Definiti un array de 2 dimensiuni, fiecare dimensiune sa aiba cate 3, respectiv 5 elemente. Initializati array-ul. Afisati primele si ultimele elemente din fiecare dimensiune pe ecran.*/

        System.out.println("\tEXERCITIUL 3");

        String[][] calculator = new String[3][5];
        calculator[0][0] = "procesor";
        calculator[0][1] = "placa video";
        calculator[0][2] = "placa de baza";
        calculator[1][0] = "sursa";
        calculator[1][1] = "memorie ram";
        calculator[1][2] = "tastatura";
        calculator[1][3] = "calculator";
        calculator[1][4] = "laptop";
        System.out.println("Primul si ultimul element din dimensiunea 1 sunt: " + calculator[0][0] + " si " + calculator[0][2]);
        System.out.println("Primul si ultimul element din dimensiunea 2 sunt:" + calculator[1][0] + " si " + calculator[1][4]);

        /* EX.4 Definiti un array de char-uri. Iterati array-ul folosind structura for, si afisati pe ecran al doilea caracter din sir.
         */
        System.out.println("\tEXERCITIUL 4");

        char[] alfabet = new char[6];
        alfabet[1] = 'a';
        alfabet[2] = 'b';
        alfabet[3] = 'c';
        alfabet[4] = 'd';
        alfabet[5] = 'e';

        System.out.println("Al doilea element al sirului este: " + alfabet[2]);

        /*EX.5 Definiti un array de double, cu valori zecimale. Iterati array-ul folosind structura for, si daca un element este egal cu valoarea 4.5, afisati-l pe ecran. Daca un element este mai mare decat 5, afisati mesajul “Element peste 5” */

        System.out.println("\tEXERCITIUL 5");

        double[] calcule = new double[7];
        calcule[0] = 4.50;
        calcule[1] = 3.80;
        calcule[2] = 1.50;
        calcule[3] = 7.70;
        calcule[4] = 8.95;
        calcule[5] = 5.99;
        calcule[6] = 5.50;
        for (int z = 0; z < calcule.length; z++) {
            if (calcule[z] == 4.5) {
                System.out.println("Elementul " + z + " din sir este: " + calcule[z]);
            } else if (calcule[z] > 5) {
                System.out.println("Elementul " + z + " din sir are valoarea: " + calcule[z] + " si este peste 5");
            }
        }

        /*EX.6 Definiti un array cu 9 elemente si parcugeti-l cu structura for (tipul de date la alegere). Daca iteratia este la indexul 2, sa sara peste. Daca iteratia este la indexul 7, sa se opreasca iteratia. Altfel, sa se afiseze mesajul “Index valid” pe ecran.
         */

        System.out.println("\tEXERCITIUL 6");

        String[] angajati = new String[9];
        String[] literal = {"Marius", "Marcel", "Cristina", "Andrei", "Ion", "Alexandru", "Ioana", "Daniel", "Georgiana"};
        for (int k = 0; k < angajati.length; k++) {
            if (k == 2) {
                continue;
            }
            if (k == 7) {
                break;
            } else
                System.out.println("Indexul este valid.");
        }

        // EX.7 Definiti o lista de Integer, de 5 elemente. Calculati suma tuturor elementelor.
        System.out.println("\tEXERCITIUL 7");
        List<Integer> lista = Arrays.asList(5, 10, 15, 20,25);
        Integer sumaArrayList = 0;
        int s = 0;
        do {
            sumaArrayList = sumaArrayList + lista.get(s);
            s ++;
        }
        while (s < lista.size()) ;
        System.out.println("Suma celor 5 elemente este egala cu: " + sumaArrayList);

        // EX.8 Definiti un array si o lista. Determinati daca ele sunt goale sau nu.

        System.out.println("\tEXERCITIUL 8");
        int arr[] = {};
        if (arr.length == 0) {
            System.out.println("Array-ul este gol.");
        } else {
            System.out.println("Array-ul nu este gol.");
        }

        int arrayList[] = {2, 4, 6, 8, 10};
        if (arrayList.length == 0) {
            System.out.println("Lista este goala.");
        } else {
            System.out.println("Lista nu este goala.");

        }
    }
}