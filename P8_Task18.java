import java.util.Scanner;
public class P8_Task18{
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
        System.out.println("Enter predlozhenie");
        String word = in.nextLine();
        char soz;
        for (int i = 0; i < word.length(); i++) {
            soz= word.charAt(i);
            if (i%2!=0){
                soz = 'ы';
            }
            System.out.print( soz);
        }
	}
}

//9.92 Дано предложение. Все его символы, стоящие на четных местах, заменить 
// буквой ы.
//bitti