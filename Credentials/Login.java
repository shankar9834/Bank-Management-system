package Credentials;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

import Requirements.Account;

public class Login extends Account{

    public Login() {
        boolean flag1 = false;
        boolean flag2 = false;
        System.out.print("\n\t\t****************LOGIN PAGE******************");

        System.out.print("\n\t\tEnter your name : ");
        username = str.nextLine();
        System.out.print("\n\t\tEnter your Password : ");
        password = str.nextLine();


        String f = username;
        f = f + ".txt";
        try {

            FileReader fr = new FileReader(f);
            BufferedReader bfr = new BufferedReader(fr);

            String name = bfr.readLine();
            String ps = bfr.readLine();

            bfr.close();

            name = name.trim();
            char arr[] = name.toCharArray();
            char pas[] = ps.toCharArray();
            for (int i = 0; i < username.length(); i++) {
                if (arr[i] != username.charAt(i)) {
                    flag1 = true;
                    break;
                }
            }
            for (int i = 0; i < password.length(); i++) {
                if (pas[i] != password.charAt(i)) {
                    flag2 = true;
                    break;
                }
            }

            if (!flag1 && !flag2) {
                System.out.print("\n\t\tLogged in Succesfully");

                Scanner sc= new Scanner(System.in);
                // steps after logged in to be performed  ---------------------->
                int choice;
                System.out.print("\n\t\tEnter Your Choice : ");
                System.out.print("\n\t\tEnter 1 for Deposit and 2 to Withdraw : ");
                choice = sc.nextInt();
                if(choice==1)
                {
                    Deposit d = new Deposit();
                }
                else if(choice==2)
                {
                    Withdraw w =new Withdraw();
                }
            } else {

                System.out.print("\n\t\tInvalid Credentials ..........");
            }


        } catch (Exception e) {
            System.out.print("\n\t\tNo account found with your name .");

        }


    }
}
