class Entity {
	protected:
		int posx, posy, posz, post;
		double hp, damage, foodval, weight, sellval, timestamp, exp;
		string name;
		float range;
		bool muted = false, playercreated, stable;
	public Entity() {
	
	}
	virtual double getKilledExp();
	virtual void addtoExp(double amount) {
		exp += amount;
	}
	
}