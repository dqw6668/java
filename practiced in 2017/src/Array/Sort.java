package Array;
import java.util.Arrays;
import java.util.Random;
public class Sort {
	public static void main(String[] args) {
		Random r=new Random();
		int[] array=new int[15];
		System.out.println("原始数组");
		for(int i=0;i<array.length;i++){
			array[i]=r.nextInt(100);
			System.out.print(" "+array[i]);
		}
 Arrays.sort(array);
System.out.println("\n"+"使用sort方法后的数组");
for(int i=0;i<array.length;i++)
{System.out.print(" "+array[i]);}
	}
}
