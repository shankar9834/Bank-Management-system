package Credentials;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

import Requirements.Account;

public class Withdraw extends Account {
    public int wamount;
    Scanner sc= new Scanner(System.in);
           public Withdraw(){
               System.out.print("\n\t\tEnter your Username : ");
               username = str.nextLine();
               System.out.print("\n\t\tEnter Amount to be Withdrawn : ");
               wamount = sc.nextInt();
               String f = username;
               f = f + ".txt";
               try {

                   FileReader fr = new FileReader(f);
                   BufferedReader bfr = new BufferedReader(fr);

                   String name = bfr.readLine();
                   String pass = bfr.readLine();
                   String accNo = bfr.readLine();
                   String bal = bfr.readLine();
                   String mob = bfr.readLine();
                   String add = bfr.readLine();
                   String dob = bfr.readLine();
                   String adNo = bfr.readLine();
                   bfr.close();
                   //converting string Bal to int for further calculations
                   int newbal=Integer.parseInt(bal);
                   if(wamount<=newbal)
                   {
                       newbal=newbal-wamount;
                       System.out.println("\n\t\t"+wamount+" Rs are withdrawn from account no. "+accNo);
                       System.out.println("\n\t\t Your Current Account Balance is "+newbal);
                       //converting int newbal to again string so that it can be added in file again
                       bal=Integer.toString(newbal);
                   }
                   else
                   {
                       System.out.println("\n\t\t You do not have enough Account Balance");
                       System.out.println("\n\t\t Please check your current Account Balance before Withdrawl");
                   }
                   username=name;
                   password=pass;
                   AccountNum=accNo;
                   balance=bal;
                   mobileNum=mob;
                   Address=add;
                   DateOfBirth=dob;
                   AdharNUmber=adNo;

                   FileWriter fw=new FileWriter(f,false);
                   BufferedWriter bf =new BufferedWriter(fw);
                   bf.write(username);
                   bf.write("\n");
                   bf.write(password);
                   bf.write("\n");
                   bf.write(AccountNum);

                   bf.write("\n");
                   bf.write(balance);
                   bf.write("\n");
                   bf.write(mobileNum);


                   bf.write("\n");
                   bf.write(Address);
                   bf.write("\n");
                   bf.write(DateOfBirth);
                   bf.write("\n");

                   bf.write(AdharNUmber);
                   bf.write("\n");
                   bf.close();


               }
               catch (Exception e) {
                   System.out.print("\n\t\tNo account found with your name .");

               }

           }
}


