/*
 * Author: Craig Lawlor
 * C00184465
 */
package Lab9;

public class HotelRoom {
	private int roomNumber;
	private String roomType;
	private int status;
	private double rate;
	
	// Default Constructor
	public HotelRoom(){
		
	}
	
	// Constructor
	public HotelRoom(int num, String type, int stat, int price){
		setRoomNumber(num);
		setRoomType(type);
		setStatus(stat);
		setRate(price);
	}
	
	// Setters
	public void setRoomNumber(int num){
		roomNumber = num;
	}
	
	public void setRoomType(String type){
		roomType = type;
	}
	
	public void setStatus(int stat){
		status = stat;
	}
	
	public void setRate(int price){
		rate = price;
	}
	
	//Getters
	public int getRoomNumber(){
		return roomNumber;
	}
	
	public String getRoomType(){
		return roomType;
	}
	
	public int getStatus(){
		return status;
	}
	
	public double getRate(){
		return rate;
	}
	
	public String toString(){
		return "Room Number - " + roomNumber + "\nRoom Type - " + roomType + "\nStatus: " + status + " Rate: " + rate + "\n";
	}
}
