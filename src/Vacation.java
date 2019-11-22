import java.util.Scanner;
public class Vacation {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		String vacationType;
		int groupSize;
		String result;
		
		System.out.print("What type of vacation interests you: Musical, Tropical, or Adventurous? ");
		vacationType = scnr.next();
		
		System.out.print("How many people are in your group? ");
		groupSize = scnr.nextInt();
		result = ("With a group of " + groupSize + " wanting to go somewhere " + vacationType + ", we would suggest taking a ");
		
		char userVac = vacationType.charAt(0);
		if (groupSize >= 1 && groupSize <= 2) {
			result = result + ("first class trip ");
			
			if (userVac == 'M' || userVac == 'm') {
				result = result + ("to New Orleans.");
			}
			else if (userVac == 'T' || userVac == 't') {
				result = result + ("to a sunny beach in Mexico.");
			}
			else {
				result = result + ("to the Grand Canyon for white water rafting.");
			}
		}
		else if (groupSize >= 3 && groupSize <= 5) {
			result = result + ("helicopter ride ");
			
			if (userVac == 'M' || userVac == 'm') {
				result = result + ("to New Orleans.");
			}
			else if (userVac == 'T' || userVac == 't') {
				result = result + ("to a sunny beach in Mexico.");
			}
			else {
				result = result + ("to the Grand Canyon for white water rafting.");
			}
		}
		else {
			result = result + ("charter flight ");
			
			if (userVac == 'M' || userVac == 'm') {
				result = result + ("to New Orleans.");
			}
			else if (userVac == 'T' || userVac == 't') {
				result = result + ("to a sunny beach in Mexico.");
			}
			else {
				result = result + ("to the Grand Canyon for white water rafting.");
			}
		}
		
		System.out.println(result);
		System.out.println("Enjoy your trip!");
		
	}

}
