package com.iplank.fakestats;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigSection;
import net.runelite.client.config.ConfigItem;
import net.runelite.client.config.Range;

@ConfigGroup("fakestats")
public interface FakeStatsConfig extends Config
{
	@ConfigItem(
			keyName = "fakeSpoofTotal",
			name = "Spoof Fake Total Level",
			description = "Set Total to Include Spoofed Levels",
			position = -5
	)
	default boolean fakeSpoofTotal() { return true; }

	@ConfigItem(
			keyName = "virtualLevels",
			name = "Enable Virtual Levels",
			description = "Enable Levels 100-126",
			position = -4
	)
	default boolean virtualLevels() { return false; }

	@ConfigItem(
			keyName = "virtualTotal",
			name = "Spoof Fake Virtual Total Level",
			description = "Whether or not to Spoof the Virtual Total Level<br>" +
					"NOTE: Must Enable 'Spoof Fake Total'!",
			position = -3
	)
	default boolean virtualTotal() { return false; }

	enum ModePresets {
		NONE,
		All_200M,
		Maxed,
		Level_Three
	}

	@ConfigItem(
			keyName = "preset",
			name = "Preset Mode",
			description = "Toggle Various Presets for Skills and Total!<br>" +
					"WARNING: Overrides Other Settings!",
			position = -2
	)
	default ModePresets preset() { return ModePresets.NONE; }

	@ConfigSection(
			name = "Total Level",
			description = "Configure the Total Level",
			closedByDefault = true,
			position = -1
	)
	String totalLevelSection = "totalLevelSection";

	@ConfigItem(
			keyName = "spooftotal",
			name = "Spoof Total Level",
			description = "Whether or not to Spoof the Total Level",
			section = totalLevelSection,
			position = 0
	)
	default boolean spoofTotal() { return false; }

	@ConfigItem(
			keyName = "totalLevel",
			name = "Level to Spoof",
			description = "What Level to Spoof the Total Level to<br>" +
					"WARNING: Doesn't Account for Stat Values",
			section = totalLevelSection,
			position = 1
	)
	default int totalLevel() { return 9001; }

	@ConfigItem(
			keyName = "overrideTotalText",
			name = "Override Total Level Text",
			description = "Whether or not to Spoof the Total Level Text",
			section = totalLevelSection,
			position = 2
	)
	default boolean overrideTotalText() { return false; }

	@ConfigItem(
			keyName = "totalLevelText",
			name = "Text to Spoof",
			description = "What Level to Spoof the Total Level Text to<br>" +
					"Use \"br\" inside \"<>\" to signify a new line!",
			section = totalLevelSection,
			position = 3
	)
	default String totalLevelText() { return "Total level:<br>Hello World"; }

	// begin autogenerated
	@ConfigSection(
			name = "Attack",
			description = "Configure the Attack skill",
			closedByDefault = true,
			position = 0
	)
	String attack = "attack";

	@ConfigItem(
			keyName = "spoofAttack",
			name = "Spoof Attack",
			description = "Whether or not to Spoof Attack",
			section = attack,
			position = 1
	)
	default boolean spoofAttack() { return false; }

	@Range(
			min = 1,
			max = 126
	)
	@ConfigItem(
			keyName = "attackLevel",
			name = "Level to Spoof",
			description = "What Level to Spoof Attack to",
			section = attack,
			position = 2
	)
	default int attackLevel() { return 99; }

	@ConfigSection(
			name = "Strength",
			description = "Configure the Strength skill",
			closedByDefault = true,
			position = 3
	)
	String strength = "strength";

	@ConfigItem(
			keyName = "spoofStrength",
			name = "Spoof Strength",
			description = "Whether or not to Spoof Strength",
			section = strength,
			position = 4
	)
	default boolean spoofStrength() { return false; }

	@Range(
			min = 1,
			max = 126
	)
	@ConfigItem(
			keyName = "strengthLevel",
			name = "Level to Spoof",
			description = "What Level to Spoof Strength to",
			section = strength,
			position = 5
	)
	default int strengthLevel() { return 99; }

	@ConfigSection(
			name = "Defence",
			description = "Configure the Defence skill",
			closedByDefault = true,
			position = 6
	)
	String defence = "defence";

	@ConfigItem(
			keyName = "spoofDefence",
			name = "Spoof Defence",
			description = "Whether or not to Spoof Defence",
			section = defence,
			position = 7
	)
	default boolean spoofDefence() { return false; }

	@Range(
			min = 1,
			max = 126
	)
	@ConfigItem(
			keyName = "defenceLevel",
			name = "Level to Spoof",
			description = "What Level to Spoof Defence to",
			section = defence,
			position = 8
	)
	default int defenceLevel() { return 99; }

