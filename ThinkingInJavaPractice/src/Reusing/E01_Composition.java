package Reusing;

class Simple
{
    private String strField;
    public Simple(String strField)
    {
        this.strField = strField;
    }
    public void setStrField(String newStr)
    {
        strField  = newStr;
    }
    public String toString()
    {
        return strField;
    }
}

class Second
{
    private Simple simpleInstance;
    private String str;
    public Second(String newStr)
    {
        str = newStr;
    }
    public void check()
    {
        if (simpleInstance == null)
            System.out.println("not initialized");
        else
        {
            System.out.println("has initialized");
        }
    }
    public Simple lazy()
    {
        if (simpleInstance == null) {
            System.out.println("Create Simple");
            simpleInstance = new Simple(str);
        }
        return simpleInstance;
    }
    public Simple getSimpleInstance()
    {
        return lazy();
    }
    public String toString()
    {
        return lazy().toString();
    }
    public void setSimpleInstance(String sNew)
    {
        lazy().setStrField(sNew);
    }
}

public class E01_Composition
{
    public static void main(String[] args)
    {
        Second second = new Second("Init String");
        second.check();
        System.out.println(second.getSimpleInstance());
        second.check();
        System.out.println(second);
        second.setSimpleInstance("new String");
        System.out.println(second);

    }


}
