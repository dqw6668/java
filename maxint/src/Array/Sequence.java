package Array;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
public class Sequence {
	public static void main(String[] args) throws IOException{
		String m=new String("");
		int[] a={0,0,0};
		BufferedReader stdin=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("�����������Կո����");
		m=stdin.readLine();
		Scanner scan=new Scanner(m);
		for(int i=0;i<3;i++){
			a[i]=scan.nextInt();
		}
		Arrays.sort(a);//�������򷽷�
		System.out.print("������������Ϊ");
		for(int i=0;i<3;i++){
			System.out.print(a[i]+" ");
		}
	}

}
