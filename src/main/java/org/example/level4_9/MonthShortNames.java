package org.example.level4_9;

public class MonthShortNames {
    public String[] toNames(byte[] months) {
        String[] names = {
                "янв", "фев", "мар", "апр", "май", "июн",
                "июл", "авг", "сен", "окт", "ноя", "дек"
        };
        String[] result = new String[months.length];

        for (int i = 0; i < months.length; i++) {
            result[i] = names[months[i] - 1];
            System.out.println(result[i]);
        }

        return result;
    }
}
