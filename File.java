// Write a file handling programming with reader/writer
import java.io.*;
class File
  {
    public static void main(String args[])
    {
      try
      {
        FileReader fr=new FileReader(testing.txt);
        BufferedReader br=new BufferedReader(fr);
        System.out.println(br.readLine());
      }
      catch(IOException e)
      {
        System.out.println(e.getMessage());
      }
     } 
   }
