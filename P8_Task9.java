import java.util.Scanner;
public class P8_Task9{
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
//a

		System.out.println("Enter word");
		String word = in.next();
		
		System.out.println("Enter k number");
		int k = in.nextInt();
		
		int soz=word.length();

		String word1=word.substring(0,k);
		String word2=word.substring(k,soz);

		System.out.println(word2+word1);

//b
/*
		System.out.println("enter word");
		String word = in.next();
        int length = word.length();
        System.out.println("enter number");
        int k = in.nextInt();
        String word2= "";
        String word1 = "";
        for (int i =0;i<k;i++){
            String soz = word.substring(0,i+1);
            word2=soz;
            String soz2= word.substring(k,length);
            word1=soz2;
        }
        System.out.println(word1+word2);
*/
	}
}

//9.40 Дано слово. Перенести первые k его букв в конец.
// Задачу решить двумя способами:
// 1) без использования оператора цикла;
// 2) с использованием оператора цикла.
//bitti