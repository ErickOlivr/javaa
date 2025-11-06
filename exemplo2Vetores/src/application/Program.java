package application;

import entities.Product;

import java.util.Locale;
import java.util.Scanner;
public class Program {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("informe o tamanho do vetor: ");
        int n = sc.nextInt();
        Product[] vect = new Product[n];

        sc.nextLine();

        for(int i=0;i<vect.length;i++){
            System.out.print("Informe o nome do objeto: ");
            String name = sc.nextLine();

            System.out.print("Informe o valor : ");
            double price = sc.nextDouble();

            vect[i] = new Product(name,price);
            sc.nextLine();
        }
        for(int i=0;i<vect.length;i++){
            System.out.println(vect[i].getName());
            System.out.println(vect[i].getPrice());
        }

        double sum = 0.0;
        for(int i = 0;i<vect.length;i++){
            sum += vect[i].getPrice();
        }
        double avg = sum / n;
        System.out.println("Media: "+ avg);
        sc.close();
    }
}
