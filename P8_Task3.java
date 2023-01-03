import java.util.Scanner;
public class P8_Task3{
	public static void main(String[] args) {
/*	
		String word = "Nurai";
		char c1 = word.charAt(1);
		char c3 = word.charAt(3);
		
		System.out.println("Char 1:"+c1);
		System.out.println("Char 3:"+c3);

		if(c1==c3){
			System.out.println("true");
		}else{
			System.out.println("false");
		}
*/
		Scanner in=new Scanner(System.in);

		String word=in.next();
		char c1 = word.charAt(1);
		char c3 = word.charAt(3);
		
		System.out.println("Char 1:"+c1);
		System.out.println("Char 3:"+c3);

		if(c1==c3){
			System.out.println("true");
		}else{
			System.out.println("false");
		}
	}
}

//9.16 Дано слово. Определить, одинаковы ли второй и четвертый символы в нем
//bitti