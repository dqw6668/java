import java.util.Scanner;
public class judge {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("����һ�����");
		long year;
		try{
			year = scan.nextLong();
			if(year%4==0&&year%100!=0||year%400==0){
				System.out.println(year+"������");
			}
			else{
				System.out.println(year+"��������");
			}
		}catch (Exception e){System.out.println("�����������");}
	
	}

}
