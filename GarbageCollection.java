# Java Program to demonstrate the use of Garbage Collection
class GarbageCollection
{
  public void finalize()
  {
    System.out.println("Object Memory Released");
  }
  public static void main(String args[])
  {
    GarbageCollection garc = new GarbageCollection();
    garc = null;
    System.gc();
   }
 }  
    
    
