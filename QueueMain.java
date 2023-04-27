package com.bridgelabz.workshop2;

import com.bridgelabz.queue.MyQueue;
import java.util.*;
public class QueueMain {
    private static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {
        Queue<Integer> queue = new Queue<>();
                for (int i = 2; i < 1000; i++) {
                    if (isPrime(i)) {
                        String str1 = String.valueOf(i);
                        char[] charArray1 = str1.toCharArray();
                        Arrays.sort(charArray1);
                        for (int j = i + 1; j < 1000; j++) {
                            if (isPrime(j)) {
                                String str2 = String.valueOf(j);
                                char[] charArray2 = str2.toCharArray();
                                Arrays.sort(charArray2);
                                if (Arrays.equals(charArray1, charArray2)) ;
                                queue.enqueue(i);
                                queue.enqueue(j);
                            }
                        }
                    }
                }


                queue.display();
            }
        }
