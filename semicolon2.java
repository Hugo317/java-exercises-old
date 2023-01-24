public class semicolon2 {

	public static void main(String[] args) {

		String word = "semicolon";
		




		System.out.println(word.substring(0,3).equals("not") ? "" + word : "not" + word);

			if(args.length > 0){
				word = args[0];
			}


	}
}
