package Credentials;

import Requirements.Account;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class Deposit extends Account {
    public int damount;
    Scanner sc= new Scanner(System.in);
    public Deposit(){
        System.out.print("\n\t\tEnter your Username : ");
        username = str.nextLine();
        System.out.print("\n\t\tEnter Amount to be Deposited : ");
        damount = sc.nextInt();
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
            newbal=newbal+damount;
            System.out.println("\n\t\t"+damount+" Rs Deposited in Account no. "+accNo);
            System.out.println("\n\t\t Your Current Account Balance is "+newbal);
            //converting int newbal to again string so that it can be added in file again
            bal=Integer.toString(newbal);
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
