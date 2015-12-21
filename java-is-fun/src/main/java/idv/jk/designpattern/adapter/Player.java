package idv.jk.designpattern.adapter;

/**
 * Created by javakid on 2015/11/12.
 */
public abstract class Player
{
    protected String name;

    public Player(String name)
    {
        this.name = name;
    }

    /**
     * Speak in English.
     */
    public abstract void attack();
    /**
     * Speak in English.
     */
    public abstract void defense();
}
