package Lab1_2;

import java.lang.Math;
import java.util.Scanner;

public class Dispatcher {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

        double x = 0; // ������� ��������
        double a = 0; // ������� ��������
        double b = 0; // ������� ��������
        double c = 0; // ������� ��������
        double F = 0; // ��������� ���������� ������
        System.out.print("a = ");
        a = scan.nextDouble();
        System.out.print("b = ");
        b = scan.nextDouble();
        System.out.print("c = ");
        c = scan.nextDouble();
        System.out.print("x = ");
        x = scan.nextDouble();
        // ����� 1: ������������ � ���������� ����
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
        // ����� 2: ������������ � ������ ����
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