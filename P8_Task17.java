import java.util.Scanner;
public class P8_Task17{
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);

		System.out.println("enter predlozhenie");
		String predlozhenie=in.nextLine();

		String newpredlozhenie=predlozhenie.replaceAll("e","i");
		System.out.println(newpredlozhenie);
		
	}
}

//9.90 Дано предложение. Все буквы е в нем заменить буквой и.
//bitti