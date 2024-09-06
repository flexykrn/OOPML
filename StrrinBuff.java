class StringBuff {

public static void main(String args[]) {
String s1="ANA";
StringBuilder sb=new StringBuilder(s1);
System.out.println("string:"+sb);
sb.reverse();

String s2=sb.toString();

if(s1.equals(s2));

if(s1.equals(s2))
{
System.out.println("palindrome");
}
else{
System.out.println("not a palindrome");
}
}
}