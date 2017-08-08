package other;


public class Repetition {
	public static void main(String[] args) {
		int arr[] ={7,10,1};
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
		for(int i:arr){
			System.out.println(i);
		}
	}

}
