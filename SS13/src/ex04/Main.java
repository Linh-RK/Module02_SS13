package ex04;

import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number you want to check:");
        int number = Integer.parseInt(scanner.nextLine());
        Map<Integer, String> hashMap1 = new HashMap<>();
        Map<Integer, String> hashMap2 = new HashMap<>();
        hashMap1.put(1,"one");
        hashMap1.put(2,"one");
        hashMap1.put(3,"one");
        hashMap1.put(4,"one");
        hashMap1.put(5,"one");

        hashMap2.putAll(hashMap1);
        if (hashMap2.containsKey(number)) {
            System.out.println("true");
        } else
            System.out.println("false");
    }
}
