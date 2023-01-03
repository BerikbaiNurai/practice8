import java.util.Scanner;
public class P8_Task11{
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter word");
		String word=in.next();
		int soz=word.length();
		System.out.println(soz);
		String star = " * ";

		for(int i=1;i<=soz-1;i++){
			star+=" * ";
		}
		System.out.println(star+word+star);
	}
}

//9.49 . Дано слово. Добавить к нему в начале и конце столько звездочек, сколько 
// букв в этом слове.
//bitti