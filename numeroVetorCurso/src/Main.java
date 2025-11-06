//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double[] numbers = new double[n];

        for(int i = 0; i<numbers.length;i++){
            sc.nextLine();
            System.out.print("Informe o numero real: ");
            numbers[i] = sc.nextDouble();
        }

        double sum = 0;
        for(int i = 0; i<numbers.length;i++){
            sum+=numbers[i];
        }
        double avg =  sum/numbers.length;
        System.out.println(avg);
        sc.close();
    }
}