/*
 * Author: Craig Lawlor
 * C00184465
 */
package Lab13Interfaces;

public class CD extends LibraryItem {
	private String band;
	private String title;
	private int numTracks;
	
	public CD(String type, String id, String group, String name, int num){
		super(type, id);
		setBand(group);
		setTitle(name);
		setNumberTracks(num);
	}
		
	public void setBand(String group){
		band = group;
	}
	
	public void setTitle(String name){
		title = name;
	}
	
	public void setNumberTracks(int num){
		numTracks = num;
	}
	
	public String getband(){
		return band;
	}
	
	public String getTitle(){
		return title;
	}
	
	public int numberTracks(){
		return numTracks;
	}
	
	public void calculatePrice(){
		System.out.println("Price: " + numTracks * 1.1);
	}
	
	public String toString(){
		return ("\nBand: " + band + "\nTitle: " + title + super.toString() + "\nNumber of Tracks: " + numTracks);
	}
}
