package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Task #1
        Vowel vowels = new Vowel();
        int result = vowels.countVowel("Hello");
        System.out.println("ამ სტრიქონში არის " + result + " ხმოვანი");

        // Task #2
        Symbol symbolReplaced = new Symbol();
        String newString1 = symbolReplaced.replaceSymbolA("Lela");
        String newString2 = symbolReplaced.replaceSymbolB("Gabelaia");
        System.out.println(newString1 + " " + newString2);

        // Task #3 Array Sorting
        // Bubble Sort ალგორითმი გამოვიყენე
        int [] arr = {18, -3, 5, -7, 6, 89, 13, 0, -89};
        int n = arr.length;
        for (int i = 0; i < n-1; i++){
            for (int j = 0; j < n-i-1; j++){
                if (arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println("Sorted Array: " + Arrays.toString(arr));
    }
}