package com.dalonedrow.module.ll.rpg;

import com.dalonedrow.engine.sprite.base.SimplePoint;
import com.dalonedrow.engine.sprite.base.SimpleVector2;
import com.dalonedrow.rpg.base.constants.IoGlobals;
import com.dalonedrow.rpg.base.flyweights.BaseInteractiveObject;
import com.dalonedrow.rpg.base.flyweights.RPGException;

/**
 * @author drau
 */
public class LLInteractiveObject extends BaseInteractiveObject<FFItem,
        FFInventory, FFCharacter, FFNpc, FFScriptable> {
    /** door data. */
    private FFDoorData doorData;
    /** room data. */
    private FFRoomData roomData;
    /**
     * Creates a new instance of {@link LLInteractiveObject}.
     * @param id the IO id
     */
    public LLInteractiveObject(final int id) {
        super(id);
        super.setInventory(new FFInventory());
        super.getInventory().setIo(this);
        super.setItemData(new FFItem());
    }
}
