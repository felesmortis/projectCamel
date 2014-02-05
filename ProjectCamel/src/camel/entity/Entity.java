package camel.entity;

public class Entity implements Runnable{
	protected int posx, posy, posz, post;
	protected double maxhp, hp, damage, foodval, weight, sellval, timestamp, exp;
	protected String name;
	protected float range;
	protected boolean muted = false, playercreated, stable;
	public Entity() {
		Thread t = new Thread(this);
		t.run();
	}
	public double getKilledExp() {
		return exp;
	}
	public void addtoExp(double amount) {
		exp += amount;
	}
	public double consume(double amount) {
		double diff;
		diff = Math.min(amount, hp);
		hp -= diff;
		return diff;
	}
	public void damage(double amount) {
		hp -= amount;
		hp = Math.min(0, hp);
	}
	public void talk() {
		
	}
	public void levelUp() {
		
	}
	@Override
	public void run() {
		
	}
}