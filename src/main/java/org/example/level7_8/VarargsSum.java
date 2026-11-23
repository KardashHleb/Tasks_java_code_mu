package org.example.level7_8;

public class VarargsSum {
    public int sum(int... numbers) {
        int result = 0;
        for (int i = 0; i < numbers.length; i++) {
            result = result + numbers[i];
        }
        System.out.println(result);
        return result;
    }
}
