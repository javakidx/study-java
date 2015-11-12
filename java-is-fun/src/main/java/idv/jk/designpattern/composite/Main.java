package idv.jk.designpattern.composite;

/**
 * Created by javakid on 2015/11/12.
 */
public class Main
{
    public static void main(String[] args)
    {
        Company root = new ConcreteCompany("總公司");
        root.add(new HumanResourceSector("總公司人力資源部"));
        root.add(new FinancialSector("總公司財務部"));

        Company comp1 = new ConcreteCompany("新竹分公司");
        comp1.add(new HumanResourceSector("新竹分公司人力資源部"));
        comp1.add(new FinancialSector("新竹分公司財務部"));

        Company comp2 = new ConcreteCompany("台中分公司");
        comp2.add(new HumanResourceSector("台中分公司人力資源部"));
        comp2.add(new FinancialSector("台中分公司財務部"));

        root.add(comp1);
        root.add(comp2);
        System.out.println("結構圖：");
        root.display(1);

        System.out.println("職責說明：");
        root.describeDuty();
    }
}
