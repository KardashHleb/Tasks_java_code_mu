package org.example.level2_4;

public class SquareRootsSum {
    public double sumSquareRoots(int[] arr) {
        double sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum = sum + Math.sqrt(arr[i]);
        }

        System.out.println(sum);
        return sum;
    }
}
