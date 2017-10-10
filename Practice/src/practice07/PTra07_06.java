package practice07;
/*
 * PTra07_07.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

public class PTra07_06 {
	public static void main(String[] args) {

		// ★ ※2次元配列を用いています
		int[][] array = {
				{500,40,6},
				{70,8,90,1000}
		};

		// ★ 配列arrayに格納されている全ての数字の平均を出力してください
		int sum=0;
		for(int i=0; i<array.length; i++) {
			switch(i) {
			 case 0:  
				 for(int j=0; j<3; j++)
					 sum  +=array[i][j]; break;
			 case 1:
				 for(int j=0; j<4; j++)
					 sum  +=array[i][j]; break;
			}
		}
		System.out.println("合計　：" + sum);
		System.out.println("平均　：" + sum/ (array.length*3)); 
	}
}
