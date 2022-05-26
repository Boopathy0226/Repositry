package org.dropdown;

import java.util.Scanner;

public class DropDown {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		int j = sc.nextInt();
		for (int x = 0; x <= j; x++) {
			int z = x * i;
			System.out.println(z);
		}
	}
}