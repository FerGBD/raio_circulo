import java.util.Locale;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        double raio;
        System.out.println("Dê o valor do raio do circulo: ");
        raio = sc.nextDouble();
        double area = Math.pow(raio , 2.0) * 3.14159;
        System.out.printf("A área do círculo com raio é: %.4f%n ", area);


        sc.close();

    }
}