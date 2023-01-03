public class P8_Task1{
	public static void main(String[] args) {
//1
/*		
		String word = "Hello";
		int length = word.length();
		System.out.println("String Length is: "+length);
*/

//2
/*
		String word = "Hello,Jihc!";
		char c0 = word.charAt(0);
		char c1 = word.charAt(1);
		char c2 = word.charAt(5);
		

		System.out.println("Char 0:"+c0);
		System.out.println("Char 1:"+c1);
		System.out.println("Char 5:"+c2);
*/

//3
/*
		String word = "HELLO";
		String word2 = "HELLO";
		String word3 = "hello";

		boolean res=word.equals(word2);
		boolean res2=word.equals(word3);

		boolean res3=word.equalsIgnoreCase(word3);

		System.out.println(res);
		System.out.println(res2);
		System.out.println(res3);
*/

//4
/*
		String word = "HELLO";
		String word2 = "HELLO";
		String word3 = "hello";

		boolean res=word.startsWith("H");
		boolean res2=word.startsWith("HEL");
		boolean res3=word.startsWith("hi");

		System.out.println(res);
		System.out.println(res2);
		System.out.println(res3);
*/

//5
/*
		String word = "HELLO";
		String word2 = "HELLO";
		String word3 = "hello";

		boolean res=word.endsWith("LO");
		boolean res2=word.endsWith("ok");

		System.out.println(res);
		System.out.println(res2);
*/

//6
/*
		String word = "abc";

		int t=word.indexOf("a");
		int t2=word.indexOf("b");
		int t3=word.indexOf("e");

		System.out.println(t);
		System.out.println(t2);
		System.out.println(t3);
*/

//7
/*
		String word = "abcdefa";

		int t=word.indexOf("a");
		int t2=word.indexOf("b");
		int t3=word.indexOf("e");

		System.out.println(t);
		System.out.println(t2);
		System.out.println(t3);
*/

//8
/*
		String word = "SDU";
		String newWord = word.replace('u','c');

		System.out.println(newWord);

		String word2 = "helllooou";
		word2=word2.replace('l','T');
		word2=word2.replace('o','y');
		System.out.println(word2);
*/

//9
/*
		String word = "I Love Cpp!";
		String newWord = word.replaceAll("Cpp","Java");

		System.out.println("Word: "+word);
		System.out.println("New word: "+newWord);
*/

//10
/*
		String word = "I love Cpp and Cpp";
		String newWord = word.replaceAll("Cpp","Java");

		System.out.println("Word: "+word);
		System.out.println("New word: "+newWord);

		System.out.println();
		System.out.println();

		String newWord2=word.replaceFirst("Cpp","Java");
		System.out.println("NewWord2: "+newWord2);
*/

//11
/*
		String word = "I love Java and Cpp";
		String store[]=word.split(" ");

		for(int i=0;i<store.length;i++){
			System.out.println(store[i]);
		}
		System.out.println();
		String store2[]=word.split("v");
		
		for(int i=0;i<store2.length;i++){
			System.out.println(store2[i]);
		}
		System.out.println();
		String store3[]=word.split("Java");
		
		for(int i=0;i<store3.length;i++){
			System.out.println(store3[i]);
		}
*/

//12
/*
		String word = "0123456789";
		String newWord =word.substring(0,5);

		System.out.println(newWord);
*/

//13
/*
		String word2 = "Hello,my name is Kadyrbek";
		String subWord=word2.substring(0,5);
		String subWord2=word2.substring(0,16);
		String subWord3=word2.substring(17,word2.length());

		System.out.println(subWord);
		System.out.println(subWord2);
		System.out.println(subWord3);
*/

//14
/*
		String word2 = "Hello,my name is Kadyrbek";
		String newWord=word2.toLowerCase();

		System.out.println(newWord);

		System.out.println();

		String newWord2=word2.toUpperCase();
		System.out.println(newWord2);
*/
	}
}

//copy vse
//bitti