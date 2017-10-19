/*
 * PTra14_02.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice14.ptra14;

import java.util.Arrays;

public class PTra14_02 {

	/*
	 * ★ common.Courseを実装した、DBCourseクラスを作成してください
	 *
	 * コース名称
	 * 		「【Eラーニング】DB基礎」
	 * 単元
	 * 		DB基礎
	 * 		SQL基礎
	 * 		正規化
	 * 		SQL応用
	 */
public static void main(String[] args) {
	practice14.common.DBCourse p14_02= new practice14.common.DBCourse();
	
	System.out.println(p14_02.getCourseName());
	
	System.out.println(Arrays.deepToString(p14_02.getCourseUnit()));
	
	System.out.println(p14_02.assu());
	
}


}
