import java.util.Scanner;
public class P8_Task4{
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("soz jaz");
	    String word = in.next();

	    int l = word.length();
	    char c1 = word.charAt(0);
	    char c2 = word.charAt(l-1);
  
        if (c1 == c2) {
          System.out.println("true");
        }else {
          System.out.println("false");
        }
	}
}

//9.17 . Дано слово. Верно ли, что оно начинается и оканчивается на одну и ту же 
// букву?
//bitti