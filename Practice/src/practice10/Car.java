package practice10;
/*
 * 以下の仕様のクラスを作成してください（新しくJavaファイルを作成してください）
 *
 * クラス名
 * 		Car
 * フィールド
 * 		serialNo		:	int型
 * 		color			：	String型
 * 		gasoline		：	int型
 * メソッド
 * 		戻り値(int)、メソッド名(run)、引数(なし)
 * 			ガソリンを1消費して、ランダムな距離(1～15)進む（戻り値が進んだ距離）
 * 			ガソリンが負の数になった場合（もう進めない）は-1を返します。
 */
public class Car {
	int serialNo;
	String color;
	int gasolin;
	
	
	int Run(int distance) {
		int random=0;
		int count=0;
    
		while(distance>=0) {
			count++;
			random = new java.util.Random().nextInt(100);
			
			System.out.println("random="+random);
			System.out.println("distance - random =" + (distance-=random));
			
			System.out.println();
		
			System.out.println("\t実行回数は-＞"+ count+"\n");
			
			
			if(gasolin <=0)return -1;
			
		}
		
		return count;
	}

}
