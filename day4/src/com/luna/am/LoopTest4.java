package com.luna.am;

public class LoopTest4 {
	public static void main(String[] args) {

		for (int i = 4; i >= 1; i--) {

			// ฐ๘น้
			for (int j = 4; j >= i; j--) {
				System.out.print("\t");
			} // k
			for (int j = 1; j <= i; j++) {

				System.out.print("*\t");
			} // j
			System.out.println();

		} // i

	}

}
