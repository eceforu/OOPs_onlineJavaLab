// Java Program that read from a file and write to file by handling all file related exceptions
import java.io.*;
class FileExc
  {
    public static void main(String args[])
    {
      try
      {
        FileReader fin=new FileReader("testing.txt");
        FileWriter fout=new FileWriter("copy.txt");
        int i;
        while((i=fin.read())!=-1)
        {
          System.out.println((char) i);
          fout.write(i);
        }
        fin.close();
        fout.close();
      }
      catch(FileNotFoundException e)
      {
        System.out.println(e.getMessage());
      }
      catch(IOException e)
      {
        System.out.println(e.getMessage());
      }
     } 
   }
