package me.mrdaniel.adventuremmo.catalogtypes.abilities;

import com.google.common.collect.Lists;
import me.mrdaniel.adventuremmo.catalogtypes.abilities.abilities.SuperTool;
import me.mrdaniel.adventuremmo.catalogtypes.tools.ToolTypes;

import javax.annotation.Nonnull;
import java.util.List;
import java.util.Optional;

public final class Abilities {

	private Abilities() {
	}

	public static final ActiveAbility MAD_MINER = new ActiveAbility("Mad Miner", "madminer",
			new SuperTool(ToolTypes.PICKAXE));
	public static final ActiveAbility GIGA_DRILL = new ActiveAbility("Giga Drill", "gigadrill",
			new SuperTool(ToolTypes.SHOVEL));
	public static final ActiveAbility TREE_FELLER = new ActiveAbility("Tree Feller", "treefeller",
			ActiveAbilityActions.EMPTY);
	public static final ActiveAbility FISH_FRENZY = new ActiveAbility("Fish Frenzy", "fishfrenzy",
			new SuperTool(ToolTypes.ROD));
	public static final ActiveAbility GREEN_THUMBS = new ActiveAbility("Green Thumbs", "greenthumbs",
			ActiveAbilityActions.EMPTY);
	public static final ActiveAbility BLOODSHED = new ActiveAbility("Bloodshed", "bloodshed",
			ActiveAbilityActions.EMPTY);
	public static final ActiveAbility SLAUGHTER = new ActiveAbility("Slaughter", "slaughter",
			ActiveAbilityActions.EMPTY);
	public static final ActiveAbility SAITAMA_PUNCH = new ActiveAbility("Saitama Punch", "saitamapunch",
			ActiveAbilityActions.EMPTY);

	public static final PassiveAbility ROLL = new PassiveAbility("Roll", "roll");
	public static final PassiveAbility DODGE = new PassiveAbility("Dodge", "dodge");
	public static final PassiveAbility DISARM = new PassiveAbility("Disarm", "disarm");
	public static final PassiveAbility DECAPITATE = new PassiveAbility("Decapitate", "decapitate");
	public static final PassiveAbility ARROW_RAIN = new PassiveAbility("Arrow Rain", "arrowrain");
	public static final PassiveAbility TREASURE_HUNT = new PassiveAbility("Treasure Hunt", "treasurehunt");
	public static final PassiveAbility WATER_TREASURE = new PassiveAbility("Water Treasure", "watertreasure");
	public static final PassiveAbility DOUBLE_DROP = new PassiveAbility("Double Drop", "doubledrop");

	public static final List<Ability> VALUES = Lists.newArrayList(MAD_MINER, GIGA_DRILL, TREE_FELLER, FISH_FRENZY,
			GREEN_THUMBS, BLOODSHED, SLAUGHTER, SAITAMA_PUNCH, ROLL, DODGE, DISARM, DECAPITATE, ARROW_RAIN,
			TREASURE_HUNT, WATER_TREASURE, DOUBLE_DROP);

	@Nonnull
	public static Optional<Ability> of(@Nonnull final String id) {
		for (Ability type : VALUES) {
			if (type.getId().equalsIgnoreCase(id)) {
				return Optional.of(type);
			}
		}
		return Optional.empty();
	}
}