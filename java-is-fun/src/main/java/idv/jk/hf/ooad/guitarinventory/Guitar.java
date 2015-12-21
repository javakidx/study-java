package idv.jk.hf.ooad.guitarinventory;

/**
 * Created by bioyang on 2015/11/19.
 */
public class Guitar
{
    private String serailNumber;
    private double price;
    private Builder mBuilder;
    private Type mType;
    private Wood mBackWood;
    private Wood mTopWood;

    public String getSerailNumber()
    {
        return serailNumber;
    }

    public double getPrice()
    {
        return price;
    }

    public Builder getBuilder()
    {
        return mBuilder;
    }

    public Type getType()
    {
        return mType;
    }

    public Wood getBackWood()
    {
        return mBackWood;
    }

    public Wood getTopWood()
    {
        return mTopWood;
    }
}
