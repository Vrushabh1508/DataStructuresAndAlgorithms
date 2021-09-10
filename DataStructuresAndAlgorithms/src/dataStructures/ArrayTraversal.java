package dataStructures;

import java.util.Scanner;

public class ArrayTraversal {

	public void arrayTraversal() {
		int arr[] = new int[10];
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
		}
		sc.close();
	}

	public static void main(String[] args) {
		ArrayTraversal arr1 = new ArrayTraversal();
		arr1.arrayTraversal();
	}

}
