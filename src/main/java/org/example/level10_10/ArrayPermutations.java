package org.example.level10_10;

public class ArrayPermutations {
    public int[][] permute(int[] values) {
        if (values.length > 8) {
            System.out.println("слишком длинный массив");
            return new int[0][];
        }
        int limit = 1;
        for (int i = 2; i <= values.length(); i++) {
            limit = limit * i;
        }
        int[][] result = new int[limit][];
        int[] count = new int[]{0};
        walk(values, 0, result, count);

        for (int i = 0; i < count[0]; i++) {
            for (int j = 0; j < result[i].length; j++) {
                System.out.print(result[i][j]);
                if (j < result[i].length - 1) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        return result;
    }

    private void walk(int[] values, int index, int[][] result, int[] count) {
        if (index == values.length) {
            int[] copy = new int[values.length];
            for (int i = 0; i < values.length; i++) {
                copy[i] = values[i];
            }
            result[count[0]] = copy;
            count[0] = count[0] + 1;
            return;
        }
        for (int i = index; i < values.length; i++) {
            int temp = values[index];
            values[index] = values[i];
            values[i] = temp;
            walk(values, index + 1, result, count);
            temp = values[index];
            values[index] = values[i];
            values[i] = temp;
        }
    }
}
