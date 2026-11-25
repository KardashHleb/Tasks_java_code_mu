package org.example.level3_7;

public class RoundToOneDecimal {

    /** Rounds every element of the array to one decimal place. */
    public double[] round(float[] arr) {
        double[] rounded = new double[arr.length];
        for (int i = 0; i < arr.length; i++) {
            rounded[i] = Math.round(arr[i] * 10.0) / 10.0;
        }
        return rounded;
    }
}
