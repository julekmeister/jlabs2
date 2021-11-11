import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {


    //1-b
    public static int[] metoda1(int x){
        int[] tab =new int[x];
        int j=40;
        for (int i=0;i<x;++i)
        {
            tab[i]=j-i;
        }
        return tab;
    }

    //1-c
    public static void metoda2(int[] item){

        for (int i:item
             ) {
            System.out.println(i);
        }

    }
    //2-b
    public static String[] metoda3(int x){
        String[] tab =new String[x];
        Scanner s = new Scanner(System.in);

        for (int i=0;i<x;++i)
        {
            System.out.println("\nPodaj element "+(i+1)+":");
            tab[i] = s.nextLine();
        }
        return tab;
    }
    //2-c
    public static void metoda4(String[] tab){
        System.out.println("\nTablica:");
        for (int i=5;i>=0;--i)
        {
            System.out.println(tab[i]);
        }

    }

    //3-a
        public static void metoda5(String Imie){
        System.out.println(Imie);
    }
        //3-b
        public static void metoda5(String Imie, String Nazwisko) {
            System.out.println(Imie + " " + Nazwisko);
        }
        //3-c
        public static void metoda5(String Imie, String Nazwisko, int wiek){
            System.out.println(Imie + " " + Nazwisko + ", " + wiek);
            }

        //4-a
        public static int metoda6(int x, int y){

            return x + y;
    }
        //4-b
        public static int metoda6(int x, int y, int z){

            return x + y + z;
        }


    public static void main(String[] args) {
        /* ćwiczenie 5 Metody */

        /* zad.1
        a) stworzyć tablicę typu int[20],
        b) napisać metodę która będzie uzupełniała tablicę wartościami od 40 do 20,
        c) napisać metodę, która wypisze otrzymane wartości,
        d) wstawić wywołanie metody do metody main
        */

        //a
        int[] tab =new int[20];

        //d
        tab=metoda1(20);
        metoda2(tab);





        /* zad.2
        a) stworzyc tablicę typu String[6],
        b) napisać metodę która uzupełni tablicę wartościami podawanymi z klawiatury
            (użyć do tego pętli i klasy Scanner),
        c) napisać metodę która wyświetli elementy tablicy od ostatniego elementu do elementu o indeksie 0,
        */

        //a
        String[] tab2 = new String[6];
        tab2=metoda3(6);
        metoda4(tab2);

        /* zad.3
        a) napisać metodę która przyjmuje 1 parametr typu String, metoda nic nie zwraca, tylko
            wyświetla w konsoli string który ma być waszym imieniem,
        b) napisać metodę o tej samej nazwie jak w punkcie a) z 2-oma parametrami typu String, która wyświetli
            wasze imie i nazwisko,
        c) napisać metodę o tej samej nazwie jak w punkcie a) i b) która przyjmuje wasze imie,
            nazwisko i wiek (int), a następnie wszystko wyświetli,
        */

        //c
        metoda5("Julian","Miśkiewicz",37);

        /* zad.4
        a) napisać metodę która przyjmuje 2 parametry typu int i zwraca ich sumę, którą przypiszemy do zmiennej,
            coś takiego:                                    zmiennaA = metoda(1, 2); <-- wywołanie metody
        b) napisać metodę (nazwa ta sama co w punkcie a) która przyjmuje 3 parametry typu int i zwraca ich sumę,
            którą przypiszemy do zmiennej, coś takiego:     zmiennaB = metoda(7, 8, 9); <-- wywołanie metody
        c) wyświetlić sumę wywołań obu metod ---> print("wynik: " + (metoda(8, 9) + metoda(2, 3, 4));
        */
        //c
        System.out.println("wynik: " + (metoda6(8, 9) + metoda6(2, 3, 4)));

    }

}
