import java.util.Scanner;
public class P8_Task20{
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);

		System.out.println("enter predlozhenie: ");
		String predlozhenie=in.nextLine();

		System.out.println("enter n1 and  n2 number: ");
		int n1=in.nextInt();
		int n2=in.nextInt();

		String check=predlozhenie.substring(0,n1);
		String check2=predlozhenie.substring(n2+1);

		System.out.println("result: "+check+check2);
	}
}

//9.112 Дано предложение. Удалить из него все символы с n1-го по n2-й (n1 n2).
//bitti