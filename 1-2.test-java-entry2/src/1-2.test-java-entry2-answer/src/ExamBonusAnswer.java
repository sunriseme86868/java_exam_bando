public class ExamBonusAnswer {

	public static void main(String[] args) {

		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				int answer = i * j;
				if (answer < 10) {
					// もし1桁の場合はスペースを空ける
					System.out.print(" " + answer);
				} else {
					System.out.print(answer);
				}
				// 回答と回答の間にスペースを入れる
				System.out.print(" ");
			}
			// ○の段の出力が終わったら改行する
			System.out.println();
		}

	}

}