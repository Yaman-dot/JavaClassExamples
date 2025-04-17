package week9;

public class Car 
{
	
	public Car(String model, String color, int year) 
	{
		super();
		this.model = model;
		this.color = color;
		this.year = year;
		
		CarDetails(model, color, year);
	}
	
	public Car(int year123123) {
		super();
		this.year = year123123;
		CarDetails(model, color, year);
	}

	//attributes
	String model;
	String color;
	private int year;
	
	public int getYear() {
		return year;
	}

	public void setYear(int year123) {
		this.year = year123;
		System.out.println(year);
	}

	public void CarDetails(String _model, String _color, int _year)
	{
		System.out.println("Car is a " + _model + " Its color is " + _color+ " its year is " + _year);
	}
	

}
