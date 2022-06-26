package com.iplank.fakestats;

import net.runelite.api.Skill;

public class ConfigGenerator {
    static int i = -1;
    public static void main(String[] args)
    {
        String s = "\t// begin autogenerated\n";
        s += generateConfig(Skill.ATTACK);
        s += generateConfig(Skill.STRENGTH);
        s += generateConfig(Skill.DEFENCE);
        s += generateConfig(Skill.RANGED);
        s += generateConfig(Skill.PRAYER);
        s += generateConfig(Skill.MAGIC);
        s += generateConfig(Skill.RUNECRAFT);
        s += generateConfig(Skill.CONSTRUCTION);
        s += generateConfig(Skill.HITPOINTS);
        s += generateConfig(Skill.AGILITY);
        s += generateConfig(Skill.HERBLORE);
        s += generateConfig(Skill.THIEVING);
        s += generateConfig(Skill.FLETCHING);
        s += generateConfig(Skill.CRAFTING);
        s += generateConfig(Skill.SLAYER);
        s += generateConfig(Skill.HUNTER);
        s += generateConfig(Skill.MINING);
        s += generateConfig(Skill.SMITHING);
        s += generateConfig(Skill.FISHING);
        s += generateConfig(Skill.COOKING);
        s += generateConfig(Skill.FIREMAKING);
        s += generateConfig(Skill.WOODCUTTING);
        s += generateConfig(Skill.FARMING);
        s += "\t// end autogenerated\n";
        System.out.println(s);
    }

    private static String generateConfig(Skill skill) {
        String skillLowercase = skill.getName().toLowerCase();
        String skillName = skill.getName();

        i++;
        String configChunkSection =
                "\t@ConfigSection(" + "\n" +
                        "\t\tname = \"" + skillName + "\"," + "\n" +
                        "\t\tdescription = \"Configure the " + skillName + " skill\"," + "\n" +
                        "\t\tclosedByDefault = true," + "\n" +
                        "\t\tposition = " + i + "\n" +
                        "\t)" + "\n" +
                        "\tString " + skillLowercase + " = \"" + skillLowercase + "\";" + "\n\n";
        i++;
        String configChunkItem1 =
                "\t@ConfigItem(" + "\n" +
                        "\t\tkeyName = \"spoof" + skillName + "\"," + "\n" +
                        "\t\tname = \"Spoof " + skillName + "\"," + "\n" +
                        "\t\tdescription = \"Whether or not to Spoof " + skillName + "\"," + "\n" +
                        "\t\tsection = " + skillLowercase + "," + "\n" +
                        "\t\tposition = " + i + "\n" +
                        "\t)" + "\n" +
                        "\tdefault boolean spoof" + skillName + "() { return false; }" + "\n\n";
        i++;
        String configChunkItem2 =
                "\t@ConfigItem(" + "\n" +
                        "\t\tkeyName = \"" + skillLowercase + "Level\"," + "\n" +
                        "\t\tname = \"Level to Spoof\"," + "\n" +
                        "\t\tdescription = \"What Level to Spoof " + skillName + " to\"," + "\n" +
                        "\t\tsection = " + skillLowercase + "," + "\n" +
                        "\t\tposition = " + i + "\n" +
                        "\t)" + "\n" +
                        "\tdefault int " + skillLowercase + "Level() { return 99; }" + "\n\n";
        return configChunkSection + configChunkItem1 + configChunkItem2;
    }
}
