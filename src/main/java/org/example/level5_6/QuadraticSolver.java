package org.example.level5_6;

public class QuadraticSolver {
    public double[] solve(double a, double b, double c) {
        System.out.println("Введите три коэффициента");
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        if (a == 0) {
            if (b == 0) {
                System.out.println("Это не уравнение с неизвестным");
                return new double[0];
            }
            double root = -c / b;
            System.out.println(root);
            return new double[]{root};
        }

        double discriminant = b * b - 4 * a * c;

        if (discriminant < 0) {
            System.out.println("Действительных корней нет");
            return new double[0];
        }

        if (discriminant == 0) {
            double root = -b / (2 * a);
            System.out.println(root);
            return new double[]{root};
        }

        double sqrt = Math.sqrt(discriminant);
        double first = (-b + sqrt) / (2 * a);
        double second = (-b - sqrt) / (2 * a);
        System.out.println(first);
        System.out.println(second);
        return new double[]{first, second};
    }
}
