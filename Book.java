import java.util.Scanner;
class Book{
public static void main(String args[]){
String title,genre,grade;
int price,copies;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the title of the book:");
title=sc.next();
System.out.println("Enter the price of the book:");
price=sc.nextInt();
System.out.println("Enter the number of copies available:");
copies=sc.nextInt();
System.out.println("Enter the genre of the book:");
genre=sc.next();
System.out.println("Enter the rating grade (A-good, B-Ok, C- Bad):");
grade=sc.next();
System.out.println("Title of the book is:"+title);
System.out.println("The price of book is:"+price);
System.out.println("The number of copies available are:"+copies);
System.out.println("The genre of book is:"+genre);
System.out.println("The rating grade is:"+grade);
}
}