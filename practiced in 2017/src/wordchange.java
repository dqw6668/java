import java.util.Scanner;
public class wordchange {
	public static void main(String args[]){
		Scanner in=new Scanner(System.in);
		System.out.println("������Ҫת������ĸ");
		char c=in.next().charAt(0);
		if(c>='A'&&c<='Z'){
			c+=32;
		System.out.println("����Ĵ�д"+(char)(c-32)+"��ת������"+c);}
		else if(c>='a'&&c<='z'){
			c-=32;
			System.out.println("�����Сд"+(char)(c+32)+"��ת������"+c);}
			
			else{System.out.println("��ʽ����");
		}
	}

}
