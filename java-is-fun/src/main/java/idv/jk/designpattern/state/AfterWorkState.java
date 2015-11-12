package idv.jk.designpattern.state;

/**
 * Created by bioyang on 2015/10/14.
 */
public class AfterWorkState extends MoodState
{
    @Override
    public String getMood(Developer developer)
    {
        return "耶！下班了";
    }
}
