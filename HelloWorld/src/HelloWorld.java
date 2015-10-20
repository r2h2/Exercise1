import java.util.Scanner;

/**
 * 
 */

/**
 * @author Tobias
 *
 */
public class HelloWorld {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Hello ASE2015 - how are you now? :)");
		System.out.print("Please enter your name: ");
		Scanner scanner = new Scanner(System.in);
		String userName = scanner.next();
		scanner.close();
		HelloUser user = new HelloUser(userName);
		user.greetUser();
	}

}
