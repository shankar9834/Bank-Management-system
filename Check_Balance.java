//package Main;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

interface Check_Balance extends Imp_Functions
{
    default public void check_balance(String Account_Number)
    {
        try
        {
            Scanner input = new Scanner(System.in);
            String file_name = Account_Number;
            file_name = file_name + ".txt";
            FileReader fr = new FileReader(file_name);
            BufferedReader bfr = new BufferedReader(fr);

            String account = bfr.readLine();
            String name = bfr.readLine();
            String username = bfr.readLine();
            String password = bfr.readLine();
            String pin = bfr.readLine();
            String balance = bfr.readLine();
            String dob = bfr.readLine();
            String mobile = bfr.readLine();
            String aadhaar = bfr.readLine();
            String address = bfr.readLine();
            bfr.close();

            System.out.println("");
            System.out.println("--------------------------------------------------------------------------------------");
            System.out.println("|                               STUDENTS CORPORATE BANK                              |");
            System.out.println("|------------------------------------------------------------------------------------|");
            System.out.println("|     WELCOME...   " + name);
            System.out.print("|     Enter your 4 digit PIN to confirm : ");
            String pin2 = input.next();
            if (compare_string(pin, pin2))
            {
                System.out.println("|------------------------------------------------------------------------------------|");
                System.out.println("|     Your Current Balance is : " + balance);
                System.out.println("|------------------------------------------------------------------------------------|");
            }
            else
            {
                System.out.println("|------------------------------------------------------------------------------------|");
                System.out.println("|     Wrong PIN...                                                                   |");
                System.out.println("|------------------------------------------------------------------------------------|");
            }
        }
        catch (Exception e)
        {
            System.out.println("No Account found with Account Number : " + Account_Number);
        }
    }
}
