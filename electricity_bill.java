package Aanand;

import java.util.Scanner;

public class electricity_bill {
    public static void main(String[] args) {
        double total=0, unit;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the total unit :");
        unit = sc.nextInt();
        if (unit <= 50) {
            total = unit * (0.50);
        } else if (unit > 50 && unit <= 150) {
            total = 50 * 0.50 ;
            total=total+((unit - 50) * 0.75);
        } else if (unit > 50 && unit > 150 && unit <= 250) {
            total = (50 * 0.50) + (100 * 0.75) + ((unit - 150) * 1.20);
        } else if (unit > 50 && unit > 150 && unit > 250) {
            total = (50 * 0.50) + (100 * 0.75) + (100 * 1.20)+((unit-250)*1.50);
        }
        total=total+((total*20)/100);
        System.out.println("Your bill for "+unit+" units is "+total+" with 20% tax");
    sc.close();
    }
}
