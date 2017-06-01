
public class carApp {
	public static void main(String[] args) {
		
		
		car c = new car("Red");
		
		c.setSpeed(120);
		c.setVehicleType(" Porsche ");
		
		car d= new car("Blue");
		d.setSpeed(150);
		d.setVehicleType(" Jetta ");
		d.setVehicleType2("Red Porsche");
		
		
		print(c.start());
		print(c.accelerate());
		print(d.start());
		print(d.accelerate());
		print(c.Speed());
		print(d.Speed());
		print(d.passed());
		print(c.stop());
		print(d.win());
		
		
		
	}
	private static void print(String s)
	{
		System.out.println(s);
	}
}

