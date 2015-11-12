package idv.jk.designpattern.composite;

import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by javakid on 2015/11/12.
 */
public class ConcreteCompany extends Company
{
    private List<Company> children = new ArrayList<>();

    public ConcreteCompany(String name)
    {
        super(name);
    }

    @Override
    public void add(Company c)
    {
        children.add(c);
    }

    @Override
    public void remove(Company c)
    {
        children.remove(c);
    }

    @Override
    public void display(int depth) {
        System.out.printf(StringUtils.leftPad("", depth, '-') + "%s%n",name);

        for (Company c : children)
        {
            c.display(depth + 2);
        }
    }

    @Override
    public void describeDuty()
    {
        for (Company c : children)
        {
            c.describeDuty();
        }
    }
}
