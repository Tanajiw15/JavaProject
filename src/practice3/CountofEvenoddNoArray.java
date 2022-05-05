package practice3;

public class CountofEvenoddNoArray {

	public static void main(String[] args) {
		int a[]= {2,5,4,8,6,3};
		int ecount=0;
		int ocount=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==0) {
				ecount++;
			   }
			else {
				ocount++;
			}
		}
		System.out.println("Count of even no in array is="+ecount);
		System.out.println("Count of odd no in array is="+ocount);
	}

}