	@ConfigSection(
			name = "Ranged",
			description = "Configure the Ranged skill",
			closedByDefault = true,
			position = 9
	)
	String ranged = "ranged";

	@ConfigItem(
			keyName = "spoofRanged",
			name = "Spoof Ranged",
			description = "Whether or not to Spoof Ranged",
			section = ranged,
			position = 10
	)
	default boolean spoofRanged() { return false; }

	@Range(
			min = 1,
			max = 126
	)
	@ConfigItem(
			keyName = "rangedLevel",
			name = "Level to Spoof",
			description = "What Level to Spoof Ranged to",
			section = ranged,
			position = 11
	)
	default int rangedLevel() { return 99; }

	@ConfigSection(
			name = "Prayer",
			description = "Configure the Prayer skill",
			closedByDefault = true,
			position = 12
	)
	String prayer = "prayer";

	@ConfigItem(
			keyName = "spoofPrayer",
			name = "Spoof Prayer",
			description = "Whether or not to Spoof Prayer",
			section = prayer,
			position = 13
	)
	default boolean spoofPrayer() { return false; }

	@Range(
			min = 1,
			max = 126
	)
	@ConfigItem(
			keyName = "prayerLevel",
			name = "Level to Spoof",
			description = "What Level to Spoof Prayer to",
			section = prayer,
			position = 14
	)
	default int prayerLevel() { return 99; }

	@ConfigSection(
			name = "Magic",
			description = "Configure the Magic skill",
			closedByDefault = true,
			position = 15
	)
	String magic = "magic";

	@ConfigItem(
			keyName = "spoofMagic",
			name = "Spoof Magic",
			description = "Whether or not to Spoof Magic",
			section = magic,
			position = 16
	)
	default boolean spoofMagic() { return false; }

	@Range(
			min = 1,
			max = 126
	)
	@ConfigItem(
			keyName = "magicLevel",
			name = "Level to Spoof",
			description = "What Level to Spoof Magic to",
			section = magic,
			position = 17
	)
	default int magicLevel() { return 99; }

	@ConfigSection(
			name = "Runecraft",
			description = "Configure the Runecraft skill",
			closedByDefault = true,
			position = 18
	)
	String runecraft = "runecraft";

	@ConfigItem(
			keyName = "spoofRunecraft",
			name = "Spoof Runecraft",
			description = "Whether or not to Spoof Runecraft",
			section = runecraft,
			position = 19
	)
	default boolean spoofRunecraft() { return false; }

	@Range(
			min = 1,
			max = 126
	)
	@ConfigItem(
			keyName = "runecraftLevel",
			name = "Level to Spoof",
			description = "What Level to Spoof Runecraft to",
			section = runecraft,
			position = 20
	)
	default int runecraftLevel() { return 99; }

	@ConfigSection(
			name = "Construction",
			description = "Configure the Construction skill",
			closedByDefault = true,
			position = 21
	)
	String construction = "construction";

	@ConfigItem(
			keyName = "spoofConstruction",
			name = "Spoof Construction",
			description = "Whether or not to Spoof Construction",
			section = construction,
			position = 22
	)
	default boolean spoofConstruction() { return false; }

	@Range(
			min = 1,
			max = 126
	)
	@ConfigItem(
			keyName = "constructionLevel",
			name = "Level to Spoof",
			description = "What Level to Spoof Construction to",
			section = construction,
			position = 23
	)
	default int constructionLevel() { return 99; }

	@ConfigSection(
			name = "Hitpoints",
			description = "Configure the Hitpoints skill",
			closedByDefault = true,
			position = 24
	)
	String hitpoints = "hitpoints";

	@ConfigItem(
			keyName = "spoofHitpoints",
			name = "Spoof Hitpoints",
			description = "Whether or not to Spoof Hitpoints",
			section = hitpoints,
			position = 25
	)
	default boolean spoofHitpoints() { return false; }

	@Range(
			min = 1,
			max = 126
	)
	@ConfigItem(
			keyName = "hitpointsLevel",
			name = "Level to Spoof",
			description = "What Level to Spoof Hitpoints to",
			section = hitpoints,
			position = 26
	)
	default int hitpointsLevel() { return 99; }

	@ConfigSection(
			name = "Agility",
			description = "Configure the Agility skill",
			closedByDefault = true,
			position = 27
	)
	String agility = "agility";

	@ConfigItem(
			keyName = "spoofAgility",
			name = "Spoof Agility",
			description = "Whether or not to Spoof Agility",
			section = agility,
			position = 28
	)
	default boolean spoofAgility() { return false; }

