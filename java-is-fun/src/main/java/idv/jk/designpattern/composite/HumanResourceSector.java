package idv.jk.designpattern.composite;

import org.apache.commons.lang3.StringUtils;

/**
 * Created by javakid on 2015/11/12.
 */
public class HumanResourceSector extends Company
{
    public HumanResourceSector(String name)
    {
        super(name);
    }

    @Override
    public void add(Company c)
    {
        //sector is a leaf
    }

    @Override
    public void remove(Company c)
    {
        //sector is a leaf
    }

    @Override
    public void display(int depth)
    {
        System.out.println(StringUtils.leftPad("", depth, '-') + name);
    }

    @Override
    public void describeDuty()
    {
        System.out.printf("%s 員工選用育留%n", name);
    }
}
