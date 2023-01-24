public class Robotcop {

	public static void main(String[] args) {

		String word = "Robocop";
		int characterIndex = 3;
		String wrd2 = word.substring(0,characterIndex );
		String wrd3 = word.substring(characterIndex+1, word.length());
		

			

		//if (args.length >= 2) {
		//	word = args[0];
		//	characterIndex = Integer.parseInt(args[1]);
//}	
System.out.println( wrd2 + wrd3 );

	}

}
