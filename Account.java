//package Main;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class Account implements Imp_Functions
{
    public long create_account()
    {
        Scanner input = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);
        System.out.println("|------------------------------------------------------------------------------------|");
        System.out.println("|                                 CREATE NEW ACCOUNT                                 |");
        System.out.println("|------------------------------------------------------------------------------------|");
        System.out.print("|    Enter Account Holders Name        :    ");
        String Name = input.nextLine();
        System.out.print("|    Enter User Name                   :    ");
        String Username = input.next();
        System.out.print("|    Enter Password                    :    ");
        String Password = input.next();
        System.out.print("|    Enter 4 Digit PIN                 :    ");
        String PIN = input.next();
        System.out.print("|    Enter Initial Deposit             :    ");
        String Balance = input.next();
        System.out.print("|    Enter Mobile Number               :    ");
        String Mobile = input.next();
        System.out.print("|    Enter Aadhaar Number              :    ");
        String Aadhaar = input.next();
        System.out.print("|    Enter Date of Birth (DD/MM/YYYY)  :    ");
        String DOB = input.next();
        System.out.print("|    Enter Permanent Address           :    ");
        String Address = input2.nextLine();
        System.out.println("|------------------------------------------------------------------------------------|");

        long min = 2000000000;
        long max = 2009999999;
       
        long random = (long)(Math.random() * (max - min + 1) + min);
       
        String Account_Number = random + "";
        String file_name = Account_Number;
       
        file_name = file_name + ".txt";

        try
        {
            
            FileWriter fw = new FileWriter(file_name, true);
            BufferedWriter bf = new BufferedWriter(fw);

            bf.write(Account_Number);
            bf.write("\n");

            bf.write(Name);
            bf.write("\n");

            bf.write(Username);
            bf.write("\n");

            bf.write(Password);
            bf.write("\n");

            bf.write(PIN);
            bf.write("\n");

            bf.write(Balance);
            bf.write("\n");

            bf.write(DOB);
            bf.write("\n");

            bf.write(Mobile);
            bf.write("\n");

            bf.write(Aadhaar);
            bf.write("\n");

            bf.write(Address);
            bf.write("\n");

            bf.close();
        }
        catch (Exception e)
        {
            System.out.println("Sorry for the inconvenience cause...");
            System.out.println("We cannot create your account right now, Please try after some time...");
        }
        return random;
    }
}
