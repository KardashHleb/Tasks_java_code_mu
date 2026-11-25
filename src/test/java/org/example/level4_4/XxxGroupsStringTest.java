package org.example.level4_4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class XxxGroupsStringTest {

    @Test
    void makesGroups() {
        assertEquals("xxx xxx xxx", new XxxGroupsString().make());
    }
}
