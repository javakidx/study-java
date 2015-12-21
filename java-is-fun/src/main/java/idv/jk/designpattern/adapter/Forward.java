package idv.jk.designpattern.adapter;

/**
 * Created by javakid on 2015/11/12.
 */
public class Forward extends Player
{
    public Forward(String name)
    {
        super(name);
    }

    @Override
    public void attack()
    {
        System.out.printf("前鋒 %s 進攻%n", name);
    }

    @Override
    public void defense()
    {
        System.out.printf("前鋒 %s 進攻%n", name);
    }
}
