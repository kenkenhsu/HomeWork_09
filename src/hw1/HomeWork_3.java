package hw1;

import java.util.Scanner;

public class HomeWork_3 {
	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("請輸入三個整數:");
//		int a = sc.nextInt();
//		int b = sc.nextInt();
//		int c = sc.nextInt();
//		sc.close();
//
//		if (a + b < c || b + c < a || a + c < b) {
//			System.out.println("不是三角形");
//		} else if (a <= 0 || b <= 0 || c <= 0) {
//			System.out.println("不是三角形");
//		} else if (a == b && b == c && c == a) {
//			System.out.println("正三角形");
//		} else if (a == b || b == c || c == a) {
//			System.out.println("等腰三角形");
//		} else {
//			System.out.println("其他三角形");
//		}

//	}
		// 請設計一隻程式,會亂數產生一個0~9的數字,然後可以玩猜數字遊戲,猜錯會顯示錯誤訊息,猜對則顯示正確訊息,如圖示結果:
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int i = (int) (Math.random() * 10) + 1;
//		System.out.println("請輸入一個整數:");
//		while (true) {
//			int ans = sc.nextInt();
//			if (ans != i) {
//				System.out.println("猜錯了，請再輸入一個整數");
//			} else {
//				System.out.println("恭喜你賽到,答案了是:" + ans);
//				break;
//			}
//			
//		}
		// 3.阿文樂透
		Scanner sc = new Scanner(System.in);
		System.out.println("請輸入討厭的數字:");
		int a = sc.nextInt();
		int c = 0;
		int d = 10;
		if (a <= 9) {
			System.out.println("可以選的數字");
		for (int b = 1; b <= 49; b++) {
			if (a != b) {
				if (b % d == a) {
				} else if (b / d == a) {
				} else {
					System.out.print(b + " ");
					c++;
				}
			}
		} 
		System.out.println(" ");
		System.out.println("總共有" + c + "可以選");
		}
		else {
		System.out.println("您輸入的數字大於9,請重新來過");
		}
	}
}
