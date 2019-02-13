import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
public class new1
{
   public static void main(String []args)
   {
       Scanner sc=new Scanner(System.in);
       int ch,k;
       while(true)
       {
           System.out.println("01. insert rows:");
           System.out.println("02. delete rows");
           System.out.println("03. select from the table");
	   System.out.println("04. show table in database");
           System.out.print("Enter Your Choice : ");
           ch=sc.nextInt();
           switch(ch)
           {
               case 1:
                        System.out.print("enter the row you want to insert:");
			 
    String csvfilepath = "C:\\Users\\bajaj\\Desktop\\project\\csvs";
     try (PrintWriter writer = new PrintWriter(new File("example.csv"))) 
    {

      StringBuilder sb = new StringBuilder();
      sb.append("id,");
      sb.append(',');
      sb.append("Name");
      sb.append('\n');

      sb.append("1");
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
                        System.out.print("enter the row you want to delete");
                        break;
               case 3: System.out.print("select from the table:");
	
    break;


  
		case 4: System.out.print("show table in database");
			break;
  
               default: System.out.println("Wrong Entry");
             }
           }
         }
}

         
       
     

            
       
   

	
