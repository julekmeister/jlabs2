import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* ćw.2 pętle for */

        /* zad.1 Napisz program który będzie iterował od 100 do 0,
         *  i wyświetlał liczby które są podzielne przez ostatnią cyfrę waszego indeksu
         * (jesli tą liczbą jest 0 to przez 2 ostatnie) */

        int index = 59936;
        int n = index%10;
        int i;
        System.out.println(n);

        for ( i = 100;i>0;--i)
        {
            if (i%n==0)
            {
                System.out.println("Liczba "+i+" jest podzielna przez "+n);
            }
        }

        /* zad.2 Napisz program który będzie uzupełniał tablicę 5-cio elementową int[] liczbami
         * wprowadzanymi z klawiatury (użyć klasy Scanner), a następnie będzie wyświetlał elementy tablicy
         * za pomocą pętli forEach powiększone o 11 */

        int[] tab = new int[5];
        Scanner x = new Scanner(System.in);
        for (i=0;i<5;++i)
        {
            System.out.println("\nPodaj "+(i+1)+" element:");
            tab[i]=  Integer.parseInt(x.nextLine());

        }
        for (int t:tab)
        {
            System.out.println(t+11);
        }

    }
}
