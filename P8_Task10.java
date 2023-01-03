import java.util.Scanner;
public class P8_Task10{
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
    	System.out.println("Enter a word");
    	String word = in.next();
    
    	for (int i=word.length()-1; i>=0; i--) {
        char m = word.charAt(i);
        System.out.println(m);  
        }
	}
}

//9.42 Составить программу, которая печатает заданное слово, начиная с последней 
// буквы.
//bitti