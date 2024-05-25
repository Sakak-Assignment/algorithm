package com.sakak.algorithm;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public String solution(int n) {
        List<String> antSequences = initAntSequences();
        for (int i = 1; i < n; i++) {
            antSequences.add(getAntSequenceAfterCompress(antSequences.get(i - 1)));
        }
        return getMiddleOfAntSequence(antSequences.get(n - 1));
    }

    public List<String> initAntSequences() {
        List<String> antSequences = new ArrayList<>();
        antSequences.add("1");
        return antSequences;
    }

    public String getAntSequenceAfterCompress(String antSequence) {
        char countingLetter = antSequence.charAt(0);
        int count = 1;
        StringBuilder antSequenceAfterCompress = new StringBuilder();
        for (int i = 1; i < antSequence.length(); i++) {
            if (countingLetter != antSequence.charAt(i)) {
                antSequenceAfterCompress.append(count).append(countingLetter);
                count = 0;
            }
            countingLetter = antSequence.charAt(i);
            count++;
        }
        antSequenceAfterCompress.append(count).append(countingLetter);
        return antSequenceAfterCompress.toString();
    }

    public String getMiddleOfAntSequence(String antSequence) {
        return antSequence.substring(antSequence.length() / 2 - 1, antSequence.length() / 2 + 1);
    }

}
