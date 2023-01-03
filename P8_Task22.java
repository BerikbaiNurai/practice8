import java.util.Scanner;
public class P8_Task22{
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);

		String word=in.next();
		int max=0;
		for(int i=0;i<word.length();i++){
			char a=word.charAt(i);
			if(a!='0' && a!='1' && a!='2' && a!='3' && a!='4' && a!='5' && a!='6' && a!='7' && a!='8' && a!='9'){
			}
		}
		System.out.println(word);
		String int[]=word.split("|");

		for(String s:int){
			if(!s.equals("")){
				int n= Integer.parseInt(s);
				if(max<n){
					max=n;
				}
			}
		}
		System.out.println(max);

	}
}

//9.151 Дан текст. Найти максимальное из имеющихся в нем чисел.
//bitti
        