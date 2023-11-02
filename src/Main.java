//Сложить два многочлена заданной степени, если коэффициенты многочленов хранятся в объекте HashMap.
import java.util.Scanner;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите степень многочлена");
        Scanner sk = new Scanner(System. in );
        int n = sk.nextInt();
        HashMap<Integer, Integer> koef = new HashMap<Integer, Integer>(n);
        HashMap<Integer, Integer> koef2 = new HashMap<Integer, Integer>(n);
        System.out.println("Коэффициенты первого многочлена");
        for (int i = 0; i<=n; i++){
            koef.put(i, (Integer) sk.nextInt());
        }
        System.out.println("Коэффициенты второго многочлена");
        for (int i = 0; i<=n; i++){
            koef2.put(i, (Integer) sk.nextInt());
        }
        System.out.println("Сумма коэффициентов нового многочлена");
        for (int i = 0; i<=n; i++){
            System.out.println((Integer)koef.get(i) + (Integer)koef2.get(i));
        }
    }
}