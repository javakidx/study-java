
/**
 * Abstract class Company - write a description of the class here
 * 
 * @author (your name here)
 * @version (version number or date here)
 */
public abstract class Company
{
    /**
     * 組織名稱
     */
    protected String name;
    
    public Company(String name)
    {
        this.name = name;
    }
    
    public abstract void add(Company c);
    
    public abstract void remove(Company c);
    
    /**
     * 顯示組織層級。
     */
    public abstract void display(int depth);
    
    /**
     * 顯示組織職責。
     */
    public abstract void descriptionOfDuty();
}
