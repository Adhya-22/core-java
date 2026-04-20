package com.xworkz.tostringandequals.industry;

public class Industry
{
    String location;
    double revenue;
    boolean isGovernment;

    public Industry(String location, double revenue, boolean isGovernment)
    {
        this.location=location;
        this.revenue=revenue;
        this.isGovernment=isGovernment;
    }

    @Override
    public String toString() {
        return "Location : "+location+" ,Revenue : "+revenue+" ,IsGovernment : "+isGovernment;
    }

    @Override
    public boolean equals(Object obj)
    {
        Industry leftSide=this;
        if(obj instanceof Industry)
        {
            Industry rightSide=(Industry)obj;
            if(leftSide.location==rightSide.location && leftSide.revenue==rightSide.revenue && leftSide.isGovernment==rightSide.isGovernment)
            {
                return true;
            }
        }
        return super.equals(obj);
    }
}
