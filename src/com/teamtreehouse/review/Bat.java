package com.teamtreehouse.review;

public class Bat {

        public static void main(String[] args) {
            System.out.println(sleepIn(true, false));
            System.out.println(monkeyTrouble(true, false));
            System.out.println(missingChar("Kitten", 3));

        }
        public static boolean sleepIn(boolean weekday, boolean vacation) {
            return (vacation) || (!weekday && !vacation);
        }

        public static boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        if (aSmile && bSmile) {
            return true;
        }
        if (!aSmile && !bSmile) {
            return true;
        }
        return false;
    }

    public static String missingChar(String str, int n) {
        String front = str.substring(0, n);

        String back = str.substring(n + 1, str.length());

        return front + back;
    }


    }

