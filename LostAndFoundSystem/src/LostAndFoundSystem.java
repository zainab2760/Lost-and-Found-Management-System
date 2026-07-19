/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author C I S COMPUTERS
 */

import java.util.Scanner;

public class LostAndFoundSystem {

    // Arrays to store item records
    static String[] itemID = new String[100];
    static String[] itemName = new String[100];
    static String[] category = new String[100];
    static String[] status = new String[100];
    static String[] location = new String[100];
    static String[] owner = new String[100];
    static String[] contact = new String[100];

    static int count = 0;

    static Scanner input = new Scanner(System.in);


    public static void main(String[] args) {

        int choice;

        do {

            System.out.println("\n====================================");
            System.out.println(" LOST AND FOUND MANAGEMENT SYSTEM ");
            System.out.println("====================================");

            System.out.println("1. Add Item");
            System.out.println("2. View Items");
            System.out.println("3. Search Item");
            System.out.println("4. Update Item");
            System.out.println("5. Delete Item");
            System.out.println("6. Clear Screen");
            System.out.println("7. Exit");

            System.out.print("Enter your choice: ");
            choice = input.nextInt();


            switch(choice) {

                case 1 -> addItem();

                case 2 -> viewItems();

                case 3 -> searchItem();

                case 4 -> updateItem();

                case 5 -> deleteItem();

                case 6 -> clearScreen();

                case 7 -> System.out.println("Thank you for using the system!");

                default -> System.out.println("Invalid Choice!");

            }

        } while(choice != 7);


    }
   
    public static void addItem() {
        System.out.println("\n--- ADD ITEM ---");

        System.out.print("Enter Item ID: ");
        itemID[count] = input.next();

        System.out.print("Enter Item Name: ");
        itemName[count] = input.next();

        System.out.print("Enter Category: ");
        category[count] = input.next();

        System.out.print("Enter Status (Lost/Found): ");
        status[count] = input.next();

        System.out.print("Enter Location: ");
        location[count] = input.next();

        System.out.print("Enter Owner Name: ");
        owner[count] = input.next();

        System.out.print("Enter Contact Number: ");
        contact[count] = input.next();
        
        count++;

        System.out.println("Item Added Successfully!");
    }





   
    public static void viewItems() {


        System.out.println("\n--- VIEW ITEMS ---");


        if(count == 0) {

            System.out.println("No Records Available!");

        }


        for(int i = 0; i < count; i++) {


            System.out.println("\nItem ID : " + itemID[i]);
            System.out.println("Item Name : " + itemName[i]);
            System.out.println("Category : " + category[i]);
            System.out.println("Status : " + status[i]);
            System.out.println("Location : " + location[i]);
            System.out.println("Owner : " + owner[i]);
            System.out.println("Contact : " + contact[i]);

        }

    }





    
    public static void searchItem() {

        System.out.println("\n--- SEARCH ITEM ---");

        System.out.print("Enter Item ID: ");
        String searchID = input.next();

        boolean found = false;

        for(int i = 0; i < count; i++) {

            if(itemID[i].equals(searchID)) {

                 System.out.println("\nItem Found!");

                System.out.println("Item ID : " + itemID[i]);
                System.out.println("Item Name : " + itemName[i]);
                System.out.println("Category : " + category[i]);
                System.out.println("Status : " + status[i]);
                System.out.println("Location : " + location[i]);
                System.out.println("Owner : " + owner[i]);
                System.out.println("Contact : " + contact[i]);


                found = true;
                break;

            }

        }
        if(found == false) {

            System.out.println("Item Not Found!");

        }
    }





   
    public static void updateItem() {

        System.out.println("\n--- UPDATE ITEM ---");

        System.out.print("Enter Item ID: ");
        String updateID = input.next();

        boolean found = false;

        for(int i = 0; i < count; i++) {

            if(itemID[i].equals(updateID)) {


                System.out.print("Enter New Item Name: ");
                itemName[i] = input.next();

                System.out.print("Enter New Category: ");
                category[i] = input.next();

                System.out.print("Enter New Status: ");
                status[i] = input.next();

                System.out.print("Enter New Location: ");
                location[i] = input.next();

                System.out.print("Enter New Owner: ");
                owner[i] = input.next();

                System.out.print("Enter New Contact: ");
                contact[i] = input.next();


                System.out.println("Item Updated Successfully!");


                found = true;

                break;
            }
        }


        if(found == false) {

            System.out.println("Item Not Found!");

        }


    }





    public static void deleteItem() {


        System.out.println("\n--- DELETE ITEM ---");


        System.out.print("Enter Item ID: ");
        String deleteID = input.next();


        boolean found = false;


        for(int i = 0; i < count; i++) {


            if(itemID[i].equals(deleteID)) {


                for(int j = i; j < count - 1; j++) {


                    itemID[j] = itemID[j+1];
                    itemName[j] = itemName[j+1];
                    category[j] = category[j+1];
                    status[j] = status[j+1];
                    location[j] = location[j+1];
                    owner[j] = owner[j+1];
                    contact[j] = contact[j+1];

                }


                count--;


                System.out.println("Item Deleted Successfully!");


                found = true;

                break;

            }

        }


        if(found == false) {

            System.out.println("Item Not Found!");

        }


    }






    public static void clearScreen() {


        System.out.println("\n\n\n\n\n\n\n\n\n\n");

        System.out.println("Screen Cleared Successfully!");

    }


}