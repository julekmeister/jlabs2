public class Main {

    public static void main(String[] args) {

        /* cw.4  */

        /* zad.1 napisać 3 pętle for i użyc:
        a) w pierwszej pętli break
        b) w drugiej pętli continue
        c) w trzeciej pętli return
        */
        int i;
        //a
        for ( i =0;i<10;i++)
        {
            if (i%2==5)
                break;
        }
        System.out.println(i+"\n");

        //b
        for ( i =0;i<10;i++)
        {
            if (i%2==0)
                continue;
            System.out.println(i);

        }
        System.out.println("\n");


        //c
        for ( i =0;i<10;i++)
        {
            if (i==3)
                return;
            System.out.println(i);

        }
        System.out.println(i);


    }
}
