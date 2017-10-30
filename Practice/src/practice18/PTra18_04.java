/*
 * PTra18_04.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice18;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class PTra18_04 {

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
        
        
       //  
        ArrayList<Integer> gk=new ArrayList<>();
        ArrayList<Integer> df=new ArrayList<>();
        ArrayList<Integer> mf=new ArrayList<>();
        ArrayList<Integer> fw=new ArrayList<>();
        
        for(int i=0; i<array.size(); i++) {
        	switch(array.get(i).getPosition()) {
			      case "GK": gk.add(i); break;
			      case "DF": df.add(i); break;
			      case "MF": mf.add(i); break;
			      case "FW": fw.add(i); break;
			      default : break;
        	}
        }
        PTra18_04 ransuu=new PTra18_04();
        ransuu.IntShuffle(gk, 1, array);
        ransuu.IntShuffle(df, 4, array);
        ransuu.IntShuffle(mf, 4, array);
        ransuu.IntShuffle(fw, 2, array);
}

		// ★ ①のArrayListの中からGK1名、DF4名、MF4名, FW2名をランダムで出力してください	
	/*
	 *  	   ArrayList<Integer> posi ； どのポジションの選手の位置情報(添え字）
	 *  
	 *  			        int people  ;  欲しい人数
	 *  
	 * 	ArrayList<EntityPlayer> meminfo ; Playerインスタンスを格納したリスト
	 */
	
	public void IntShuffle(ArrayList<Integer> posi, int people, ArrayList<EntityPlayer> meminfo) {

		Collections.shuffle(posi);
		
		// オーバーライドしたtoStringを呼び出すために使う
	    EntityPlayer overToStr=new EntityPlayer(null, null, null, null);
	   
	    for(int i=0; i<people; i++)
	    	System.out.println(overToStr.toString(meminfo, posi.get(i)));
	}
}