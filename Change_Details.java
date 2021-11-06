//package Main;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

interface Change_Details extends Imp_Functions
{
    default public void change_details(String Account_Number)
    {
        try
        {
            Scanner input = new Scanner(System.in);
            Scanner input2 = new Scanner(System.in);
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
            System.out.println("|     Please select the details which you want to change...                          |");
            System.out.println("|     1. Account Holders Name                                                        |");
            System.out.println("|     2. Username                                                                    |");
            System.out.println("|     3. Password                                                                    |");
            System.out.println("|     4. Date of Birth                                                               |");
            System.out.println("|     5. Mobile Number                                                               |");
            System.out.println("|     6. Aadhaar Number                                                              |");
            System.out.println("|     7. Address                                                                     |");
            System.out.println("|     8. Exit                                                                        |");
            System.out.println("|------------------------------------------------------------------------------------|");

            System.out.print("Please Select Your Choice : ");
            int choice2 = input.nextInt();
            System.out.println("Please Wait...");
            if (choice2 == 1)
            {
                System.out.println("|------------------------------------------------------------------------------------|");
                System.out.print("|     Enter New Name : ");
                String name2 = input2.nextLine();
                System.out.println("|     Name Changed Successfully from " + name + " to " + name2);
                name = name2;
                System.out.println("|------------------------------------------------------------------------------------|");
            }
            else if (choice2 == 2)
            {
                System.out.println("|------------------------------------------------------------------------------------|");
                System.out.print("|     Enter New Username : ");
                String username2 = input.next();
                System.out.println("|     Username Changed Successfully from " + username + " to " + username2);
                username = username2;
                System.out.println("|------------------------------------------------------------------------------------|");
            }
            else if (choice2 == 3)
            {
                System.out.println("|------------------------------------------------------------------------------------|");
                System.out.print("|     Enter New Password : ");
                String password2 = input.next();
                System.out.println("|     Password Changed Successfully from " + password + " to " + password2);
                password = password2;
                System.out.println("|------------------------------------------------------------------------------------|");
            }
            else if (choice2 == 4)
            {
                System.out.println("|------------------------------------------------------------------------------------|");
                System.out.print("|     Enter New Date of Birth (DD/MM/YYYY) : ");
                String dob2 = input.next();
                System.out.println("|     Date of Birth Changed Successfully from " + dob + " to " + dob2);
                dob = dob2;
                System.out.println("|------------------------------------------------------------------------------------|");
            }
            else if (choice2 == 5)
            {
                System.out.println("|------------------------------------------------------------------------------------|");
                System.out.print("|     Enter New Mobile Number : ");
                String mobile2 = input.next();
                System.out.println("|     Mobile Number Changed Successfully from " + mobile + " to " + mobile2);
                mobile = mobile2;
                System.out.println("|------------------------------------------------------------------------------------|");
            }
            else if (choice2 == 6)
            {
                System.out.println("|------------------------------------------------------------------------------------|");
                System.out.print("|     Enter New Aadhaar Number : ");
                String aadhaar2 = input.next();
                System.out.println("|     Aadhaar Number Changed Successfully from " + aadhaar + " to " + aadhaar2);
                aadhaar = aadhaar2;
                System.out.println("|------------------------------------------------------------------------------------|");
            }
            else if (choice2 == 7)
            {
                System.out.println("|------------------------------------------------------------------------------------|");
                System.out.print("|     Enter New Address : ");
                String address2 = input2.nextLine();
                System.out.println("|     Address Changed Successfully to " + address2);
                address = address2;
                System.out.println("|------------------------------------------------------------------------------------|");
            }
            else if (choice2 == 8)
            {
                System.out.println("Exiting...");
               // System.exit(0);
               return ;
            }
            else
            {
                System.out.println("Invalid choice...");
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
