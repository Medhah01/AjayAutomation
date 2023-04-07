package Stringprogram;
//date 3/17/2023
public class StringInJava2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="i love java and selenium";
String s6="i love/java and/selenium";;
String s2="i love java and selenium";
String s3="";
String s4="I love php";

   System.out.println(s.substring(1,11));
   System.out.println(s.substring(7));
   System.out.println(s.charAt(5));
   System.out.println(s.contains("And"));
   System.out.println(s.contains("and"));
   
   System.out.println(s.equals(s2));
   System.out.println(s2.isEmpty());
   System.out.println(s.concat(s4));
   System.out.println(s.replace("java", "php"));
   System.out.println(s.equals(s2));
   System.out.println(s.equalsIgnoreCase(s2));
 //String splitedString[]=s.split("");
   String arrOfString[]=s6.split("");
	for(int i=0;i<arrOfString.length;i++) {
	System.out.println(arrOfString[1]);
	
	}

}
}
