import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
public class database
{
   public static void main(String []args)
   {
       Scanner sc=new Scanner(System.in);
       int ch,k;
       while(true)
       {
           System.out.println("01. insert rows:"); // This option will ins
           System.out.println("02. delete rows"); // This option will delete rows
           System.out.println("03. select from the table"); // This option will display the table which we want to show
	   System.out.println("04. show table in database"); // This option will tell us about the tables in the database
           System.out.print("Enter Your Choice : ");
           ch=sc.nextInt();
           switch(ch)
           {
               case 1:
                        System.out.print("enter the row you want to insert:"); //Enterting the details here
			 
    String csvfilepath = "C:\\Users\\bajaj\\Desktop\\project\\csvs";
     try (PrintWriter writer = new PrintWriter(new File("example.csv"))) 
    {

      StringBuilder sb = new StringBuilder();
      sb.append("id,"); // Serial No
      sb.append(',');
      sb.append("Name");// Name of the person
      sb.append('\n');

      sb.append("1"); // Prefed data
      sb.append(',');
      sb.append("Prashant Ghimire");
      sb.append('\n');

      writer.write(sb.toString());

      System.out.println("done!");

    } 
      catch (FileNotFoundException e) 
      {
      System.out.println(e.getMessage());
    }

  

                  
                    case 2:  
                        System.out.print("enter the row you want to delete"); // Deleting the row we want to
                        break;
               case 3: System.out.print("select from the table:"); // showing the table we want to
	
    break;


  
		case 4: System.out.print("show table in database"); //It will be showing the table
			break;
  
               default: System.out.println("Wrong Entry"); // The default statement that the program will be running
             }
           }
         }
}

         
       
     

            
       
   

	
