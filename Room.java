package USER.com.cox.dti.dao;

public class Room {

	public String roomId;
	public String noOfDoors;
	public String doorPosition[];
	
	public String getRoomId() {
		return roomId;
	}
	public void setRoomId(String roomId) {
		this.roomId = roomId;
	}
	public String getNoOfDoors() {
		return noOfDoors;
	}
	public void setNoOfDoors(String noOfDoors) {
		this.noOfDoors = noOfDoors;
	}
	public String[] getDoorPosition() {
		return doorPosition;
	}
	public void setDoorPosition(String[] doorPosition) {
		this.doorPosition = doorPosition;
	}
}
