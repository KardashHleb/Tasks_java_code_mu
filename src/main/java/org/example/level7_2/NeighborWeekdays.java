package org.example.level7_2;

import java.time.LocalDate;

public class NeighborWeekdays {
    public String[] days() {
        String[] names = {"", "пн", "вт", "ср", "чт", "пт", "сб", "вс"};
        int current = LocalDate.now().getDayOfWeek().getValue();
        int previous = current - 1;
        if (previous < 1) {
            previous = 7;
        }
        int next = current + 1;
        if (next > 7) {
            next = 1;
        }

        String[] result = {names[previous], names[current], names[next]};
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
        return result;
    }
}
