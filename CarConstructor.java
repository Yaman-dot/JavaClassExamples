package week9;

public class CarConstructor {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Car car1 = new Car("Ford", "Blue", 2023);
		Car car2 = new Car(2021);
		
		car2.setYear(123123);
		car1.setYear(2000);
		//System.out.println(car1);
	}

}
