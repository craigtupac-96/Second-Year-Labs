/*
 * Author: Craig Lawlor
 * C00184465
 */
package Lab13Interfaces;

public class LibraryItem implements LoanItem {
	private String type;
	private String id;
	
	public LibraryItem(String ty, String i){
		setType(ty);
		setId(i);
	}
	
	public void setType(String ty){
		type = ty;
	}
	
	public void setId(String i){
		id = i;
	}
	
	public String getType(){
		return type;
	}
	
	public String getId(){
		return id;
	}
	
	public String toString(){
		return "\nType: " + getType() + "\nID: " + getId();
	}

	@Override
	public void calculatePrice() {
		// TODO Auto-generated method stub
		
	}
}
