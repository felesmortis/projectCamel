package camel.entity;

import camel.storage.IInventory;

public class EntityItem extends Entity {
	public EntityItem() {
		muted = true;
	}
	public EntityItem pickUp() {
		return this;
	}
	public void drop(Entity/*something else*/ item) {
		/*item.drop(this.x, this.y, this.z)*/
	}
	public void give(IInventory/*change*/ inventory) {
		
	}
}
