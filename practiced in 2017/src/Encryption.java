import java.util.Scanner;
public class Encryption {
public static void main(String[] args){
	Scanner scan=new Scanner(System.in);
	System.out.println("������һ��Ӣ���ַ���������ַ���");
	String password= scan.nextLine();
	char[] array=password.toCharArray();
	for(int i=0;i<array.length;i++)
		{array[i]=(char)(array[i]^20000);}
	System.out.println("�������");
System.out.println(new String(array));	
}

}

