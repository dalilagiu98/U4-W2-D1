import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Please insert the km travelled:");
            double km = Double.parseDouble(scanner.nextLine());
            System.out.println("Please insert the litres consumed:");
            double litres = Double.parseDouble(scanner.nextLine());
            double kmLiter = km / litres;
            if(Double.isInfinite(kmLiter)){
                throw new ArithmeticException("You can not divide a number for 0");
            }
            System.out.println(kmLiter);
        } catch (ArithmeticException e) {
            System.err.println("Insert a number for liter different from 0");
            e.printStackTrace(4);
        } finally {
            scanner.close();
        }
    }

}
