package Main;

import java.io.*;
import java.sql.SQLOutput;
import java.util.Scanner;


public class Main extends Login
{
    public static void main(String[] args) throws IOException
    {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 1; i++)
        {
            System.out.println("--------------------------------------------------------------------------------------");
            System.out.println("|                               STUDENTS CORPORATE BANK                              |");
            System.out.println("|------------------------------------------------------------------------------------|");
            System.out.println("|    1. Log in to Existing Account                                                   |");
            System.out.println("|    2. Create New Account                                                           |");
            System.out.println("|    3. Exit                                                                         |");
            System.out.println("|------------------------------------------------------------------------------------|");
            System.out.print("Please Select Your Choice : ");
            int choice = input.nextInt();
            System.out.println("Please Wait...");

            if (choice == 1)
            {
                Login login = new Login();
                String Account_Number = login.LogIn_to_existing_Account();

                if (!(login.compare_string(Account_Number, "-1")))
                {
                    String file_name = Account_Number;
                    file_name = file_name + ".txt";
                    FileReader fr = new FileReader(file_name);
                    BufferedReader bfr = new BufferedReader(fr);
                    String abc = bfr.readLine();
                    String Name = bfr.readLine();
                    bfr.close();

                    System.out.println("");
                    System.out.println("--------------------------------------------------------------------------------------");
                    System.out.println("|                               STUDENTS CORPORATE BANK                              |");
                    System.out.println("|------------------------------------------------------------------------------------|");
                    System.out.println("     WELCOME...   " + Name);
                    System.out.println("|------------------------------------------------------------------------------------|");
                    System.out.println("|    1. Check Balance                                                                |");
                    System.out.println("|    2. Withdraw Amount                                                              |");
                    System.out.println("|    3. Deposit Amount                                                               |");
                    System.out.println("|    4. Change PIN                                                                   |");
                    System.out.println("|    5. Change Details                                                               |");
                    System.out.println("|    6. Show Details                                                                 |");
                    System.out.println("|    7. LOGOUT and Exit                                                              |");
                    System.out.println("|------------------------------------------------------------------------------------|");
                    System.out.print("Please Select Your Choice : ");
                    int choice2 = input.nextInt();
                    System.out.println("Please Wait...");
                    if (choice2 == 1)
                    {
                        Check_Balance check = new User();
                        check.check_balance(Account_Number);
                    }
                    else if (choice2 == 2)
                    {
                        Withdraw withdraw = new User();
                        withdraw.withdraw_amount(Account_Number);
                    }
                    else if (choice2 == 3)
                    {
                        Deposit deposit = new User();
                        deposit.deposit_amount(Account_Number);
                    }
                    else if (choice2 == 4)
                    {
                        Pin_Change pin_change = new User();
                        pin_change.pin_change(Account_Number);
                    }
                    else if (choice2 == 5)
                    {
                        Change_Details change_details= new User();
                        change_details.change_details(Account_Number);
                    }
                    else if (choice2 == 6)
                    {
                        Show_Details show_details = new User();
                        show_details.show_details(Account_Number);
                    }
                    else if (choice2 == 7)
                    {
                        System.out.println("Logging Out...");
                        System.exit(0);
                    }
                    else
                    {
                        System.out.println("Invalid choice...");
                    }
                }
            }
            else if (choice == 2)
            {
                Account new_account = new Account();
                long Account_Number = new_account.create_account();
                System.out.println("Your account is successfully Created...");
                System.out.println("Your Account Number is : " + Account_Number);
            }
            else if (choice == 3)
            {
                System.out.println("Exiting...");
                System.exit(0);
            }
            else
            {
                System.out.println("Invalid choice...");
            }
        }
    }
}