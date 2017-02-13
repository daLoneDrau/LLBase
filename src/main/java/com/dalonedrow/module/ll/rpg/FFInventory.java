package com.dalonedrow.module.ll.rpg;

import com.dalonedrow.module.ff.constants.FFEquipmentSlots;
import com.dalonedrow.rpg.base.flyweights.InventoryData;

/**
 * 
 * @author drau
 *
 */
public final class FFInventory
		extends InventoryData<LLInteractiveObject, FFInventorySlot> {
	/** Creates a new instance of {@link FFInventory}. */
	public FFInventory() {
		FFInventorySlot[] slots =
				new FFInventorySlot[FFEquipmentSlots.getNumberOfValues()];
		for (int i = 0; i < slots.length; i++) {
			slots[i] = new FFInventorySlot();
		}
		super.setSlots(slots);
	}
	/**
	 * {@inheritDoc}
	 */
	@Override
	public void PutInFrontOfPlayer(final LLInteractiveObject itemIO,
			final boolean doNotApplyPhysics) {
		// TODO Auto-generated method stub
		
	}
}
