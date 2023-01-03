import java.util.Scanner;
public class P8_Task19{
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String word=in.next();
		char e3= word.charAt(2);
		
		String resW2 = word.replace(""+e3, "");
		System.out.println(resW2);
		
		int k=in.nextInt();
		char ek= word.charAt(k);
		resW2 = word.replace(""+ek, "");
		
		System.out.println(resW2);	
	}
}

//9.109 Дано слово. 
// а) Удалить из него третью букву.
// б) Удалить из него k-ю букву.
//bitti