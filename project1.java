//Solomon Astley, CS 0401 Ramirez T, Th 01:00
//Project 1
//This program simulates a customer at Pies, Pies, and Pis

import java.util.*;
import java.text.*;

public class project1
{
    public static void main (String [] args)
    {
        Scanner inScan = new Scanner(System.in);
        NumberFormat formatter = NumberFormat.getCurrencyInstance(Locale.US);
        
        int new_cust = 1;
        int check_out = 2;
        
        double plain_pizza_cost;
        double pep_pizza_cost;
        double pie_slice_cost;
        double charm_cost;
        double whole_pie_cost;
        
        int num_whole_pies;
        int num_extra_slices;
        
        double plain_pizza_tot;
        double pep_pizza_tot;
        double whole_pie_tot;
        double extra_slices_tot;
        double charm_tot;
        double subtotal;
        double total;
        double tax;
        double change;
        double payment;
        
        do {
            int num_plain_pizzas = 0;
            int num_pep_pizzas = 0;
            int num_pie_slices = 0;
            int num_charms = 0;
            int plain_pizza_change;
            int pep_pizza_change;
            int pie_slice_change;
            int charm_change;
            
            //Defines check_out variable so do-while loop will run until user checks out
            check_out = 2;
            
            System.out.println("Hi, welcome to Pies, Pies and Pis");
            System.out.println("Is there another customer in line? (1 = yes, 2 = no)");
            
            //asks if there is a new customer
            new_cust = inScan.nextInt();
            //breaks out of loop if no new customer
            if (new_cust == 2)
                break;
            //makes sure user enters valid response
            else if (new_cust != 1)
            {
                while (new_cust != 1 && new_cust != 2)
                {
                    System.out.println("Hi, welcome to Pies, Pies and Pis");
                    System.out.println("Is there another customer in line? (1 = yes, 2 = no)");
                    new_cust = inScan.nextInt();
                }
            }
            //makes sure user did not enter 2 after an error the first time
            if (new_cust == 2)
                break;
            
            System.out.println("Are you a pi card member? (1 = yes, 2 = no)");
            int pi_card = inScan.nextInt();
            
            //makes sure user enters valid value for pi_card
            if (pi_card != 1 && pi_card != 2)
            {
                while (pi_card != 1 && pi_card != 2)
                {
                    System.out.println("Are you a pi card member? (1 = yes, 2 = no)");
                    pi_card = inScan.nextInt();
                }
            }
            //if user has a pi card, executes
            if (pi_card == 1)
            {
                plain_pizza_cost = 10.00;
                pep_pizza_cost = 10.00;
                pie_slice_cost = 1.75;
                charm_cost = 45.00;
                whole_pie_cost = 8.00;
                
                System.out.println("Welcome back, pi card holder!");
                System.out.println("You will receive:");
                System.out.println("Pepperoni pizza for the price of plain");
                System.out.println("$0.25 off a slice of cherry pie");
                System.out.println("$2.00 off of a whole cherry pie");
                System.out.println("10% off of each pi charm");
                System.out.println("10% off of entire order if over $100.00");
                System.out.println();
            }
            //if user does not have a pi card, executes
            else {
                plain_pizza_cost = 10.00;
                pep_pizza_cost = 12.00;
                pie_slice_cost = 2.00;
                charm_cost = 50.00;
                whole_pie_cost = 10.00;
            }
            
            //do-while loop for user to update order as much as they want
            do {
                System.out.println("Please choose an option:");
                System.out.println("1.) Update Pizza Order");
                System.out.println("2.) Update Pie Order");
                System.out.println("3.) Update Charm Order");
                System.out.println("4.) Check out");
                
                int user_choice = inScan.nextInt();
                while (user_choice != 1 && user_choice != 2 && user_choice != 3 && user_choice != 4)
                {
                    System.out.println("Please choose an option:");
                    System.out.println("1.) Update Pizza Order");
                    System.out.println("2.) Update Pie Order");
                    System.out.println("3.) Update Charm Order");
                    System.out.println("4.) Check out");
                
                    user_choice = inScan.nextInt();
                }
                
                if (user_choice == 1)
                {
                    System.out.println("Your current plain pizza order is: " + num_plain_pizzas);
                    System.out.println("How many plain pizzas would you like for " + formatter.format(plain_pizza_cost) + "?");
                    plain_pizza_change = inScan.nextInt();
                    while (plain_pizza_change < 0) {
                        System.out.println("How many plain pizzas would you like for " + formatter.format(plain_pizza_cost) + "?");
                        plain_pizza_change = inScan.nextInt();
                    }
                    num_plain_pizzas += plain_pizza_change;
                    
                    System.out.println("Your current pepperoni pizza order is: " + num_pep_pizzas);
                    System.out.println("How many pepperoni pizzas would you like for " + formatter.format(pep_pizza_cost) + "?");
                    pep_pizza_change = inScan.nextInt();
                    while (pep_pizza_change < 0) {
                        System.out.println("How many pep pizzas would you like for " + formatter.format(pep_pizza_cost) + "?");
                        pep_pizza_change = inScan.nextInt();
                    }
                    num_pep_pizzas += pep_pizza_change;
                }
                else if (user_choice == 2) {
                    System.out.println("Your current pie order is: " + num_pie_slices);
                    System.out.println("How many slices of pie would you like for " + formatter.format(pie_slice_cost) + "?");
                    pie_slice_change = inScan.nextInt();
                    while (pie_slice_change < 0) {
                        System.out.println("How many slices of pie would you like for " + formatter.format(pie_slice_cost) + "?");
                        pie_slice_change = inScan.nextInt();
                    }
                    num_pie_slices += pie_slice_change;
                }
                else if (user_choice == 3) {
                    System.out.println("Your current pi charm order is: " + num_charms);
                    System.out.println("How many pi charms would you like for " + formatter.format(charm_cost) + "?");
                    charm_change = inScan.nextInt();
                    while (charm_change < 0) {
                        System.out.println("How many pi charms would you like for " + formatter.format(charm_cost) + "?");
                        charm_change = inScan.nextInt();
                    }
                    num_charms += charm_change;
                }
                //if user does not select 1, 2, or 3, check_out changes to 1 and do-while loop ends
                else {
                    check_out = 1;
                }
                
            } while (check_out == 2);
            
            //calculates number of whole pies and number of remaining slices
            num_whole_pies = num_pie_slices / 6;
            num_extra_slices = num_pie_slices % 6;
            
            //calculating total money owed for each kind of item
            plain_pizza_tot = num_plain_pizzas * plain_pizza_cost;
            pep_pizza_tot = num_pep_pizzas * pep_pizza_cost;
            whole_pie_tot = num_whole_pies * whole_pie_cost;
            extra_slices_tot = num_extra_slices * pie_slice_cost;
            charm_tot = num_charms * charm_cost;
            
            System.out.println("Here is your subtotal:");
            
            //if user ordered any of a particular item, that item and its value are displayed
            if (num_plain_pizzas > 0) {
                System.out.print(num_plain_pizzas + " plain pizza(s) at " + formatter.format(plain_pizza_cost));
                System.out.println("\t \t " + formatter.format(plain_pizza_tot));
            }
            if (num_pep_pizzas > 0) {
                System.out.print(num_pep_pizzas + " pepperoni pizza(s) at " + formatter.format(pep_pizza_cost));
                System.out.println("\t \t " + formatter.format(pep_pizza_tot));
            }
            if (num_whole_pies > 0) {
                System.out.print(num_whole_pies + " whole cherry pie(s) at " + formatter.format(whole_pie_cost));
                System.out.println("\t \t " + formatter.format(whole_pie_tot));
            }
            if (num_extra_slices > 0) {
                System.out.print(num_extra_slices + " cherry pie slice(s) at " + formatter.format(pie_slice_cost));
                System.out.println("\t \t " + formatter.format(extra_slices_tot));
            }
            if (num_charms > 0) {
                System.out.print(num_charms + " 14K gold pi charm(s) at " + formatter.format(charm_cost));
                System.out.println("\t \t " + formatter.format(charm_tot));
            }
            
            //totals the user's bill
            subtotal = plain_pizza_tot + pep_pizza_tot + whole_pie_tot + extra_slices_tot + charm_tot;
            
            //if user has a pi card and total is above $100, user gets `0% discount
            if (pi_card == 1 && subtotal > 100.0) {
                subtotal = subtotal * 0.9;
            }
            
            //calculates tax and new total
            tax = subtotal * 0.07;
            total = subtotal + tax;
            
            //formatted for nice output in command prompt... displays subtotal, tax, and total
            System.out.println("\t \t \t \t \t --------");
            System.out.println("Subtotal: \t \t \t \t " + formatter.format(subtotal));
            System.out.println("Tax: \t \t \t \t \t " + formatter.format(tax));
            System.out.println("\t \t \t \t \t --------");
            System.out.println("Total: \t \t \t \t \t " + formatter.format(total));
            System.out.println();
            
            //prompts user for payment and does not accept less than cost of bill
            System.out.print("Please enter your payment amount: \t $");
            payment = inScan.nextDouble();
            while (payment < total) {
                System.out.print("Please enter your payment amount: \t $");
                payment = inScan.nextDouble();
            }
            
            //calculates change and displays it to the screen
            change = payment - total;
            System.out.println("Here is your change: \t \t \t " + formatter.format(change));
            System.out.println("Thank you!");
            System.out.println();
            //runs loop until there are no new customers
        } while (new_cust == 1);
    }
}