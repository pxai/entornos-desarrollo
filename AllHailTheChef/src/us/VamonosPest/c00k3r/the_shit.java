package us.VamonosPest.c00k3r;

import java.util.Scanner;

public class the_shit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		wholething pot = new wholething();
		String option = "";
		String line = "";
		float grames = 0;
		int my_index = 0;
		Scanner reader = new Scanner(System.in);

		do {

			System.out.println("Select an option:");
			System.out.println("1. add");
			System.out.println("2. reemuf");
			System.out.println("3. show");
			System.out.println("4. grames");
			System.out.println("5. exit");

			option = reader.nextLine();

			switch (option) {
			case "1":
				System.out.println("grames");
				grames = Float.parseFloat(reader.nextLine());
				System.out.println("name of stuff");
				line = reader.nextLine();
				stuff s = new stuff(line,grames);
				pot.add_some_stuff(s);
				break;
			case "2":
				System.out.println("index to remove");
				line = reader.nextLine();
				my_index = Integer.parseInt(line);
				pot.remove__stuff(my_index);
				break;
			case "3":
				System.out.println(pot.show_all_stuff());
				break;
			case "4":
				break;
			case "5":
				System.out.println("I Did It For Me. I Liked It.");
				break;
			default:
				break;
			}

		} while (!option.equals("5"));
	}

}
