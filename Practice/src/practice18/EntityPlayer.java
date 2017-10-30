package practice18;

import java.util.ArrayList;

public class EntityPlayer {

	private String 	position;
	private String 	name;
	private String 	country;
	private String 	team;
	
	// コンストラクタ
	public EntityPlayer(String po ,String na ,String co,String te) {
		this.position=po;
		this.name=na;
		this.country=co;
		this.team=te;
	} 
	
	
	
	// positioのアクセサ
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}

	// nameのアクセサ
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	// countryのアクセサ
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	// teamのアクセサ
	public String getTeam() {
		return team;
	}
	public void setTeam(String team) {
		this.team = team;
	}

	// toString オーバーライド
	public String toString(ArrayList<EntityPlayer> ary,int i) {

		return ary.get(i).getPosition()+','+ary.get(i).getName() +','
				+ary.get(i).getCountry()+','+ary.get(i).getTeam();
	}
	
}
