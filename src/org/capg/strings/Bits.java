package org.capg.strings;

import java.util.StringJoiner;

/**
 *
 * @author Dibyanand
 */
public class Bits {

    public static void main(String[] args) {

        // StringJoiner
        StringJoiner sj = new StringJoiner(", ", "{", "}");
        sj.add("one").add("two");
        
        
        System.out.println(sj.toString());
    }
}