	@Range(
			min = 1,
			max = 126
	)
	@ConfigItem(
			keyName = "agilityLevel",
			name = "Level to Spoof",
			description = "What Level to Spoof Agility to",
			section = agility,
			position = 29
	)
	default int agilityLevel() { return 99; }

	@ConfigSection(
			name = "Herblore",
			description = "Configure the Herblore skill",
			closedByDefault = true,
			position = 30
	)
	String herblore = "herblore";

	@ConfigItem(
			keyName = "spoofHerblore",
			name = "Spoof Herblore",
			description = "Whether or not to Spoof Herblore",
			section = herblore,
			position = 31
	)
	default boolean spoofHerblore() { return false; }

	@Range(
			min = 1,
			max = 126
	)
	@ConfigItem(
			keyName = "herbloreLevel",
			name = "Level to Spoof",
			description = "What Level to Spoof Herblore to",
			section = herblore,
			position = 32
	)
	default int herbloreLevel() { return 99; }

	@ConfigSection(
			name = "Thieving",
			description = "Configure the Thieving skill",
			closedByDefault = true,
			position = 33
	)
	String thieving = "thieving";

	@ConfigItem(
			keyName = "spoofThieving",
			name = "Spoof Thieving",
			description = "Whether or not to Spoof Thieving",
			section = thieving,
			position = 34
	)
	default boolean spoofThieving() { return false; }

	@Range(
			min = 1,
			max = 126
	)
	@ConfigItem(
			keyName = "thievingLevel",
			name = "Level to Spoof",
			description = "What Level to Spoof Thieving to",
			section = thieving,
			position = 35
	)
	default int thievingLevel() { return 99; }

	@ConfigSection(
			name = "Crafting",
			description = "Configure the Crafting skill",
			closedByDefault = true,
			position = 36
	)
	String crafting = "crafting";

	@ConfigItem(
			keyName = "spoofCrafting",
			name = "Spoof Crafting",
			description = "Whether or not to Spoof Crafting",
			section = crafting,
			position = 37
	)
	default boolean spoofCrafting() { return false; }

	@Range(
			min = 1,
			max = 126
	)
	@ConfigItem(
			keyName = "craftingLevel",
			name = "Level to Spoof",
			description = "What Level to Spoof Crafting to",
			section = crafting,
			position = 38
	)
	default int craftingLevel() { return 99; }

	@ConfigSection(
			name = "Fletching",
			description = "Configure the Fletching skill",
			closedByDefault = true,
			position = 39
	)
	String fletching = "fletching";

	@ConfigItem(
			keyName = "spoofFletching",
			name = "Spoof Fletching",
			description = "Whether or not to Spoof Fletching",
			section = fletching,
			position = 40
	)
	default boolean spoofFletching() { return false; }

	@Range(
			min = 1,
			max = 126
	)
	@ConfigItem(
			keyName = "fletchingLevel",
			name = "Level to Spoof",
			description = "What Level to Spoof Fletching to",
			section = fletching,
			position = 41
	)
	default int fletchingLevel() { return 99; }

	@ConfigSection(
			name = "Slayer",
			description = "Configure the Slayer skill",
			closedByDefault = true,
			position = 42
	)
	String slayer = "slayer";

	@ConfigItem(
			keyName = "spoofSlayer",
			name = "Spoof Slayer",
			description = "Whether or not to Spoof Slayer",
			section = slayer,
			position = 43
	)
	default boolean spoofSlayer() { return false; }

	@Range(
			min = 1,
			max = 126
	)
	@ConfigItem(
			keyName = "slayerLevel",
			name = "Level to Spoof",
			description = "What Level to Spoof Slayer to",
			section = slayer,
			position = 44
	)
	default int slayerLevel() { return 99; }

	@ConfigSection(
			name = "Hunter",
			description = "Configure the Hunter skill",
			closedByDefault = true,
			position = 45
	)
	String hunter = "hunter";

	@ConfigItem(
			keyName = "spoofHunter",
			name = "Spoof Hunter",
			description = "Whether or not to Spoof Hunter",
			section = hunter,
			position = 46
	)
	default boolean spoofHunter() { return false; }

	@Range(
			min = 1,
			max = 126
	)
	@ConfigItem(
			keyName = "hunterLevel",
			name = "Level to Spoof",
			description = "What Level to Spoof Hunter to",
			section = hunter,
			position = 47
	)
	default int hunterLevel() { return 99; }

	@ConfigSection(
			name = "Mining",
			description = "Configure the Mining skill",
			closedByDefault = true,
			position = 48
	)
	String mining = "mining";

