package idv.jk.designpattern.adapter;

/**
 * Created by javakid on 2015/11/12.
 */
public class Main
{
    public static void main(String[] args)
    {
        Player forward = new Forward("巴芾爾");
        forward.attack();

        Player guard = new Guard("麥格雷迪");
        guard.attack();

        Player center = new Translator("姚明");
        center.attack();
        center.defense();
    }
}
