package camel.entity;

public class EntityLiving extends Entity implements IHealable {
	protected int str/*Strength*/, lck/*Luck*/, dex/*Dexterity*/, intel/*Intelligence*/, wis/*Wisdom*/, cha/*Charisma*/, cum/*Cumliness*/, 
		stn/*Stance*/, con/*Constitution*/, wtf/*What?*/, fth/*Faith*/, mnd/*Psychic*/, aff/*Magical Affinity-Unchanged*/;
	protected double mana/*Magical Energy*/, stamina/*Physical Energy*/, fap/*Divine Energy*/, ppt/*Psychic Energy*/;
	protected float pth/*Pain Threshold*/;
	public void attack(Entity target, double amount){
		target.damage(amount);
	}
	public void rest(int time) {
		
	}
	@Override
	public void heal(double amount) {
		hp += amount;
	}
	public void eat(Entity target, double amount) {
		hp = Math.min(maxhp, hp + target.consume(amount));
	}
	public void move(int direction) {
		
	}
}
