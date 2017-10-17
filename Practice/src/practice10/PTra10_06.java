package practice10;
/*
 * PTra10_06.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

public class PTra10_06 {

	/*
	 * PTra10_05で作成したCarクラスを使用します
	 */

	public static void main(String[] args) {
int distance=300;
		/*
		 * carインスタンスを3件作成し、それぞれの色、ガソリンを入力して決定してください
		 * 各carインスタンスのrunメソッドを実行して、
		 * それぞれ「目的地にまでn時間かかりました。残りのガソリンは、xリットルです」を出力してください。
		 */
		Car car1=new Car();
		Car car2=new Car();
		Car car3=new Car();
	//car1---------	
		car1.color  ="blue";
		car1.gasolin=10;
	
		int count1=0;
		count1=car1.Run(distance);
		
		if(count1==-1)
			System.out.println("目的地に到達できませんでした");
		else 
			System.out.println("目的地までは"+count1+"時間かかりました。"
					+ "残りのガソリンは"+(car1.gasolin-count1));
	// car2--------
		car2.color  ="bronz";
		car2.gasolin=30;
	
		int count2=0;
		count2=car2.Run(distance);
		
		if(count2==-1)
			System.out.println("目的地に到達できませんでした");
		else 
			System.out.println("目的地までは"+count2+"時間かかりました。"
					+ "残りのガソリンは"+(car2.gasolin-count2));
	//car3---------
		car3.color  ="orange";
		car3.gasolin=700;

			int count3=0;
			count3=car3.Run(distance);
			
			if(count3==-1)
				System.out.println("目的地に到達できませんでした");
			else 
				System.out.println("目的地までは"+count3+"時間かかりました。"
						+ "残りのガソリンは"+(car3.gasolin-count3));
	
	}
}
