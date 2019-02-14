import java.io.*;
import java.util.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;
class Database
{
 public static void main(String ar[]) throws IOException
 {
  Scanner sc = new Scanner(System.in);
  Database d=new Database(); 
  System.out.println("Choose from the following commands:\n1.Insert\n2.Delete\n3.Select *\n4.Show Database");
  int a;
  a = sc.nextInt();
 switch(a){
    case 1: {
         d.insert();
         break;
    }
    case 3:{
      d.display(); 
      break;
    }
    case 4:{ Stream<Path> files = Files.walk(Paths.get("/home/rajan/Downloads"));
        
        files.forEach(System.out::println);
        
        files.close();
        break;
  }

  default:{}}}
 public void display()
 {
  try
  {
  BufferedReader br=new BufferedReader(new FileReader("Database.csv"));
  String s="";
   while( (s=br.readLine()) !=null )
   {
    String data[]=new String[5];
    data=s.split(",");
    for(int i=0;i<5;i++)
    {
     System.out.print(data[i]+" ");
    }
    System.out.println();
   }
  }
  catch(Exception e){}
  
 }//

 public void insert()
 {
Scanner sc = new Scanner(System.in);
  //employee id first_name last_name salary location
  System.out.println("Enter the ID of employee:");
  String id=sc.nextLine();
  System.out.println("Enter the first name of employee:");
  String fn=sc.nextLine();
  System.out.println("Enter the last name of employee:");
  String ln=sc.nextLine();
  System.out.println("Enter the salary of employee:");
  String sl=sc.nextLine();
  System.out.println("Enter the location of employee:");
  String lc=sc.nextLine();
  
  try
  {
   File f=new File("Database.csv");
   PrintWriter pw=new PrintWriter(new FileOutputStream(f,true));
   pw.append(id+","+fn+","+ln+","+sl+","+lc+"\n");
   pw.close();
  }
  catch(Exception e){}
 }
 
}
