package com.xworkz.tostringandequals.fork;

public class Fork
{
    String brand;
    boolean isDisposable;
    String usageType;

    public  Fork(String brand, boolean isDisposable, String usageType)
    {
        this.brand = brand;
        this.isDisposable = isDisposable;
        this.usageType = usageType;
    }

    @Override
    public String toString() {
        return "Brand : "+brand+" ,Disposable : "+isDisposable+" ,UsageType : "+usageType;
    }

    @Override
    public boolean equals(Object obj)
    {
        Fork leftSide=this;
        if(obj instanceof Fork)
        {
            Fork rightSide=(Fork)obj;
            if(leftSide.brand==rightSide.brand && leftSide.isDisposable==rightSide.isDisposable && leftSide.usageType==rightSide.usageType)
            {
                return true;
            }
        }
        return super.equals(obj);
    }
}
