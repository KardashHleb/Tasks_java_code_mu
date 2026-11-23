package org.example.level3_7;

public class RoundToOneDecimal {
    public double[] round(float[] arr) {
        double[] rounded = new double[arr.length];

        for (int i = 0; i < arr.length; i++) {
            rounded[i] = Math.round(arr[i] * 10.0) / 10.0;
            System.out.println(rounded[i]);
        }

        return rounded;
    }
}
