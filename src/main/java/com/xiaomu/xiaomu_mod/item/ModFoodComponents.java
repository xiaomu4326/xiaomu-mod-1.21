package com.xiaomu.xiaomu_mod.item;

import net.minecraft.component.type.FoodComponent;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.Items;

public class ModFoodComponents {
    public static final FoodComponent TOHRU_MEAT = new FoodComponent.Builder().nutrition(4).saturationModifier(0.4f)
            .statusEffect(new StatusEffectInstance(StatusEffects.NAUSEA, 500, 0), 1.0f)
            .statusEffect(new StatusEffectInstance(StatusEffects.POISON, 500, 1), 1.0f)
            .usingConvertsTo(Items.BONE)
            .build();

    public static final FoodComponent COOKED_TOHRU_MEAT = new FoodComponent.Builder().nutrition(6).saturationModifier(1.2f)
            .statusEffect(new StatusEffectInstance(StatusEffects.SPEED, 500, 2), 1.0f)
            .statusEffect(new StatusEffectInstance(StatusEffects.STRENGTH, 500, 2), 1.0f)
            .usingConvertsTo(Items.BONE)
            .build();

    public static final FoodComponent KOBAYASHI_BEER_CAN_FULL = new FoodComponent.Builder().nutrition(2).saturationModifier(0.3f)
            .statusEffect(new StatusEffectInstance(StatusEffects.NAUSEA, 500, 0), 1.0f)
            .statusEffect(new StatusEffectInstance(StatusEffects.SLOWNESS, 500, 0), 1.0f)
            .build();

    public static final FoodComponent ENCHANTED_GOLDEN_CARROT = new FoodComponent.Builder().nutrition(8).saturationModifier(1.4f)
            .statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 100, 1), 1.0F)
            .statusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 2400, 0), 1.0F)
            .alwaysEdible()
            .build();

    public static final FoodComponent GILDED_APPLE = new FoodComponent.Builder().nutrition(6).saturationModifier(0.5f)
            .build();

    public static final FoodComponent GOLDEN_BREAD = new FoodComponent.Builder()
            .nutrition(7)
            .saturationModifier(0.8F)
            .statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 100, 1), 1.0F)
            .statusEffect(new StatusEffectInstance(StatusEffects.SATURATION, 150, 0), 1.0F)
            .statusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 2400, 0), 1.0F)
            .alwaysEdible()
            .build();

    public static final FoodComponent ENCHANTED_GOLDEN_BREAD = new FoodComponent.Builder()
            .nutrition(4)
            .saturationModifier(1.2F)
            .statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 400, 1), 1.0F)
            .statusEffect(new StatusEffectInstance(StatusEffects.SATURATION, 600, 0), 1.0F)
            .statusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 6000, 0), 1.0F)
            .statusEffect(new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, 6000, 0), 1.0F)
            .statusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 2400, 3), 1.0F)
            .alwaysEdible()
            .build();
}
