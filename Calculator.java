package module;
import java.util.*;
public class Calculator implements Calc{
    private double n1;
    private double n2;
    
    public Calculator(double n1,double n2)
    {
    	this.n1=n1;
    	this.n2=n2;
    }
    
    public double add()
    {
    	return n1+n2;
    }
    
    public double sub()
    {
    	return n1-n2;
    }
    
    public double multiply()
    {
    	return n1*n2;
    }
    
    public double divide()
    {
    	if(n2==0)
    		return -1;
    	return n1/n2;
    }
}
