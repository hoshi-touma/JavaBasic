/*
 * PTra13_04.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice13.ptra13;

import practice13.common.Hero;
import practice13.common.Slime;
public class PTra13_04 {

	/*
	 * ★ PTra13_02, PTra13_03で作成した、Hero/Slimeクラスを使用します
	 */

	public static void main(String[] args) {

		/* HeroインスタンスとSlimeインスタンスを作成し、
		 * それぞれの名前に"勇者", "スライム"を設定してください
		 */
		Hero hu=new Hero();
		hu.setName("勇者");

		Slime enemy=new Slime();
		enemy.setName("スライム");

		/*
		 * ★ HeroとSlimeを、どちらかが体力０になるまで戦わせます
		 *
		 * 	●Heroの攻撃 -> ダメージ判定 -> Slimeの攻撃 -> ダメージ判定
		 * 上記を繰り返し行います
		 */
		boolean HuRe = false;
		boolean enemyRe = false;

		while(true) {

			enemyRe=enemy.damage(hu.attack());

			if(enemyRe) {
				break;
			}

	        HuRe   =hu.damage(enemy.attack());

			if(HuRe) {
				break;
			}

		}


		// ★ 勝利した方の出力を行ってください。「○○は■■との戦闘に勝利した」
		if(enemyRe) {
			System.out.println(hu.getName()+"は"+enemy.getName()+"との戦闘に勝利した");
		}
		else if(HuRe) {
			System.out.println(hu.getName()+"は"+enemy.getName()+"との戦闘に負けた");
		}

	}
}

