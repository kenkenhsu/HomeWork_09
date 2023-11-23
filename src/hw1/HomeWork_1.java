package hw1;

	public class HomeWork_1 {
		// 1.計算6.12兩個數值的和與積
			public static void main(String[] args) {
				int a = 6, b = 12;
				int c = a + b;
				int d = a * b;
				System.out.println("6+12的和=" + c);
				System.out.println("6*12的積=" + d);
				System.out.println("====================");

				// 2.計算兩百顆雞蛋共是幾打幾顆 1打12顆
				int e = 200;
				int dozen = 12;
				int Egg = e / dozen;
				int h = e % dozen;
				System.out.println("200顆雞蛋共是" + Egg + "打,剩餘" + h + "顆");
				System.out.println("====================");

				// 3.請由程式算出256559秒為多少天、多少小時、多少分與多少秒
				int time = 256559, hr = 24, min = 60, sec = 60;
				int dd = hr * min * sec, hh = min * sec;
				int dhms = time / dd, hms = time % dd, ms = hms % hh, ss = ms % sec;

				System.out.println("256559秒為" + dhms + "天" + (hms / hh) + "小時" + (ms / min) + "分" + ss + "秒");
				System.out.println("====================");

				// 4.請定義一個常數為3.1415(圓周率),並計算半徑為5的圓面積與圓周長
				// 圓周長=直徑 * 圓周率 ,circumference=圓周長
				final double PI = 3.14;
				int radius = 5; // 半徑=radius
				double circumference = (radius + radius) * PI;
				double circlearea = (radius * radius) * PI;
				System.out.println("圓周長等於" + circumference);
				System.out.println("圓面積等於" + circlearea);
				System.out.println("====================");
		//
//				// 某人在銀行存入150萬,銀行利率為2%,如果每年利息都繼續存入銀行,請用程式計算10年後,本
//				// 金加利息共有多少錢 (用複利計算,公式請自行google)
				
				int count, p = 1500000;
				double v = 0.02;
				double  money =  p * (1 + v);
				for (count=1;count<=10;count ++) {
					money *= (1 + v);
				}
				System.out.println("複利10年本金加利息共有"+(int) money +"元");
				System.out.println("====================");

				// 請寫一隻程式,利用System.out.println()印出以下三個運算式結果:
				System.out.println(5 + 5); // 此為資料型別整數型別"int 5",故5+5得出結果為數值10;
				System.out.println(5 + '5');// 此為資料型別"整數型別"與"字元"相加,整數型別為十進位,而char型別為16進位,相加後程式自動轉為10進位,故得出整數5+53=58;
				System.out.println(5 + "5");// 此為預設整數型別int5加上"字串"5,數值加上字串結果會轉為字串,故得出55;
			
				
			}
		}



