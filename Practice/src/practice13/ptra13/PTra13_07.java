/*
 * PTra13_07.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice13.ptra13;

import practice13.common.Item;
import practice13.common.Slime;
import practice13.common.SuperHero;

public class PTra13_07 {

	/*
	 * ★ common.Item, common.SuperHero, common.Slimeを使用します
	 */

	public static void main(String[] args) {

		// ★ SuperHeroインスタンスとSlimeインスタンスを作成し、それぞれの名前に"勇者（装備あり）", "スライム"を設定してください
		SuperHero SHero=new SuperHero();
		Slime Enemy=new Slime();

		SHero.setName("勇者（装備あり）");
		Enemy.setName("スライム");
		// ★ Itemクラスのインスタンスを作成し、("こんぼう", 4）をコンストラクタの引数にしてください
		Item item=new Item("こんぼう", 1);

		// ★ 作成したItemインスタンスをSuperHeroに持たせてください
		SHero.setEquipment(item);

		/*
		 * ★ SuperHeroとSlimeを、どちらかが体力０になるまで戦わせます
		 *
		 * 	●SuperHeroの攻撃 -> ダメージ判定 -> Slimeの攻撃 -> ダメージ判定
		 * 上記を繰り返し行います
		 */
		boolean HuRe = false;
		boolean enemyRe = false;

		while(true) {

			enemyRe=Enemy.damage(SHero.attack());

			if(enemyRe) {
				break;
			}

	        HuRe   =SHero.damage(Enemy.attack());

			if(HuRe) {
				break;
			}

		}

		// ★ 勝利した方の出力を行ってください。「○○は■■との戦闘に勝利した」
		if(enemyRe==true) {
			System.out.println(SHero.getName()+"は"+Enemy.getName()+"との戦闘に勝利した");
		}
		else if(HuRe==true) {
			System.out.println(SHero.getName()+"は"+Enemy.getName()+"との戦闘に負けた");
		}
		

	}
}
