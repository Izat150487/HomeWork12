package com.peaksoft;

public class Triangle {
    double a;
    double b;
    double c;
    double area() {
        double p = (a + b + c) / 2;
        double s = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        return p;
    }
}