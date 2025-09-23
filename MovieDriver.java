import java.util.Scanner;

public class MovieDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String input;
		do {
			Scanner scanner = new Scanner(System.in);
			
			Movie object = new Movie();
			
			System.out.println("Enter title of movie: ");
			String movieTitle = scanner.nextLine();
			
			object.setTitle(movieTitle);
			
			System.out.println("Enter rating of movie: ");
			String movieRating = scanner.nextLine();
			
			object.setRating(movieRating);
			
			System.out.println("Enter the number of tickets sold for this movie: ");
			int numOfTickets = scanner.nextInt();
			
			object.setSoldTickets(numOfTickets);
			
			System.out.println(object);
			
			scanner.nextLine();
			System.out.println("Do you want to enter another? (y or n): ");
			input = scanner.nextLine();
			
			
		} while (input.toLowerCase().equals("y"));
	}

}
