package idv.jk.designpattern.adapter;

/**
 * Created by javakid on 2015/11/12.
 */
public class Translator extends Player
{

    ForeignCenter foreignCenter = new ForeignCenter();

    public Translator(String name)
    {
        super(name);
        foreignCenter.setName(name);
    }

    @Override
    public void attack()
    {
        foreignCenter.attackInNonEnglish();
    }

    @Override
    public void defense()
    {
        foreignCenter.defenseInNonEnglish();
    }
}
