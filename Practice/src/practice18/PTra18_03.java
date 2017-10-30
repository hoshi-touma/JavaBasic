/*
 * PTra18_03.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice18;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class PTra18_03 {

	/*
	 * PTra19_02で作成したPlayerクラスを使用します
	 */

	public static void main(String[] args) {

		/*
		 * ①
		 * ★ file/BestElevenCandidate.csvの内容を取得し、１行毎にPlayerインスタンスに情報を格納してください
		 * ★ ArrayListを作成して、Playerインスタンスを格納してください
		 */
		 ArrayList<EntityPlayer> array = new ArrayList<EntityPlayer>();
		 
	        try(Scanner scanner = new Scanner(new File("file/BestElevenCandidate.csv"))) {
	            while (scanner.hasNext()) {
	                String line = scanner.nextLine();
	              
	                String[] intoP=line.split(",",0);
	                
	                EntityPlayer temPlayer=new EntityPlayer(intoP[0], intoP[1],intoP[2] ,intoP[3] );
	            
	                array.add(temPlayer);
	                
	            }    
	        } catch (FileNotFoundException e) {
	            System.out.println("ファイルが見つかりません");
	        }

	        
	// ★ ①のArrayListの中から"レアル・マドリード", "バルセロナ"の選手を除外してください
	        int cnt=0;
			String rea="レアル・マドリード";
			String bar="バルセロナ";
		// レアルから削除
			for( int i = array.size() - 1 ; i >= 0 ; i-- ){
			
				if(rea.equals(array.get(i).getTeam())) {
				System.out.println("レアル削除 前>  ="+ array.size());
				array.remove(i);
				System.out.println("レアル削除 後>  ="+ array.size());
				}
			}
		// 続いてバルセロナ
		//	 for(int i=0; i<array.size(); i++){
			for( int i = array.size() - 1 ; i >= 0 ; i-- ){
				
				if(bar.equals(array.get(i).getTeam())) {
				System.out.println("bar削除 前> array.size()="+ array.size()+"\n         >  i="+i);
				array.remove(i); 
				System.out.println("bar削除 後> array.size()="+ array.size()+"\n         >  i="+i);
				}
				
			}
		System.out.println("cnt="+cnt);
			// ★ 削除後のArrayListの中身を全件出力してください
			EntityPlayer overToStr=new EntityPlayer(null, null, null, null);
		
			for(int i=0; i<array.size(); i++) {
				System.out.println(" ("+ (i+1) + ") "+ overToStr.toString(array,i));
			}

	}
}
