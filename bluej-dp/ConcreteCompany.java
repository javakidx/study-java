import java.util.List;
import java.util.ArrayList;
/**
 * Write a description of class ConcreteCompany here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ConcreteCompany extends Company
{
    private List<Company> children = new ArrayList<Company>();
    
    public ConcreteCompany(String name)
    {
        super(name);
    }
    
    public void add(Company c)
    {
        children.add(c);
    }
    
    public void remove(Company c)
    {
        children.remove(c);
    }
    
    public void display(int depth)
    {
        
    }
    
    public void descriptionOfDuty()
    {
        
    }
    
}
