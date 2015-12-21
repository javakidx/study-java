package idv.jk.dp.memento;


/**
 * Write a description of class CareTaker here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CareTaker
{
   private Memento memento;
   
   public Memento getMemento()
   {
       return memento;
    }
    
    public void setMemento(Memento memento)
    {
        this.memento = memento;
    }
}
