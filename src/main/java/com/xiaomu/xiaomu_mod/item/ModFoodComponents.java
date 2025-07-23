package com.xiaomu.xiaomu_mod.item;

import net.minecraft.component.type.FoodComponent;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.Items;

public class ModFoodComponents {
    public static final FoodComponent TOHRU_MEAT = new FoodComponent.Builder().nutrition(4).saturationModifier(0.4f)
            .statusEffect(new StatusEffectInstance(StatusEffects.NAUSEA, 500), 1.0f)
            .statusEffect(new StatusEffectInstance(StatusEffects.POISON, 500, 1), 1.0f)
            .usingConvertsTo(Items.BONE)
            .build();

    public static final FoodComponent COOKED_TOHRU_MEAT = new FoodComponent.Builder().nutrition(8).saturationModifier(1.2f)
            .statusEffect(new StatusEffectInstance(StatusEffects.SPEED, 500, 2), 1.0f)
            .statusEffect(new StatusEffectInstance(StatusEffects.STRENGTH, 500, 2), 1.0f)
            .usingConvertsTo(Items.BONE)
            .build();

    public static final FoodComponent KOBAYASHI_BEER_CAN_FULL = new FoodComponent.Builder().nutrition(2).saturationModifier(0.3f)
            .statusEffect(new StatusEffectInstance(StatusEffects.NAUSEA, 500), 1.0f)
            .statusEffect(new StatusEffectInstance(StatusEffects.POISON, 500), 1.0f)
            .build();
}
