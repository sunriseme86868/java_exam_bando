public class Exam6Answer {

	public static void main(String[] args) {

		int totalScore = -1;

		if (0 <= totalScore && totalScore < 80) {
			System.out.println("’ÇŽŽ‚Å‚·");
		} else if (80 <= totalScore && totalScore < 100) {
			System.out.println("‡Ši‚Å‚·");
		} else if (totalScore == 100) {
			System.out.println("–ž“_‚Å‚·");
		} else {
			System.out.println("‘¶Ý‚µ‚È‚¢“_”‚Å‚·");
		}

	}

}