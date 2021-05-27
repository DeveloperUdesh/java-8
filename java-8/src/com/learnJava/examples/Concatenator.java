package com.learnJava.examples;

import java.util.ArrayList;

public class Concatenator {
    private ArrayList<String> result = new ArrayList<>();

    public ArrayList<String> getResult() {
        return result;
    }

    public void accumulate(String nextLine) {
        if (nextLine != null) {
            int indexOfLastEntry = result.size() - 1;
            if (indexOfLastEntry < 0) {
                result.add(indexOfLastEntry + 1, nextLine);
            } else {
                String current = result.get(indexOfLastEntry);
                if (current.length() == 0)
                    result.add(indexOfLastEntry + 1, nextLine);
                else {
                    char endChar = current.charAt(current.length() - 1);
                    if (endChar == '\\')
                        result.add(indexOfLastEntry, current.substring(0, current.length() - 1) + nextLine);
                    else
                        result.add(indexOfLastEntry + 1, nextLine);
                }
            }
        }
    }

    public void combine(Concatenator other) {
        if (other.result.size() == 0) return;
        if (this.result.size() == 0) {
            this.result = other.result;
            return;
        }
        String current = result.get(result.size() - 1);
        if (current.length() == 0) {
            result.addAll(other.result);
        } else {
            char endChar = current.charAt(current.length() - 1);
            if (endChar == '\\') {
                result.set(result.size() - 1, current.substring(0, current.length() - 1) + other.result.get(0));
                for (int i = 1; i < other.result.size(); i++) {
                    result.add(other.result.get(i));
                }
            } else {
                result.addAll(other.result);
            }
        }

    }
}
