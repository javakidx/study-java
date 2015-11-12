package idv.jk.dp.memento;


/**
 * Write a description of class Memento here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Memento
{
    public Memento(String state)
    {
        this.state = state;
    }
   private String state;
   
   public String getState()
   {
       return state;
    }
    
    public void setState(String state)
    {
        this.state = state;
    }
}
