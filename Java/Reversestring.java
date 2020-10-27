import java.util.Scanner;  

class Reversestring
{
public static void main(String[] args)
{
Scanner sc =new Scanner(System.in);
System.out.println("Enter a string value : ");
String str = sc.nextLine();


char ch[] = str.toCharArray();

String strrev = "";

for (int i=ch.length-1; i>=0;i--) {
strrev = strrev+ch[i];

}

System.out.println("Reversed string is : "+strrev);

}

}