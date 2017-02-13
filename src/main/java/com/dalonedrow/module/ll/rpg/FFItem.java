package com.dalonedrow.module.ll.rpg;

import com.dalonedrow.rpg.base.flyweights.IOEquipItem;
import com.dalonedrow.rpg.base.flyweights.IOItemData;
import com.dalonedrow.rpg.base.flyweights.RPGException;

/**
 * @author drau
 */
public final class FFItem extends IOItemData<LLInteractiveObject> {
	/** Creates a new instance of {@link FFItem}. */
	public FFItem() {
		super.setEquipitem(new IOEquipItem());
	}

    @Override
    protected float applyCriticalModifier() {
        return 0;
    }

    @Override
    protected float calculateArmorDeflection() {
        return 0;
    }

    @Override
    protected float getBackstabModifier() {
        return 0;
    }
}
