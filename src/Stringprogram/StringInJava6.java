package Stringprogram;
// date 3/20/2023
public class StringInJava6 {
// String is non mutable and StringBuffer is mutable
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s= new String();
		String s1= new String("Ajay");
		StringBuffer sb= new StringBuffer("StringBuffer");
	String s3= new String(sb);
	System.out.println(s3);
	
	// String s=new String();
	//String s=new String(String s );
	//String s=new String(StringBuffer b);
	//String s=new String(StringBuilder b);
	//String s=new String(char[] chr);
	//String s=new String(byte[] b);
	
	}
}
