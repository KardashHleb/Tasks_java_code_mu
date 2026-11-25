package org.example.level6_8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DashedGroupsStringTest {

    @Test
    void buildsDashedGroups() {
        assertEquals("-1-22-333-4444-55555-", new DashedGroupsString().build());
    }
}
