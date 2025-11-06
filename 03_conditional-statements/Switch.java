public class Switch {
	public static void main(String[] args) {
		String hero = "Spider-man";

		switch(hero) {
			case "Iron Man":
				System.out.println("Your Hero is : " + hero);
				break;

			case "Captain America":
				System.out.println("Your Hero is : " + hero);
				break;

			case "Spider-man":
				System.out.println("Your Hero is : " + hero);
				break;

			case "Hulk":
				System.out.println("Your Hero is : " + hero);
				break;

			case "Thor":
				System.out.println("Your Hero is : " + hero);
				break;

			default:
				System.out.println("No heros available");
				break;
		}
	}
}
