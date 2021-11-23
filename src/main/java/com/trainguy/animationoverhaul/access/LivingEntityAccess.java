package com.trainguy.animationoverhaul.access;

import com.trainguy.animationoverhaul.util.animation.LivingEntityAnimParams;
import net.minecraft.core.BlockPos;

public interface LivingEntityAccess {
    //float getAnimationVariable(String animationVariable);
    //void setAnimationVariable(String animationVariable, float newValue);
    void setRecordPlayerNearbyValues(String songName, boolean songPlaying, BlockPos songOrigin);
    boolean getIsSongPlaying();
    BlockPos getSongOrigin();
    String getSongName();
    String getPreviousEquippedArmor();
    void setEquippedArmor(String currentArmor);

    void setAnimationParamaters(float animationPosition, float animationSpeed, float tickAtFrame, float tickDifference, float delta, float headYRot, float headXRot, int lightInt);
    LivingEntityAnimParams getAnimationParameters();

    boolean getUseInventoryRenderer();
    void setUseInventoryRenderer(boolean bool);
}
