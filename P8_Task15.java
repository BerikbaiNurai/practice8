import java.util.Scanner;
public class P8_Task15{
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String word = in.nextLine();
        int count = 0;
        int length = word.length();
        for (int i = 0; i < length; i++ ){
            if (word.charAt(i) == 'i'|| word.charAt(i) == 'o' || word.charAt(i)=='u' ||  word.charAt(i)=='a' || word.charAt(i)=='e' ){
                count++;
            }
        }
        System.out.println(count);
	}
}

//9.70 . Дано предложение. Определить, сколько в нем гласных букв.
//bitti