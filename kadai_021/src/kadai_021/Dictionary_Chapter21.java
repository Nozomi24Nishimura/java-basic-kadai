package kadai_021;

import java.util.HashMap;

public class Dictionary_Chapter21 {

	public void dictionary(String[] keyword) {

		HashMap<String, String> book = new HashMap<String, String>();

//	HashMap<String, String> book = new HashMap<String, String>();

		book.put("apple", "りんご");
		book.put("peach", "桃");
		book.put("banana", "バナナ");
		book.put("lemon", "レモン");
		book.put("pear", "梨");
		book.put("kiwi", "キウィ");
		book.put("strawberry", "いちご");
		book.put("grape", "ぶどう");
		book.put("muscat", "マスカット");
		book.put("cherry", "さくらんぼ");

		// HashMap の内容を確認する
		for (int i = 0;  i < keyword.length; i++) {
			String res = null;
			res = book.get(keyword[i]);
			
			if(res!=null) {
			System.out.println(keyword[i]+"の意味は"+ res);
			}else {
				System.out.println(keyword[i]+"は辞書に存在しません");
			}
		}

	}
}
