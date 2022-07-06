package ListInterface;


import javax.swing.*;
import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        String choice;
        int option;

        ArrayList<String> billboards = new ArrayList<>();

        System.out.println("****Billboard Collection****");
        System.out.println("Pick four different billboard names");


        billboards.add(input.nextLine());
        billboards.add(input.nextLine());
        billboards.add(input.nextLine());
        billboards.add(input.nextLine());

        System.out.println(billboards);
        System.out.println();
        System.out.println("Congratulations! You have succcessfully inserted four billboards " +
                "\n You can make changes to your input below:");
        System.out.println();


        do {
            System.out.println("Kindly select from  the option below");
            System.out.println();
            System.out.println(">>1: Add a new billboard  <<");
            System.out.println(">>2: Delete a particular billboard <<");
            System.out.println(">>3: Update a billboard  <<");
            System.out.println(">>4: View all billboards <<");
            System.out.println(">>5: Pick billboard to display  <<");
            System.out.println(">>6: Exit <<");
            option = input.nextInt();

            switch (option){
                case 1:
                    System.out.println("Enter new name:");
                    String newName = input.nextLine();
                    billboards.add(newName);
                    System.out.println(billboards);
                    break;

                case 2:
                    System.out.println("Input name of billboard you want to remove");
                    String removedBillboard = input.nextLine();
                    billboards.remove(billboards.indexOf(removedBillboard));
                    System.out.println(billboards);
                    break;

                case 3:
                    System.out.println("Input name of billboard you want to update");
                    String oldName = input.nextLine();
                    System.out.println("Input new name");
                    String update = input.nextLine();
                    billboards.set(billboards.indexOf(oldName), update);
                    System.out.println(billboards);
                    break;

                case 4:
                    for(String bill : billboards){
                        System.out.println(bill);
                    }
                    break;

                case 5:
                    System.out.println("Pick a billboard name");
                    String billboardDisplay = input.nextLine();
                    System.out.println(billboards.get(billboards.indexOf(billboardDisplay)));
                    break;

                case 6:
                    System.exit(0);
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Wrong input");
            }

            choice = input.next();
        }while(choice.equalsIgnoreCase("YES")
                || choice.equalsIgnoreCase("y"));
    }
}