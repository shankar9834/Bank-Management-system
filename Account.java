package Requirements;
import java.lang.*;
import java.util.Random;
import java.util.Scanner;
import java.io.*;

public class Account {

    protected String username;
    protected String  mobileNum;
    protected String password;
    protected String AccountNum;
    protected String balance="0";    
    
    public Scanner str=new Scanner(System.in);
   // Scanner num=new Scanner(System.in);


   public Account()
   {
       
   }

    public Account(int a)
    {
        

    
       System.out.print("\n\t\tEnter your name : ");
       String nm=str.next();
       System.out.print("\n\t\tEnter your mobile number(less than 8 numeric) : ");
       String m=str.next();
       System.out.print("\n\t\tEnter your Password(3 charactered) : ");
       String n=str.next();
       
         username=nm;
         mobileNum=m;
         password=n;
         
         int rand=(int)Math.floor(Math.random()*1000);
         AccountNum=rand+"";
         
         nm=nm+".txt";
         
         try{
            

            FileWriter fw=new FileWriter(nm,true);
            BufferedWriter bf=new BufferedWriter(fw);
             
           
           bf.write(username);
           bf.write("\n");
           bf.write(password);
           bf.write("\n");
           bf.write(AccountNum);
           
           bf.write("\n");
           bf.write(mobileNum);
            
           bf.write("\n");
           bf.close();
            



         }
         catch(Exception e)
         {
           
            System.out.println("\n\t\tSorry for the inconvinience caused, we cannot create your account right now ,please visit after some time\n");
         
         }
     
      

    
    }
    

    
}
