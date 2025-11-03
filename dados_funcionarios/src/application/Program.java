package application;

import entities.Enployee;

import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Enployee enployee;

        enployee = new Enployee();
        System.out.print("Name: ");
        enployee.name = sc.next();

        System.out.print("Gross salary: ");
        enployee.grossSalary = sc.nextDouble();

        System.out.print("Tax: ");
        enployee.tax = sc.nextDouble();

        System.out.println(enployee);

        System.out.print("Which percentage to increase salary? ");
        double percentage = sc.nextDouble();
        enployee.increaseSalary(percentage);

        System.out.println("Updated data: " + enployee);

        sc.close();
    }
}
