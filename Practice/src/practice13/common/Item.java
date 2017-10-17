package practice13.common;

public class Item {
private String name;
private int additionalDamage;
	
// name のアクセサ
	public String getName() {
		return name;
	}
	public void setName(String Iname) {
		this.name=Iname;
	}
	
// additonDamage のアクセサ
	public int getAddition() {
		return additionalDamage;
	}
	public void setAdditon(int Anum) {
		this.additionalDamage=Anum;
	}
	
	public Item(String I,int A) {
		this.name=I;
		this.additionalDamage=A;
		System.out.println("初期値を設定しました");
	}
}
