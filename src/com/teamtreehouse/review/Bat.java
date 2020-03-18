package com.teamtreehouse.review;

public class Bat {

        public static void main(String[] args) {
            System.out.println(sleepIn(true, false));
            System.out.println(monkeyTrouble(true, false));
            System.out.println(missingChar("Kitten", 3));
            System.out.println(diff21( 3));
            System.out.println(stringTimes("Bev", 3));
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

    public static int diff21(int n) {
        if (n <= 21) {
            return 21 - n;
        } else {
            return (n - 21) * 2;
        }
    }

    public static String stringTimes(String str, int n) {
        String result = "";
        for (int i=0; i<n; i++) {
            result = result + str;  // could use += here
        }
        return result;
    }

    }

