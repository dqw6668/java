package Array;

public class ArrayMaxMin {
public static void main(String[] args) {
	int i,min,max;
	int A[]={32,545,23,63,125,653};
	min=max=A[0];
	System.out.println("����AΪ");
	for(i=0;i<A.length;i++){
		System.out.print(A[i]+" ");
		if(A[i]>max)max=A[i];
		if(A[i]<min)min=A[i];
	
	}	System.out.print("\n���ֵ��"+max+"\n��Сֵ��"+min);
}
	}

