package sample1;

public class ArrayInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {10,20,30,40,10,11,15};
		int maxNumber=a[0];
		for(int i=0;i<a.length;i++) {
			if(maxNumber<a[i]) {
				maxNumber=a[i];
			}
		}
		System.out.println(maxNumber);
		//System.out.println(a);
		//System.out.println(a[2]);
		//to print all the numbers//
		for(int i=0;i<=3;i++) {
			System.out.println(a[i]);
		//to print in a line//
			System.out.println(a[i]+" ");
			
			//for(int i=0;i<=3;i++) {
				//if(a[i]==20) {
					//System.out.println("value is 20 "+a[i]);
					
					int b[]=new int[10];
					a[0]=10;
					a[1]=20;
					a[2]=30;
					a[8]=90;
				for(int y=0;i<a.length;i++) {
					System.out.println("value="+a[i]+" index="+i);
					}
				}
			}
		
}