	@ConfigItem(
			keyName = "spoofMining",
			name = "Spoof Mining",
			description = "Whether or not to Spoof Mining",
			section = mining,
			position = 49
	)
	default boolean spoofMining() { return false; }

	@Range(
			min = 1,
			max = 126
	)
	@ConfigItem(
			keyName = "miningLevel",
			name = "Level to Spoof",
			description = "What Level to Spoof Mining to",
			section = mining,
			position = 50
	)
	default int miningLevel() { return 99; }

	@ConfigSection(
			name = "Smithing",
			description = "Configure the Smithing skill",
			closedByDefault = true,
			position = 51
	)
	String smithing = "smithing";

	@ConfigItem(
			keyName = "spoofSmithing",
			name = "Spoof Smithing",
			description = "Whether or not to Spoof Smithing",
			section = smithing,
			position = 52
	)
	default boolean spoofSmithing() { return false; }

	@Range(
			min = 1,
			max = 126
	)
	@ConfigItem(
			keyName = "smithingLevel",
			name = "Level to Spoof",
			description = "What Level to Spoof Smithing to",
			section = smithing,
			position = 53
	)
	default int smithingLevel() { return 99; }

	@ConfigSection(
			name = "Fishing",
			description = "Configure the Fishing skill",
			closedByDefault = true,
			position = 54
	)
	String fishing = "fishing";

	@ConfigItem(
			keyName = "spoofFishing",
			name = "Spoof Fishing",
			description = "Whether or not to Spoof Fishing",
			section = fishing,
			position = 55
	)
	default boolean spoofFishing() { return false; }

	@Range(
			min = 1,
			max = 126
	)
	@ConfigItem(
			keyName = "fishingLevel",
			name = "Level to Spoof",
			description = "What Level to Spoof Fishing to",
			section = fishing,
			position = 56
	)
	default int fishingLevel() { return 99; }

	@ConfigSection(
			name = "Cooking",
			description = "Configure the Cooking skill",
			closedByDefault = true,
			position = 57
	)
	String cooking = "cooking";

	@ConfigItem(
			keyName = "spoofCooking",
			name = "Spoof Cooking",
			description = "Whether or not to Spoof Cooking",
			section = cooking,
			position = 58
	)
	default boolean spoofCooking() { return false; }

	@Range(
			min = 1,
			max = 126
	)
	@ConfigItem(
			keyName = "cookingLevel",
			name = "Level to Spoof",
			description = "What Level to Spoof Cooking to",
			section = cooking,
			position = 59
	)
	default int cookingLevel() { return 99; }

	@ConfigSection(
			name = "Firemaking",
			description = "Configure the Firemaking skill",
			closedByDefault = true,
			position = 60
	)
	String firemaking = "firemaking";

	@ConfigItem(
			keyName = "spoofFiremaking",
			name = "Spoof Firemaking",
			description = "Whether or not to Spoof Firemaking",
			section = firemaking,
			position = 61
	)
	default boolean spoofFiremaking() { return false; }

	@Range(
			min = 1,
			max = 126
	)
	@ConfigItem(
			keyName = "firemakingLevel",
			name = "Level to Spoof",
			description = "What Level to Spoof Firemaking to",
			section = firemaking,
			position = 62
	)
	default int firemakingLevel() { return 99; }

	@ConfigSection(
			name = "Woodcutting",
			description = "Configure the Woodcutting skill",
			closedByDefault = true,
			position = 63
	)
	String woodcutting = "woodcutting";

	@ConfigItem(
			keyName = "spoofWoodcutting",
			name = "Spoof Woodcutting",
			description = "Whether or not to Spoof Woodcutting",
			section = woodcutting,
			position = 64
	)
	default boolean spoofWoodcutting() { return false; }

	@Range(
			min = 1,
			max = 126
	)
	@ConfigItem(
			keyName = "woodcuttingLevel",
			name = "Level to Spoof",
			description = "What Level to Spoof Woodcutting to",
			section = woodcutting,
			position = 65
	)
	default int woodcuttingLevel() { return 99; }

	@ConfigSection(
			name = "Farming",
			description = "Configure the Farming skill",
			closedByDefault = true,
			position = 66
	)
	String farming = "farming";

	@ConfigItem(
			keyName = "spoofFarming",
			name = "Spoof Farming",
			description = "Whether or not to Spoof Farming",
			section = farming,
			position = 67
	)
	default boolean spoofFarming() { return false; }

	@Range(
			min = 1,
			max = 126
	)
	@ConfigItem(
			keyName = "farmingLevel",
			name = "Level to Spoof",
			description = "What Level to Spoof Farming to",
			section = farming,
			position = 68
	)
	default int farmingLevel() { return 99; }
	// end autogenerated
}
