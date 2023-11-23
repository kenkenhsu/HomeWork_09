package hw1;

public class HomeWork_4 {
	public static void main(String[] args) {
		int[] intArray = { 29, 100, 39, 41, 50, 8, 66, 77, 95, 15 };
		int avg = 0, sum = 0;
		for (int i = 0; i < intArray.length; i++)
			sum = sum + intArray[i];
		avg = sum / intArray.length;
		for (int a = 0;  a < avg; a++) {
			System.out.println("大於平均值的數有：" + a);
		}
		System.out.println("所有元素的平均值為： " + avg);
		
	}
}
