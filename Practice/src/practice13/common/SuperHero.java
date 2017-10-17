package practice13.common;


public class SuperHero extends Hero {

private Item equipment=new Item(getName(), getEndurance());



	public int attack() {
		return super.attack() + this.getEndurance();
	}


// equipmentのアクセサ
	public Item getEquipment() {
		return equipment;
	}

	public void setEquipment(Item equipment) {
		this.equipment = equipment;
	}

}
