import java.util.Scanner;
public class P8_Task13{
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
        System.out.println("Enter word");
        String word = in.nextLine();
        int soz = word.length();
        int count = 0;
        for (int i = 0; i < word.length(); i++) {
            if(word.charAt(i)=='a') {
            count++;
            }
        }
        System.out.println(count);
        System.out.println(word+": "+soz);
        int procent = (count * 100)/soz;
        System.out.println(procent + "%");	
	}
}

//9.62 . Дано предложение. Определить долю (в %) букв а в нем.
//bitti