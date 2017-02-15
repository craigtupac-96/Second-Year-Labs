/*
 * Author: Craig Lawlor
 * C00184465
 */
package Lab9;

public class HotelRoomDrive {

	public static void main(String[] args) {
		HotelRoom roomA = new HotelRoom();
		HotelRoom roomB = new HotelRoom();
		HotelRoom roomC = new HotelRoom(202, "Single", 0, 90); // Using the constructor to set the values
		
		roomA.setRoomNumber(200);
		roomA.setRoomType("Single");
		roomA.setStatus(1);
		roomA.setRate(100);
		
		roomB.setRoomNumber(201);
		roomB.setRoomType("Double");
		roomB.setStatus(0);
		roomB.setRate(80);
		
		System.out.println(roomA.toString()); // Calling the toString method of HotelRoom
		System.out.println(roomB.toString());
		System.out.println(roomC.toString());
	}

}
