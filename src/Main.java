public class Main {

    public static void main(String[] args) {

        /* cw.1 pętle while */

        /* zad 1 - Napisać za pomocą pętli do-while kod który będzie iterował od liczby 1000 w dół do 0.
          Jeśli liczba będzie podzielna przez 2 ostatnie cyfry waszego indeksu (podać nr indesu z uczelni)
          to dać komunikat "liczba XX podzielna przez YY" (XX-liczba podzielna YY-podzielnik)
        */
        int index = 59936; int i=1000;
        int n = (index%100);
        int a;
        System.out.println(n);
        do {
            a = (i % n);
            switch (a)
            {
                case 0:
                    System.out.println("liczba " + i + " podzielna przez " + n);
                    break;
                /*default:
                    System.out.println("liczba " + i + " niepodzielna przez " + n);*/
            }
        }   while (--i>0);

        System.out.println("\n");

        /* zad 2
        a) stworzyć tablicę typu int wielkosci 5, przypisac jej dowolne wartości,
          przeiterować tablicę po elementach i wyswietlić, użyć pętli while

        b) jak wyżej tylko dla tablicy typu double[],
        c) jak wyżej dla tablicy String[], przeiterować i wyświetlić od ostatniego elementu
        */

        //a
        int tab[]={10,200,3000,40000,5000};
        i=0;
        while ( i<5)
        {
            System.out.println(tab[i]);
            i=i+1;
        }
        System.out.println("\n");

        //b
        double tab2[]={10.1,20.20,30.400,400.500,500.70};
        i=0;
        while ( i<5)
        {
            System.out.println(tab2[i]);
            i=i+1;
        }
        System.out.println("\n");

        //c
        String tab3[]={"jeden","dwa","trzy","cztery","piec"};
        i=4;
        while ( i>=0)
        {
            System.out.println(tab3[i]);
            i=i-1;
        }
        System.out.println("\n");
        /* zad.3
        a) sprawdzić jak zachowuje się pętla while gdy w jej warunku damy true --> while(true)
        b) a jak gdy damy false --> while(false)
        */

        //a
        /*i=0;
        while (true)
        {
            System.out.println(i);
            ++i;
        }*/

        //b
       /* i=0;
        while (false)
        {
            System.out.println(i);
            ++i;
        }*/

    }
}
