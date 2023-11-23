package hw1;

public class HomeWork_2 {
	public static void main(String[] args) {
		// 請設計一隻Java程式,計算1~1000的偶數和 (2+4+6+8+...+1000)
//		int i = 1;
//		int j = 0;
//		for (i = 1; i <= 1000; i++)
//			if (i % 2 == 0) {
//				j += i;
//			}
//		System.out.println(j);
//		System.out.println("=====================================");
//
//		// 請設計一隻Java程式,計算1~10的連乘積 (1*2*3*...*10) (用for迴圈)
//		int a = 1;
//		int b = 1;
//		for (a = 1; a <= 10; a++) {
//			b = a * b;
//		}
//		System.out.println(b);
//		System.out.println("=====================================");
//
//		int c = 1;
//		int d = 1;
//		while (c <= 10) {
//			d = c * d;
//			c++;
//		}
//		System.out.println(d);
//		System.out.println("=====================================");
//
//		// 請設計一隻Java程式,輸出結果為以下:1 4 9 16 25 36 49 64 81 100
//		int n = 1, k = 0;
//		for (n = 1; k < 100; n += 2) {
//			if (n % 2 != 0)
//				k += n;
//			System.out.print(k + " ");
//		}
//		System.out.println("");
//		System.out.println("=====================================");

//		/*
//		 * 阿文很熱衷大樂透 (1 ~ 49),但他不喜歡有4的數字,不論是個位數或是十位數。請設計一隻程式, 輸出結果為阿文可以選擇的數字有哪些?總共有幾個?
//		 */
		int l = 10, r = 0;
		for (int t = 1; t <= 49; t++) {
			if (t % l == 4) {
			} else if (t / l == 4) {
			} else {
				System.out.print(t + " ");
				r++;
			}
		}
		System.out.println("共" + r + "個");
		System.out.println("=====================================");
		
		// 請設計一隻Java程式,輸出結果為以下:
//		for (int z =10; z >= 1; z--) {
//			for (int x = 1; x <=z; x++) {
//				System.out.print(x);
//			}
//			System.out.println(" ");
//		}
//		System.out.println("=====================================");
		//請設計一隻Java程式,輸出結果為以下:
//		for (int z = 1; z <= 6; z++) {
//			for (int x = 1; x <= z; x++);
//			switch (z) {
//			case 1:
//				System.out.println("A");
//				break;
//			case 2:
//				System.out.println("BB");
//				break;
//			case 3:
//				System.out.println("CCC");
//				break;
//			case 4:
//				System.out.println("DDDD");
//				break;
//			case 5:
//				System.out.println("EEEEE");
//				break;
//			case 6:
//				System.out.println("FFFFFF");
//				break;
//			}
//		}
//		System.out.println("=====================================");
	}
}
