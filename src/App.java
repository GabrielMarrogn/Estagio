import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {

            int a = sc.nextInt();
            double nota = 0;
            double carga = 0;
            double total = 0;
            double totalC = 0;

            for (int i = 0; i < a; i++) {
                nota = sc.nextInt();
                carga = sc.nextInt();
                total += (nota * carga);
                totalC += carga;
            }

            totalC *= 100;
            total = total / totalC;

            System.out.printf("%.4f\n", total);
        }

        sc.close();
    }
}
