package org.example;

import java.util.*;

public class Main {
    private static final List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
    private static final List<String> words = new ArrayList<>(List.of("fdc", "abc", "abc", "gdk", "opq", "opq", "jdk", "wop", "jdk", "lop"));

    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }
        public static void task1() {
            for (int num:nums) {
                if(num%2!=0){
                    System.out.println(num);

            }

        }
    }

    public static void task2() {
        System.out.println();
        Collections.sort(nums);
        int prevNum = Integer.MIN_VALUE;


        for (int num : nums) {
            if (num % 2 == 0 && num != prevNum) {
                System.out.println(num);
                prevNum=num;
            }
            }
        }
        public static void task3(){
            System.out.println();
            Set<String>uniqueWords= new HashSet<>(words);
            System.out.println(uniqueWords);
        }

        public static void task4(){
            System.out.println();
            Set<String>uniqueWords= new HashSet<>(words);
            System.out.println(words.size()-uniqueWords.size());
        }

    }