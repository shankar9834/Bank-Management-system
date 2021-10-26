import java.util.Scanner;
import Requirements.Account;
import Credentials.Login;
public class Main{

    public static void main(String[] args)
    {
        int res;         
        String pass;
        String us;
       // String name;
       
       Scanner sc=new Scanner(System.in);        //for taking integer input
       Scanner str=new Scanner(System.in);       // for taking String input
      
       System.out.println("\n\t\tWELCOME to Student corporate bank");
       System.out.println("\n\n\t\t Select one option from below");
       System.out.println("\n\t\t1 : Continue/login as Admin ");
       System.out.println("\t\t2 : Continue/login as User ");
       System.out.println("\t\t3 : Create new Account ");
       System.out.print("\t\tYour response : ");
      
       res=sc.nextInt();
     //  System.out.println("\n\t\t********************************************");
       switch (res) {
           case 1:
             
             /*  System.out.print("\n\n\t\tEnter your username : ");
               us=str.nextLine();
               System.out.print("\n\t\tEnter your password(numeric and with less than 3 digits) : ");
                pass=str.next(); */
                
                Login user=new Login();
               break;
          
         case 2:
               System.out.print("\n\n\t\tEnter your username : ");
               us=str.nextLine();
               System.out.print("\t\tEnter your password(numeric and with less than 3 digits) : ");
               pass=str.next();
               break;

          case 3:
            
             Account newAccount=new Account(1);
             break;

           default:
               System.out.println("\n\t\tNot a valid response ");
               System.out.println("\n\t\tThanks for visiting us");
               break;
       } 

    

    }
}

