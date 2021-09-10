package dataStructures;

import java.util.Scanner;

public class ArrayDeletion {

	public static void main(String[] args) {
		int a[], size, operation;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array : ");
		size = sc.nextInt();
		a = new int[size + 10];
		System.out.println("Enter array elements : ");
		for (int i = 0; i < size; i++) {
			a[i] = sc.nextInt();
		}
		System.out.println("The given array is : ");
		for (int i = 0; i < size; i++) {
			System.out.println(a[i]);
		}

		ArrayDeletion ad1 = new ArrayDeletion();
		do {
			System.out.println("Where do you wanna delete element? :");
			System.out.println("From the beginning of an array, enter 1 :");
			System.out.println("From the end of an array, enter 2 : ");
			System.out.println("From any specific position, enter 3: ");
			operation = sc.nextInt();
			switch (operation) {
			case 1:
				ad1.deleteAtStart(size--, a);
				break;
			case 2:
				ad1.deleteAtEnd(size--, a);
				break;
			case 3:
				ad1.deleteAtMiddle(size--, a);
				break;
			default:
				System.out.println("Invalid operation index!");
			}
		} while (operation > 0 && operation <= 3);
		sc.close();
	}

	public void deleteAtMiddle(int size, int a[]) {
		System.out.println("Enter the position of element to be deleted : ");
		Scanner s = new Scanner(System.in);
		int position = s.nextInt();
		if (position > size || position <= 0)
			System.out.println("Invalid position!");
		else {
			for (int i = position - 1; i < size - 1; i++) {
				a[i] = a[i + 1];
			}
			size--;
			System.out.println("The array becomes : ");
			for (int i = 0; i < size; i++) {
				System.out.println(a[i] + " ");
			}
		}
		s.close();
	}

	public void deleteAtStart(int size, int a[]) {
		for (int i = 0; i < size - 1; i++) {
			a[i] = a[i + 1];
		}
		size--;
		System.out.println("The array becomes : ");
		for (int i = 0; i < size; i++) {
			System.out.println(a[i] + " ");
		}
	}

	public void deleteAtEnd(int size, int a[]) {
		size--;
		System.out.println("The array becomes : ");
		for (int i = 0; i < size; i++) {
			System.out.println(a[i] + " ");
		}
	}

}
