package ru.samsung.itschool.mdev;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line;

        TreeMap<String, TreeMap<String,Integer>> sales = new TreeMap<>();

        while(scanner.hasNextLine()) {
            // Ivanov paper 10
            line = scanner.nextLine();
            String[] input = line.split(" ");
            //Integer.parseInt(input[2])

            if(sales.containsKey(input[0])) {
                TreeMap<String,Integer> user = sales.get(input[0]);
                if(user.containsKey(input[1])) {
                    user.put(input[1],user.get(input[1]) + Integer.parseInt(input[2]));
                } else {
                    user.put(input[1],Integer.parseInt(input[2]));
                }
            } else {
                TreeMap<String,Integer> product = new TreeMap<>();
                product.put(input[1],Integer.parseInt(input[2]));
                sales.put(input[0],product);
            }
        }
        for (Map.Entry e: sales.entrySet()) {
            System.out.println(e.getKey() + ": ");
            TreeMap<String, Integer> user = (TreeMap) e.getValue();
            for (Map.Entry e1 : user.entrySet()) {
                System.out.println(e1.getKey() + " " +e1.getValue());
            }
        }
    }
}
