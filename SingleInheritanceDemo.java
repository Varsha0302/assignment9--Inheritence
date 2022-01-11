package v;

	public class SingleInheritanceDemo{
		public static void main(String[] args) {
			System.out.println("car class");
			Car c = new Car();
			c.carMove();
			c.carBrake();
			System.out.println(" Audi class");
			Audi a = new Audi();
			a.carMove();
			a.carBrake();
			a.autoPilot();
			a.autoGear();
			
		}
	}
	


