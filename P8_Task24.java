import java.util.Scanner;
public class P8_Task24{
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String wordd = in.nextLine();
        String[] word = wordd.split(" ");
        String korotki = word[0];
        for (String word2 : word) {
            if (korotki.length() > word2.length())
                korotki = word2;
        }
        System.out.println(korotki);
		
	}
}

//9.171 Дано предложение. Найти длину его самого короткого слова.
//bitti
