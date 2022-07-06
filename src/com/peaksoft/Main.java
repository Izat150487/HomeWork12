package com.peaksoft;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Uch burchtuktun uzundugun, biyiktigin jana shirinasyn beriniz:");

        Triangle triangle = new Triangle();
        triangle.a = scanner.nextInt();
        triangle.b = scanner.nextInt();
        triangle.c = scanner.nextInt();

        System.out.println("Uch burchtuktun ayanty -> " + triangle.area());
    }
}
