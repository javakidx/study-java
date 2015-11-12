package idv.jk.dp.memento;


/**
 * Write a description of class Main here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Main
{
    public static void main(String[] args)
    {
        Originator o = new Originator();
        o.setState("On");
        o.show();
        
        CareTaker c = new CareTaker();
        c.setMemento(o.createMemento());
        
        o.setState("Off");
        o.show();
        
        o.setMemento(c.getMemento());
        o.show();
    }
}
