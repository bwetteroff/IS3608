/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Benjamin;


import java.util.Scanner;

/**
 *
 * @author bpwc0b
 */
public class ATM 
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Press the Enter key for menu: \n");
        accountMenu();
    }
    public void Deposit()
    {
        System.out.println("You are in Deposit");
    }
    public void Withdraw()
    {
        System.out.println("You are in Withdraw");
    }
    public void CheckBalance()
    {
        System.out.println("You are in Check Balance");
    }
    public static void accountMenu()
    {
        Scanner sc = new Scanner(System.in);
        ATM A1 = new ATM();
        boolean quit = false;
        String menuItem;
        do {
            System.out.println("Welcome to your Bank Account:");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Choose menu item: ");
            menuItem = sc.next();
            switch (Integer.parseInt(menuItem)) 
            {
        case 1:
            System.out.println("You have choosen to deposit:");
            A1.Deposit();
        break;
        case 2:
            System.out.println("You have choosen to withdraw:");
            A1.Withdraw();
        break;
        case 3:
            System.out.println("You have choosen to check your balance:");
            A1.CheckBalance();
        break;
              
        case 4:
            quit = true;
        break;
        default:
            System.out.println("Invalid menu choice, please make another selection.");
        }
    } 
    while (!quit);
    System.out.println("Exit");
    }
}



