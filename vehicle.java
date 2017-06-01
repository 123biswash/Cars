
public class vehicle {
	
	public int Speed;
	public String color;
	public String vehicleType;
	public String vehicleType2;
	
	public String accelerate(){
		return "the "+ this.color+ vehicleType +" is accelerating";
	}
	public String stop(){
		return "the "+ this.color+ vehicleType +" has stopped, probably because of hopelessness";
	}
	public String start(){
		return "the "+ this.color+ vehicleType + " is starting";
	}
	public String Speed(){
		return "the "+ this.color + vehicleType +" is moving at " + Speed +" mph";
	}
	public String passed(){
		return "the "+ this.color + vehicleType + " just passed the "+ vehicleType2;
	}
	public String win(){
		return "the "+ this.color+ vehicleType + " has won the race.";
	}

	public int getSpeed() {
		return Speed;
	}
	public void setSpeed(int speed) {
		Speed = speed;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getVehicleType() {
		return vehicleType;
	}
	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}
	public String getVehicleType2() {
		return vehicleType2;
	}
	public void setVehicleType2(String vehicleType2) {
		this.vehicleType2 = vehicleType2;
	}
}
