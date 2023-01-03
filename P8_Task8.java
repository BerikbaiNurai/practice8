import java.util.Scanner;
public class P8_Task8{
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter even word");
		String word = in.next();
//1)
/*
	    int soz = word.length()/2;
	    int soz2 = word.length()/2;
	    String subword = word.substring(0,soz);
	    String subword2 = word.substring(soz2);
	    System.out.println(subword2+""+subword);
*/
//2)

	    int soz2 = word.length()/2;
        String n = "";
        String n1 = "";
	    for (int i=0; i<word.length()/2; i++) {
	    	n = n + word.charAt(i);
	    	n1 = n1 + word.charAt(soz2+i);
	    }
	    System.out.println(n1+n);
   
	}
}
 
//9.37 Дано слово из четного числа букв. Поменять местами его половины. Задачу 
// решить двумя способами:
// 1) без использования оператора цикла;
// 2) с использованием оператора цикла.
//bitti
