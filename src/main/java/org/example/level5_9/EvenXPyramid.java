package org.example.level5_9;

public class EvenXPyramid {
    public String make() {
        String result = "";

        for (int count = 2; count <= 10; count = count + 2) {
            if (count > 2) {
                result = result + "\n";
            }
            for (int i = 0; i < count; i++) {
                result = result + "x";
            }
        }

        System.out.println(result);
        return result;
    }
}
