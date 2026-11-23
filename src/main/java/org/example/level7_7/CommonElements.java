package org.example.level7_7;

public class CommonElements {
    public int[] common(int[] first, int[] second) {
        int count = 0;

        for (int i = 0; i < first.length; i++) {
            boolean inSecond = false;
            boolean already = false;
            for (int j = 0; j < second.length; j++) {
                if (second[j] == first[i]) {
                    inSecond = true;
                }
            }
            for (int j = 0; j < i; j++) {
                if (first[j] == first[i]) {
                    already = true;
                }
            }
            if (inSecond && !already) {
                count = count + 1;
            }
        }

        int[] result = new int[count];
        int index = 0;

        for (int i = 0; i < first.length; i++) {
            boolean inSecond = false;
            boolean already = false;
            for (int j = 0; j < second.length; j++) {
                if (second[j] == first[i]) {
                    inSecond = true;
                }
            }
            for (int j = 0; j < i; j++) {
                if (first[j] == first[i]) {
                    already = true;
                }
            }
            if (inSecond && !already) {
                result[index] = first[i];
                System.out.println(result[index]);
                index = index + 1;
            }
        }

        return result;
    }
}
