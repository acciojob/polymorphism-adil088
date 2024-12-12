package com.driver;

public class Main {

    static class Product {

        public int product(int x, int y) {
            return x * y;
        }

        public int product(int x, int y, int z) {
            return z * x * y;
        }

        public double product(double x, double y) {
            return x * y;
        }

    }

    public static void main(String[] args) {
        Product p = new Product();

        System.out.println("p1: " + p.product(5, 10));
        System.out.println("p2: " + p.product(5, 10));
        System.out.println("p3: " + p.product(5.66d, 10.33d));

    }
}
