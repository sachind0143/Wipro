package practiceUseCase_Java;
class Car{
	private boolean engineStatus;
	private int speed;
	private int fuellvl;
	public void setEngine(boolean enginestatus) {
		engineStatus = enginestatus;
	}
	public void setSpeed(int spd) {
		speed = spd;
	}
	public void setFuel(int fuel) {
		fuellvl = fuel;
	}
	public String getEngine() {
		if(engineStatus==true) {
			return "Engine Started";
		}
		else {
			return "Engine Stops";
		}
	}
	public int getSpeed() {
		return speed;
	}	
	public int getFuel() {
		return fuellvl;
	}	
}
public class vehicle {
public static void main(String args[]) {
	Car swift = new Car();
	swift.setEngine(true);
	swift.setSpeed(50);
	swift.setFuel(5);
	System.out.println("Engine Status: "+swift.getEngine());
	System.out.println("Speed: "+swift.getSpeed()+ "km/h");
	System.out.println("Engine Status: "+swift.getFuel()+"ltr");
}
}
