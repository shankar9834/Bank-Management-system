//package Main;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class Login extends Account implements Imp_Functions
{
    public String LogIn_to_existing_Account()
    {
        Scanner input = new Scanner(System.in);

        System.out.println("|------------------------------------------------------------------------------------|");
        System.out.println("|                             LOG IN TO EXISTING ACCOUNT                             |");
        System.out.println("|------------------------------------------------------------------------------------|");

        boolean flag1;
        boolean flag2;

        System.out.print("|    Enter Account Number              :    ");
        String Account_Number = input.next();
        System.out.print("|    Enter User Name                   :    ");
        String Username = input.next();
        System.out.print("|    Enter Password                    :    ");
        String Password = input.next();
        System.out.println("|------------------------------------------------------------------------------------|");



        String file_name = Account_Number;
        file_name = file_name + ".txt";

        try
        {
            FileReader fr = new FileReader(file_name);
            BufferedReader bfr = new BufferedReader(fr);

            String Account = bfr.readLine();
            String Name = bfr.readLine();
            String User = bfr.readLine();
            String Pass = bfr.readLine();
            bfr.close();

            flag1 = compare_string(Username, User);
            flag2 = compare_string(Password, Pass);

            if (flag1 && flag2)
            {
                System.out.println("Logged in Successfully...");
                return Account_Number;
            }
            else
            {
                System.out.println("Invalid Credentials...");
                return "-1";
            }
        }
       
        catch (Exception e)         
        {
            System.out.println("No Account found with Account Number : " + Account_Number);
            return "-1";
        }
   
   
    }
}
