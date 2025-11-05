package application;

import entities.Product;

import java.util.Locale;
import java.util.Scanner;
public class Program {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Product[] vect = new Product[n];

        sc.nextLine();

        for(int i=0;i<n;i++){
            System.out.print("Informe o nome do objeto: ");
            String name = sc.nextLine();

            System.out.print("Informe o valor : ");
            double price = sc.nextDouble();

            vect[i] = new Product(name,price);
            sc.nextLine();
        }
        for(int i=0;i<n;i++){
            System.out.println(vect[i].getName());
            System.out.println(vect[i].getPrice());
        }
        sc.close();
    }
}
