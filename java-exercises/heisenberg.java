public class heisenberg {

	public static void main(String[] args) {


	String word = "heisengerg";
	String start;
	String end;
	String middle;

	start = word.substring(0,1);
	end = word.substring(word.length()-1,word.length());
	middle = word.substring(1, word.length()-1);

	System.out.println(end + middle + start);
	







}
}
