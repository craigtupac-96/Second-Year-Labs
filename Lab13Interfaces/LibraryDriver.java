/*
 * Author: Craig Lawlor
 * C00184465
 */
package Lab13Interfaces;

public class LibraryDriver {

	public static void main(String[] args) {
		Book book1 = new Book("Fiction", "B331", "Paula Hawkins", "The Girl On The Train", 320);
		CD cd1 = new CD("R&B", "M251", "Weekend", "Starboy", 18);
		
		LibraryItem[] lib = new LibraryItem[2];
		lib[0] = book1;
		lib[1] = cd1;
		
		for(int index = 0; index < lib.length; index++){
			System.out.println(lib[index]);
			lib[index].calculatePrice();
		}
		
	}
}
