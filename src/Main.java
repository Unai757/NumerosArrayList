import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.println("¿Cuantos numeros quieres añadir?");
        int n = sc.nextInt();

    List<Integer> lista = new ArrayList<>();
    for (int i = 1; i <= n; i++) {
        System.out.println("Introduce el numero que quiera añadir:");
        lista.add(sc.nextInt());
    }
    System.out.println("Lista con numeros negativos incluidos");
    System.out.println(lista);

    System.out.println("Lista sin numeros negativos");
    Iterator<Integer> it = lista.iterator();
    while (it.hasNext()) {
        //Metemos it.next() en una variable numero para que no nos de un error
        int numero=it.next();

        if (numero<0) {
            it.remove();
        }


    }
    //Mostramos la lista sin numeros negativos
        System.out.println("Lista sin numeros negativos");
        System.out.println(lista);

    }
}