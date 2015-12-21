package idv.jk.dp.adapter;


/**
 * Write a description of class Adapter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Adapter extends Target
{
   private Adaptee adaptee = new Adaptee();
   
   @Override
   public void request()
   {
       adaptee.specificRequest();
    }
}
