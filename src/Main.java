import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.*;


public class Main {
//1-b
public static void Metoda1(List<String> lista){
    System.out.println("\n");
    for (String item:lista
         ) {
        System.out.println(item);
    }
    System.out.println("Liczba zwierząt: "+lista.size());
}
    public static void main(String[] args) {

        /* ćw_6 Listy */

        /* zad.1 a) Napisać program który stworzy listę ArrayList<String> (lista tablicowa),
                Proszę dane wprowadzać z klawiatury (można użyć pętli), lista ma mieć przynajmniej 5
                elementów i elementami mają być nazwy zwierząt.
                b) proszę stworzyć metodę która będzie miała pętle forEach i będzie wyświetlała elementy Listy
                -- podpowiedź: for(String zmienna : List<String>)
                c) proszę usunąć 2 ostatnie elementy listy i dodać do niej 3 inne elementy,
                następnie wyświetlić listę i wielkość listy,
                d) następnie proszę wykonać odwrotne sortowanie i znów użyć metody z punktu b) do wyświetlenia
                elementów listy
          */
        //1-a
        List<String> lista = new ArrayList<>(5);
        Scanner scan = new Scanner(System.in);

        while (true){
        System.out.println("Podaj zwierzę: ");
        lista.add(scan.nextLine());
        System.out.println("Liczba zwierząt: "+lista.size());

        if (lista.size()>=5){
            System.out.println("Czy dodać kolejne zwierzę?\ty/n");
            if (Objects.equals(scan.nextLine(), "n")){
                break;
                }
            }
        }

        //1-c

        lista.remove(lista.size()-1);
        lista.remove(lista.size()-1);
        lista.add("kapibara");
        lista.add("salamandra plamista");
        lista.add("zimorodek");
        Metoda1(lista);

        //1-d
        lista.sort(Collections.reverseOrder());
        Metoda1(lista);

         /* zad.2 Napisać program który stworzy Set<Integer> i wprowadzamy 10 liczb z klawiatury
                niech liczby się powtarzają, proszę posortować a następnie wyświetlić zawartość set-a w konsoli
                 a następnie przeiterować i wyświetlić forEach-em (jak wyżej)
         */

        Set<Integer> ser = new ArrayList<>();


    }

}
