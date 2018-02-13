import java.util.ArrayList;

public class WordCount {

	public static void main(String[] args) {
		String msg = "I Hate You All";
		printWords(msg);
		countWords(msg);
		reverseWords(msg);
		replaceWords(msg, "Hate", "****");
	}
		public static void printWords(String msg) {
			String word = null;
			for(int i=0; i<msg.length(); i++) {
				if(msg.substring(i,i+1).equals(" ")) {
					word = null;
					System.out.println();
				}
				else if(word == null) {
					word = msg.substring(i,i+1);
					System.out.print(msg.substring(i,i+1));
				}
				else {
					word += msg.substring(i,i+1);
					System.out.print(msg.substring(i,i+1));
				}
			}
			System.out.println();

			
		}
		public static void countWords(String msg) {
			int space = 0;
			for(int i=0; i<msg.length(); i++) {
				if(msg.substring(i,i+1).equals(" ")) {
				space++;
				}
			}
			System.out.print("Number of Words: ");
			System.out.println(space + 1);
		}
		public static void reverseWords(String msg) {
			ArrayList<String> wordArray = new ArrayList<String>();
			String word = null;
			for(int i=0; i<msg.length(); i++) {
				if(msg.substring(i,i+1).equals(" ")) {
					wordArray.add(word);
					word = null;
				}
				else if(word == null) {
					word = msg.substring(i,i+1);
				}
				else {
					word += msg.substring(i,i+1);
				}
			}
			wordArray.add(word);
			for(int i=wordArray.size(); i>0; --i) {
				System.out.println(wordArray.get(i-1));
			}

		}
		public static void replaceWords(String msg, String find, String replace) {
			ArrayList<String> wordArray = new ArrayList<String>();
			String word = null;
			for(int i=0; i<msg.length(); i++) {
				if(msg.substring(i,i+1).equals(" ")) {
					wordArray.add(word);
					word = null;
				}
				else if(word == null) {
					word = msg.substring(i,i+1);
				}
				else {
					word += msg.substring(i,i+1);
				}
			}
			wordArray.add(word);
			for(int i=wordArray.size(); i>0; --i) {
				if(wordArray.get(i-1).equals(find))
					System.out.println(replace);
				else {
				System.out.println(wordArray.get(i-1));
				}
			}
		}

	}


