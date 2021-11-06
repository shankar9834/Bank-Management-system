//package Main;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;
import java.util.zip.Adler32;

public interface Show_Details extends Imp_Functions
{
    default public void show_details(String Account_Number)
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
            System.out.println("|     Showing Account Holders Details...                                             |");
            System.out.println("|------------------------------------------------------------------------------------|");
            System.out.println("|     Account Number            :   " + account);
            System.out.println("|     Account Holders Name      :   " + name);
            System.out.println("|     Username                  :   " + username);
            System.out.println("|     Date of Birth             :   " + dob);
            System.out.println("|     Mobile Number             :   " + mobile);
            System.out.println("|     Aadhaar Number            :   " + aadhaar);
            System.out.println("|     Address                   :   " + address);
            System.out.println("|     Current Balance           :   " + balance);
            System.out.println("|------------------------------------------------------------------------------------|");
        }
        catch (Exception e)
        {
            System.out.println("No Account found with Account Number : " + Account_Number);
        }
    }
}
