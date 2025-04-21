package kadai_028;

import java.util.HashMap;
import java.util.Scanner;

public class Jyanken_Chapter28 {
	private String myChoise; // 自分の手の入力値 グーちょきぱー
	private String aiteChoise;// 相手の手

	// 自分のじゃんけんの手を入力する
	public String getMyChoice() {

		// 初期化
		Scanner sc = new Scanner(System.in);
		String me = null; // 最終的な出目

		while (me == null) {

			// 指示文
			System.out.println("自分のじゃんけんの手を入力しましょう");
			System.out.println("グーはrockのrを入力しましょう");
			System.out.println("チョキはscissorsのsを入力しましょう");
			System.out.println("パーはpaperのpを入力しましょう");
			this.myChoise = sc.nextLine();

			// 入力チェック
			if ("r".equals(myChoise)) {
				me = "r";
			} else if ("p".equals(myChoise)) {
				me = "p";
			} else if ("s".equals(myChoise)) {
				me = "s";
			} else {
				System.out.println("正しい手を入力してください");
				System.out.println();
				me = null;
			}
		}

		return me;
	}

	// 対戦相手のじゃんけんの手を乱数で選ぶ
	public String getRandom() {

		String choise[] ={ "r", "p", "s" };
		int num = 0;

		while (num > 2) {
			num = (int) Math.floor(Math.random() * 10);
		}

		this.aiteChoise = choise[num];
		return this.aiteChoise;
	}

	// じゃんけんを行う
	public String playGame(String deme) {
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("r", "グー");
		map.put("s", "チョキ");
		map.put("p", "パー");

		return map.get(deme);

	}
}
