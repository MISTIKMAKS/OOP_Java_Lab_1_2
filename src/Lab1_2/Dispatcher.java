package Lab1_2;

import java.lang.Math;
import java.util.Scanner;

public class Dispatcher {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

        double x = 0; // вхідний аргумент
        double a = 0; // вхідний параметр
        double b = 0; // вхідний параметр
        double c = 0; // вхідний параметр
        double F = 0; // результат обчислення виразу
        System.out.print("a = ");
        a = scan.nextDouble();
        System.out.print("b = ");
        b = scan.nextDouble();
        System.out.print("c = ");
        c = scan.nextDouble();
        System.out.print("x = ");
        x = scan.nextDouble();
        // спосіб 1: розгалуження в скороченій формі
        if (x < 0.6 && b + c != 0) {
            F = a * x * x + b * b + c;
        }
        if (x > 0.6 && b + c == 0) {
            F = (x - a) / (x - c);
        }
        if (!(x < 0.6 && b + c != 0) && !(x > 0.6 && b + c == 0)) {
            F = x / c + x / a;
        }
        System.out.println("");
        System.out.println("1) F = " + String.format("%.2f", F));
        // спосіб 2: розгалуження в повній формі
        if (x < 0.6 && b + c != 0)
        {
            F = a * x * x + b * b + c;
        }
        else
        {
            if (x > 0.6 && b + c == 0)
            {
                F = (x - a) / (x - c);
            }
            else
            {
                F = x / c + x / a;
            }
        }
        System.out.println("");
        System.out.println("2) F = " + String.format("%.2f", F));
	}

}