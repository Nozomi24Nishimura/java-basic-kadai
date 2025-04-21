package kadai_028;

public class JyankenExec_Chapter28 {

	public static void main(String[] args) {
		Jyanken_Chapter28 jan = new Jyanken_Chapter28();

		String me = null;
		me = jan.getMyChoice();

		String aite = null;
		aite = jan.getRandom();

		System.out.println("自分の手は" + jan.playGame(me)
		        + ",対戦相手の手は" + jan.playGame(aite));

		if (me.equals("r")) {
			switch (aite) {
				case "s" -> System.out.println("自分の勝ちです");
				case "p" -> System.out.println("自分の負けです");
				default -> System.out.println("あいこです");
			}
		} else if (me.equals("s")) {
			switch (aite) {
				case "p" -> System.out.println("自分の勝ちです");
				case "r" -> System.out.println("自分の負けです");
				default -> System.out.println("あいこです");
			}
		} else if (me.equals("p")) {
			switch (aite) {
				case "r" -> System.out.println("自分の勝ちです");
				case "s" -> System.out.println("自分の負けです");
				default -> System.out.println("あいこです");
			}

		}

	}
}