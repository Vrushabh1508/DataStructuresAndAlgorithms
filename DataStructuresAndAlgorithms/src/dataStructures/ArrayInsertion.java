package dataStructures;

import java.util.Scanner;

public class ArrayInsertion {
	static int a[], size, operation;

	public static void main(String[] args) {
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
		System.out.println("Enter the element to be inserted : ");
		int element = sc.nextInt();

		ArrayInsertion as1 = new ArrayInsertion();
		do {
			System.out.println("Where do you wanna insert element? :");
			System.out.println("At the beginning of an array, enter 1 :");
			System.out.println("At the end of an array, enter 2 : ");
			System.out.println("At any specific position, enter 3: ");
			operation = sc.nextInt();
			switch (operation) {
			case 1:
				as1.insertAtStart(element, a, size++);
				break;
			case 2:
				as1.insertAtLast(element, a, size++);
				break;
			case 3:
				as1.insertAtMiddle(element, a, size++);
				break;
			default:
				System.out.println("Invalid operation index!");
			}
		} while (operation > 0 && operation <= 3);
		sc.close();

	}

	public void insertAtMiddle(int element, int a[], int size) {
		System.out.println("Enter the position of new element : ");
		Scanner s = new Scanner(System.in);
		int position = s.nextInt();
		if (position > size || position <= 0)
			System.out.println("Invalid position!");
		else {
			for (int i = size - 1; i >= position - 1; i--) {
				a[i + 1] = a[i];
			}
			a[position - 1] = element;
			size++;
			System.out.println("The array becomes : ");
			for (int i = 0; i < size; i++) {
				System.out.println(a[i] + " ");
			}
		}

		s.close();
	}

	public void insertAtStart(int element, int a[], int size) {
		for (int i = size - 1; i >= 0; i--) {
			a[i + 1] = a[i];
		}
		a[0] = element;
		size++;
		System.out.println("The array becomes : ");
		for (int i = 0; i < size; i++) {
			System.out.println(a[i] + " ");
		}
	}

	public void insertAtLast(int element, int a[], int size) {
		a[size] = element;
		size++;
		System.out.println("The array becomes : ");
		for (int i = 0; i < size; i++) {
			System.out.println(a[i] + " ");
		}
	}
}
