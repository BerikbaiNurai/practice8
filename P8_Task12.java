public class P8_Task12{
	public static void main(String[] args) {
		String word="Hello JIHC, now are you?";
		char c1='a';
		char c2='o';
		
		for(int i=0;i<word.length();i++){
			char c=word.charAt(i);
			if(c==c1 || c==c2){
				System.out.println(i+" "+c);
			}
		}
	}
}

//9.55 Дано предложение. Составить программу, которая выводит все вхождения 
// в предложение двух заданных символов.
//bitti