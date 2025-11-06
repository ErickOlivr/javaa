import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] numbersNegatives = new int[n];

        for(int i =0;i<numbersNegatives.length;i++){
            sc.nextLine();
            numbersNegatives[i] = sc.nextInt();
        }

        for(int i =0;i<numbersNegatives.length;i++){
            if(numbersNegatives[i]<0){
                System.out.println(numbersNegatives[i]);
            }
        }

        sc.close();
    }
}