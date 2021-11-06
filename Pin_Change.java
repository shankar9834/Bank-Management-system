//package Main;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.SQLOutput;
import java.util.Scanner;

interface Pin_Change extends Imp_Functions
{
    default public void pin_change(String Account_Number)
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
            System.out.print("|     Enter your OLD PIN to Change PIN   : ");
            String pin2 = input.next();
            if (compare_string(pin, pin2))
            {
                System.out.print("|     Enter New PIN you want to set      : " );
                String temp1 = input.next();
                System.out.print("|     Please confirm your PIN again      : ");
                String temp2 = input.next();
                if (compare_string(temp1, temp2))
                {
                    pin = temp1;
                    System.out.println("|------------------------------------------------------------------------------------|");
                    System.out.println("|     PIN changed Successfully...                                                    |");
                    System.out.println("|------------------------------------------------------------------------------------|");
                }
                else
                {
                    System.out.println("|------------------------------------------------------------------------------------|");
                    System.out.println("|     Confirmation PIN does not match                                                |");
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

            bf.write(Account_Number);
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
