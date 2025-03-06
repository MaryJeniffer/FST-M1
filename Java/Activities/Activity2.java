package activities;

public class Activity2 {
 public static void main(String[] args) {
	 Activity2 obj=new Activity2();
	 int[] arr = {10, 77, 10, 54, -11, 10};
	 int searchNum=10;
	 int expectedSum=30;
	 System.out.println("Is actual sum equal to expected sum? "+obj.result(arr, searchNum, expectedSum));
 }
	 
	 public boolean result(int[] arr, int searchNum, int expectedSum) {
	 int sum=0;
		 for(int num:arr){
			 if(num==searchNum) {
				 sum+=searchNum;
			 }
			 if(sum>expectedSum) {
				 break;
			 }
		 }
		 System.out.println("Actual Sum = "+sum);
		 return sum==expectedSum;
	 }
}

