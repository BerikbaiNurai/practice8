import java.util.Scanner;
public class P8_Task14{
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String word = in.nextLine();
        int count = 0;
        for (int i = 0; i < word.length(); i++){
            if(word.charAt(i) == ' '){
                count++;
            }
        }
        count = count + 1;
        System.out.println(count);
	}
}

//9.69 . Дан текст. Определить, сколько в нем предложений
//bitti