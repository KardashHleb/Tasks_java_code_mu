package org.example.level5_1;

public class XPyramid {
    public String make() {
        String result = "";

        for (int row = 1; row <= 5; row++) {
            if (row > 1) {
                result = result + "\n";
            }
            for (int col = 0; col < row; col++) {
                result = result + "x";
            }
        }

        System.out.println(result);
        return result;
    }
}
