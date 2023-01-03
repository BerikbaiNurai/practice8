import java.util.Scanner;
public class P8_Task5{
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String word = in.next();
	    char c1 = word.charAt(1);
	    char c2 = word.charAt(2);
	    char c3 = word.charAt(3);

	    System.out.println(c1+" "+c2+" "+c3);
	}
}
    
//9.21 Дано слово. Получить его часть, образованную второй, третьей и четвертой 
// буквами.
//bitti