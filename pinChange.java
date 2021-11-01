import java.io.*;
import java.util.*;

 public class pinChange{
 
static String Current="";
static String ans="";
 public static void main(String [] args) throws IOException{
 			
 				System.out.println("****************Welcome to reset Your PIN******************");
 				System.out.println("");
 		System.out.println("Enter your old pin to confirm it's you");
 		Scanner sc=new Scanner(System.in);
 		String old = sc.nextLine();
 		
 		Current= read();
 		
 	if(Current.equals(old))
 	{
 		System.out.println("Enter Your new PIN");
 		String newPin =sc.nextLine();
 		write(newPin);
 		System.out.println("Congratulations!! You have sucesfully Changed Your PIN");
 	}
 	else
 	{
 		System.out.println("Sorry you entered Wrong PIN :) ");
 	}
	}
		
		
		
		public static void write(String newPin)  throws IOException{	
		
			FileWriter fw=new FileWriter("pin.txt"); //ya fir keval ifle ka name bhi likh skte hai agr usi folder me hai tb

	BufferedWriter bf=new BufferedWriter(fw);

	//Scanner scn=new Scanner(System.in);
	//Current = scn.nextLine(); 
	bf.write(newPin);
	
	bf.close();
	}
	public static String read()  throws IOException{	
	int ch;
	BufferedReader br=new BufferedReader(new FileReader("pin.txt"));
	while((ch=br.read())!=-1)
	ans+=( (char)ch ) ;
	br.close();
	
	
	
	
	return ans;
	}
		
		
		
		
   } 
