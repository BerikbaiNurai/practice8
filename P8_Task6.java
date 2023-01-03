import java.util.Scanner;
public class P8_Task6{
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("enter even soz");
		String word=in.next();

		int soz=word.length()/2;
		String subword=word.substring(0,soz);
		System.out.println(subword);
	}
}

//9.22 Дано слово, состоящее из четного числа букв. Вывести на экран его первую 
// половину, не используя оператор цикла.
//bitti