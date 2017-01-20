import java.util.Scanner;


public class TestSort {

	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number of elements to be sorted: ");
		
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter the array elements:");
		for(int i=0;i<arr.length;i++)
			arr[i] = sc.nextInt();
		
		int[] result = insertionSort(arr);
		
		System.out.println("The array after sort is: ");
		for(int i=0;i<result.length;i++)
			System.out.print(result[i]+ " ");
		
	}
	
	public static int[] insertionSort(int []arr){
		int value=0,hole=0;
		for(int i=1;i<arr.length;i++){
			value = arr[i];
			hole = i;
			
			while(hole>0 && arr[hole-1]>value){
				arr[hole] = arr[hole-1];
				hole = hole-1;
			}
			arr[hole] = value;
		}
		return arr;
	}

}
