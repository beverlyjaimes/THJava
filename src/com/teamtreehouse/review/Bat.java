package com.teamtreehouse.review;

public class Bat {

        public static void main(String[] args) {
            System.out.println(sleepIn(true, false));

        }
        public static boolean sleepIn(boolean weekday, boolean vacation) {
            return (vacation) || (!weekday && !vacation);
        }

    }

