/* Scrie un program Java care:
Creează un Vector de numere întregi.
Citește de la tastatură n numere și le adaugă în vector.
Afișează:
toate elementele vectorului,
suma lor,
media aritmetică.*/

import java.util.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Integer> vector = new Vector<>();
        Scanner input = new Scanner(System.in);
        System.out.println("Introduce nr de elemente ");
        int n = input.nextInt();
        for (int i = 0; i < n; i++) {
            int x = input.nextInt();
            vector.add(x);
        }
        System.out.println("Elementele sunt " + vector);
        double sum = 0;
        for (int num : vector) {
            sum = sum + num;
        }
        System.out.println("Suma numerelor este " + sum);

        double sumAritm = sum / vector.size();
        System.out.println("Suma aritmetica a nr este " + sumAritm);
    }
}
