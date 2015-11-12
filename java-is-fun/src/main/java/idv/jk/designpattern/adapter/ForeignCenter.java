package idv.jk.designpattern.adapter;

/**
 * Created by javakid on 2015/11/12.
 */
public class ForeignCenter
{

    private String name;

    public void attackInNonEnglish()
    {
        System.out.printf("外籍中鋒 %s 進攻%n", name);
    }

    public void defenseInNonEnglish()
    {
        System.out.printf("外籍中鋒 %s 進攻%n", name);
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }
}
