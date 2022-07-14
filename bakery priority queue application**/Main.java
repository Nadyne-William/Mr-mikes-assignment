package bakery;

import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        PriorityQueue<Double> bread = new PriorityQueue<>();


        int count = 0;
        System.out.println("Insert current amount of bread: ");
        int amountOfGoods = input.nextInt();
        System.out.println("Enter manufacture time");
        while (count < amountOfGoods) {
            double manufactTime = input.nextDouble();
            Bread bb = new Bread(manufactTime);
            bread.add(manufactTime);
            count++;
        }

        System.out.println(bread);

        String newLog;
        do {
            System.out.println("****Bakery details****");
            System.out.println("Input number of bread bought");
            int noOfBreadBought = input.nextInt();
            for (count = 0; count < noOfBreadBought; count++) {
                bread.poll();
            }
            if (bread.isEmpty()) {
                System.out.println("Sold out");
            } else
                System.out.println(bread);
        }
        while (!bread.isEmpty());
    }
}
