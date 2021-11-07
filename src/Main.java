import java.util.Scanner;

public class Main {

    private static int[] tablica;

    public static void main(String[] args) {

        /* ćwiczenie 3 switch case */

        /* zad.1 napisać program który przyjmuje jedną liczbę od użytkownika z klawiatury
          i za pomocą switch case default ma określić czy:
          a) ta liczba jest parzysta --> podpowiedz switch(a % 2) {
          b) program który określi czy liczba jest podzielna przez 7
         */

        /* zad.2
           a) napisać program podobny do programu z przykładu, który ma zliczyć iloś liter 'o', 'p', 'x', 'z', 'q' w wyrazie:
            "ooooozjoonoxoooozoooooooooozoxooooopnpppoooiiooooomnzooooxoqoojoozoootyoooozoooxoooozooooxooooooojoooopxoooonnmooo"
           b) oraz ma określić ile jest pozostałych liter, które nie należą do: 'o', 'p', 'x', 'z', 'q'
         */

        //a
        String text = "ooooozjoonoxoooozoooooooooozoxooooopnpppoooiiooooomnzooooxoqoojoozoootyoooozoooxoooozooooxooooooojoooopxoooonnmooo";
        int x = text.length();
        int[] tab = new int[5];
        int i=0;
        for (char w : text.toCharArray()) {
            switch (w) {
                case 'o':
                    ++tab[0];
                    ++i;
                    break;
                case 'p':
                    ++tab[1];
                    ++i;
                    break;
                case 'x':
                    ++tab[2];
                    ++i;
                    break;
                case 'z':
                    ++tab[3];
                    ++i;
                    break;
                case 'q':
                    ++tab[4];
                    ++i;
                    break;
            }
        }

        System.out.printf("\nIlosc o: %d\nIlosc p: %d\nIlosc x: %d\nIlosc z: %d\nIlosc q: %d\n",
                tab[0], tab[1], tab[2],tab[3],tab[4]);
        System.out.println("Ilosc liter innych: "+(x-i));

    }
}
