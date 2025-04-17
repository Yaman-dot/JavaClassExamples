package week9;

public class Circle 
{
	double radius;
	String color;
	
	public Circle(double r)
	{
		this.radius = r;
	}
	public Circle(double r, String c)
	{
		this.radius = r;
		this.color = c;
	}
	
	public double getArea()
	{
		return (radius*radius)*3.14;
		
	}

}
