import java.util.Scanner;

public class qqtext {
public static void main(String[] args){
	Scanner scan = new Scanner(System.in);
	System.out.println("������QQ�ȼ�");
	int i = scan.nextInt();
	if(i==1)
		System.out.println("��Ծ����5��");
	else if(i==4)
		System.out.println("��Ծ����32��");
	else if(i==8)
		System.out.println("��Ծ����96��");
	else if(i==12)
		System.out.println("��Ծ����192��");
	else if(i==16)
		System.out.println("��Ծ����320��");
	else if(i==32)
		System.out.println("��Ծ����1152��");
	else if(i==48)
		System.out.println("��Ծ����2496��");
	else if(i==64)
		System.out.println("��Ծ����4352��");
	else 
			System.out.println("δ֪");
}
}
