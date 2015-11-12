package idv.jk.designpattern.adapter;

/**
 * Created by javakid on 2015/11/12.
 */
public class Guard extends Player
{
    public Guard(String name)
    {
        super(name);
    }

    @Override
    public void attack()
    {
        System.out.printf("後衛 %s 進攻%n", name);
    }

    @Override
    public void defense()
    {
        System.out.printf("後衛 %s 進攻%n", name);
    }
}
