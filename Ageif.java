class Ageif{
public static void main(String args[]){
int age=101;
if(age<=18){
System.out.println("Not Eligible to vote");
}

else if(age<=0){
System.out.println("Not valid age");
}
else if(age>=101){
System.out.println("Too old to vote");
}
else
{
System.out.println("Eligivle to vote");
}
}
}