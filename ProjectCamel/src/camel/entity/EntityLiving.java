package camel.entity;

public class EntityLiving extends Entity implements IHealable {
	protected int str, lck, dex, intel, wis, cha, cum, aff, stn, wtf, fth;
	protected double mana, stamina, fap ;
	protected float pth;
	
	
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
	
}
