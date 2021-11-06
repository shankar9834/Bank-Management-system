//package Main;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

interface Withdraw extends Imp_Functions
{
    default public void withdraw_amount(String Account_Number)
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
            System.out.print("|     Enter the amount to be Withdrawn  : ");
            long withdraw_amount = input.nextLong();
            System.out.print("|     Enter your 4 digit PIN to confirm : ");
            String pin2 = input.next();
            if (compare_string(pin, pin2))
            {
                long amount = string_to_int(balance);
                if (withdraw_amount < amount)
                {
                    amount = amount - withdraw_amount;
                    balance = int_to_string(amount);
                    System.out.println("|------------------------------------------------------------------------------------|");
                    System.out.println("|     Amount of Rs." + withdraw_amount + "Withdrawn Successfully from your Account" );
                    System.out.println("|     Now, Your Current Balance is : " + balance);
                    System.out.println("|------------------------------------------------------------------------------------|");
                }
                else
                {
                    System.out.println("|------------------------------------------------------------------------------------|");
                    System.out.println("|     No Sufficient Balance to Withdraw Amount of " + withdraw_amount);
                    System.out.println("|------------------------------------------------------------------------------------|");
                }
            }
            else
            {
                System.out.println("|------------------------------------------------------------------------------------|");
                System.out.println("|     Wrong PIN...                                                                   |");
                System.out.println("|------------------------------------------------------------------------------------|");
            }

            FileWriter fw=new FileWriter(file_name, false);
            BufferedWriter bf =new BufferedWriter(fw);

            bf.write(account);
            bf.write("\n");

            bf.write(name);
            bf.write("\n");

            bf.write(username);
            bf.write("\n");

            bf.write(password);
            bf.write("\n");

            bf.write(pin);
            bf.write("\n");

            bf.write(balance);
            bf.write("\n");

            bf.write(dob);
            bf.write("\n");

            bf.write(mobile);
            bf.write("\n");

            bf.write(aadhaar);
            bf.write("\n");

            bf.write(address);
            bf.write("\n");

            bf.close();
        }
        catch (Exception e)
        {
            System.out.println("No Account found with Account Number : " + Account_Number);
        }
    }
}
