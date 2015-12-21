package idv.jk.designpattern.composite;

import org.apache.commons.lang3.StringUtils;

/**
 * Created by javakid on 2015/11/12.
 */
public class FinancialSector extends Company
{
    public FinancialSector(String name)
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
        System.out.printf("%s 公司財務收支管理%n", name);
    }
}
