package org.example.level4_4;

import java.util.Collections;

public class XxxGroupsString {

    /** Returns the string "xxx xxx xxx". */
    public String make() {
        return String.join(" ", Collections.nCopies(3, "xxx"));
    }
}
