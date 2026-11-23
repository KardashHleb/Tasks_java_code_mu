package org.example.level10_3;

public class LuckyDigitTicket {
    public boolean can(int[] digits) {
        if (digits.length != 6) {
            System.out.println(false);
            return false;
        }

        int[] order = new int[6];
        for (int i = 0; i < order.length; i++) {
            order[i] = digits[i];
        }
        boolean[] found = new boolean[]{false};
        permute(order, 0, found);
        System.out.println(found[0]);
        return found[0];
    }

    private void permute(int[] digits, int index, boolean[] found) {
        if (found[0]) {
            return;
        }
        if (index == digits.length) {
            int left = digits[0] + digits[1] + digits[2];
            int right = digits[3] + digits[4] + digits[5];
            if (left == right) {
                found[0] = true;
            }
            return;
        }
        for (int i = index; i < digits.length; i++) {
            int temp = digits[index];
            digits[index] = digits[i];
            digits[i] = temp;
            permute(digits, index + 1, found);
            temp = digits[index];
            digits[index] = digits[i];
            digits[i] = temp;
        }
    }
}
