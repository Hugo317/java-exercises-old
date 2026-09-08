public class dimain {
	public static void main (String[] args) {




String str = "http://www.academiadecodigo.org";

String domain = ""; // www.academiadecodigo.org
String name = "";   // < Academia de Codigo_ >

domain = str.substring(str.indexOf("w"));
String body = str.substring(str.indexOf(".") + 1 ,str.lastIndexOf(".",str.length()));
String aca = body.substring(0,body.lastIndexOf("a",str.length())+1);
String de = body.substring(body.lastIndexOf("a")+1,body.lastIndexOf("c"));
String cod = body.substring(body.lastIndexOf("e")+1);
 aca = Character.toUpperCase(aca.charAt(0)) + aca.substring(1);
 cod = Character.toUpperCase(cod.charAt(0)) + cod.substring(1);



System.out.println("< " + aca + " " + de + " " + cod + "_ >"  );



// print the following message at the end
// I am a Code Cadet at < Academia de Codigo_ >, www.academiadecodigo.org

	}}
