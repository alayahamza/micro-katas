package com.katas;

import java.util.stream.Collectors;

public class DnaStrand {

    public static String makeComplement(String dna) {
        return dna.codePoints()
                .mapToObj(c -> String.valueOf((char) c))
                .map(DnaStrand::replaceString)
                .collect(Collectors.joining());
    }

    public static String replaceString(String str) {
        switch (str) {
            case "A":
                return "T";
            case "T":
                return "A";
            case "C":
                return "G";
            case "G":
                return "C";
            default:
                return str;
        }
    }
}
