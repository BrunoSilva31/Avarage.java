package app;

import entities.*;
import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Student stu = new Student();

        System.out.println("Name: ");
        stu.name = sc.nextLine();

        System.out.println("Notes: ");
        stu.grade1 = sc.nextDouble();
        stu.grade2 = sc.nextDouble();
        stu.grade3 = sc.nextDouble();

        System.out.println();
        System.out.printf("Final grade: %.2f", stu.finalGrade());

        System.out.println();
        if(stu.finalGrade() < 60.0) {
            System.out.println("Failed");
            System.out.printf("Missing %.2f points\n", stu.missingPoints());
        } else {
            System.out.println("Approved");
        }


        sc.close();
    }
}