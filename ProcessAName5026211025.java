import java.util.Scanner;

public class ProcessAName5026211025{

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.println("Enter your name: ");
		String fullName = console.nextLine();

		int space = fullName.indexOf(" ");
		System.out.println(space);
		
		String lastName = fullName.substring(space+1);
		System.out.println("Your name is: " + lastName + ", " + fullName.charAt(0) + ".");
		
		
}
}