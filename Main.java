//package Main;

import java.io.*;
import java.sql.SQLOutput;
import java.util.Scanner;


public class Main extends Login
{
    public static void main(String[] args) throws IOException
    { 
          Scanner kt=new Scanner(System.in);
          Scanner input = new Scanner(System.in);
          int choice;
        do
        {
            System.out.println("--------------------------------------------------------------------------------------");
            System.out.println("|                               STUDENTS CORPORATE BANK                              |");
            System.out.println("|------------------------------------------------------------------------------------|");
            System.out.println("|    1. Log in to Existing Account                                                   |");
            System.out.println("|    2. Create New Account                                                           |");
            System.out.println("|    3. Exit                                                                         |");
            System.out.println("|------------------------------------------------------------------------------------|");
            System.out.print("\tPlease Select Your Choice : ");
             choice = input.nextInt();
            System.out.println("\tPlease Wait...");

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
                    int choice2=1;
                 do{
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
                    System.out.print("\tPlease Select Your Choice : ");
                     choice2 = input.nextInt();
                    System.out.println("\tPlease Wait...");
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
                        System.out.println("\tLogging Out...");
                        break;
                    }
                    
                    System.out.print("\t Do you want to continue with login page(y/n) : ");
                      char k1=kt.next().charAt(0);
                      if(k1=='n')
                      {
                         choice2=0;
                      }
                      else{
                          choice2=1;
                      }
                    

                   
                } while(choice2==1);
                System.out.print("\tDO you want to continue (y/n)(Home page) : ");
                char ckt=kt.next().charAt(0);;
                if(ckt=='n'||ckt!='y'){  choice =3;} 


            }}
            else if (choice == 2)
            {    
                Account new_account = new Account();
                long Account_Numbe = new_account.create_account();
                System.out.println("\tsuccessfully Created your account ...");
                System.out.println("\tYour Account Number is : " + Account_Numbe);
                System.out.print("\tDO you want to continue(y/n) : ");
                 
                char checkst=kt.next().charAt(0);;
                 if(checkst=='n'||checkst!='y'){  choice =3;}


            }
            else if (choice == 3)
            {
                System.out.println("Exiting...");
               
            }
            else
            {
                System.out.println("Invalid choice...");
                System.out.print("DO you want to continue choose again(y/n) : ");
              
                char ck=kt.next().charAt(0);
                if(ck=='n'||ck!='y'){  choice =3;}
            }
        
    }while(choice!=3);
  }
}