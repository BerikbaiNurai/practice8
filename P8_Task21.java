public class P8_Task21{
	public static void main(String[] args) {
		String word="jihc 34 high coll8ege";

		for(int i=0;i<word.length();i++){
			for(int j=1;j<=9;j++){
				if(word.charAt(i)==(""+j).charAt(0)){
					System.out.println(j);
				}
			}
		}
	}
}

//9.139 . Дан текст. Напечатать все имеющиеся в нем цифры
//bitti