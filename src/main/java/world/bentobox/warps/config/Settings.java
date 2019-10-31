package world.bentobox.warps.config;

import java.util.HashSet;
import java.util.Set;

import world.bentobox.bentobox.api.configuration.ConfigComment;
import world.bentobox.bentobox.api.configuration.ConfigEntry;
import world.bentobox.bentobox.api.configuration.ConfigObject;
import world.bentobox.bentobox.api.configuration.StoreAt;


@StoreAt(filename="config.yml", path="addons/Warps")
@ConfigComment("WelcomeWarps Configuration [version]")
@ConfigComment("This config file is dynamic and saved when the server is shutdown.")
@ConfigComment("You cannot edit it while the server is running because changes will")
@ConfigComment("be lost! Use in-game settings GUI or edit when server is offline.")
@ConfigComment("")
public class Settings implements ConfigObject
{
    @ConfigComment("")
    @ConfigComment("Warp Restriction - needed levels to be able to create a warp")
    @ConfigComment("0 or negative values will disable this restriction 10 is default")
    @ConfigEntry(path = "warplevelrestriction")
    private int warpLevelRestriction = 10;

    @ConfigComment("")
    @ConfigComment("Text that player must put on sign to make it a warp sign")
    @ConfigComment("Not case sensitive!")
    @ConfigEntry(path = "welcomeLine")
    private String welcomeLine = "[Welcome]";

    @ConfigComment("")
    @ConfigComment("Icon that will be displayed in Warps list. SIGN counts for any kind of sign and the type of")
    @ConfigComment("wood used will be reflected in the panel if the server supports it.")
    @ConfigComment("It uses native Minecraft material strings, but using string 'PLAYER_HEAD', it is possible to")
    @ConfigComment("use player heads instead. Beware that Mojang API rate limiting may prevent heads from loading.")
    @ConfigEntry(path = "icon")
    private String icon = "SIGN";

    @ConfigComment("")
    @ConfigComment("This list stores GameModes in which Level addon should not work.")
    @ConfigComment("To disable addon it is necessary to write its name in new line that starts with -. Example:")
    @ConfigComment("disabled-gamemodes:")
    @ConfigComment(" - BSkyBlock")
    @ConfigEntry(path = "disabled-gamemodes")
    private Set<String> disabledGameModes = new HashSet<>();

    @ConfigComment("")
    @ConfigComment("Warp panel name formatting.")
    @ConfigComment("Example: &c will make names red. &f is white")
    @ConfigEntry(path = "name-format")
    private String nameFormat = "&f";

    @ConfigComment("")
    @ConfigComment("Warp panel default lore formatting.")
    @ConfigComment("Example: &c will make lore red. &f is white")
    @ConfigEntry(path = "lore-format")
    private String loreFormat = "&f";

    @ConfigComment("")
    @ConfigComment("Allow random teleport - adds a button to the warp panel that goes to a random warp sign")
    @ConfigEntry(path = "random-allowed")
    private boolean randomAllowed = true;

    @ConfigComment("")
    @ConfigComment("Allow use in other worlds. Players must have the welcomewarpsigns.warp permission.")
    @ConfigEntry(path = "allow-in-other-worlds")
    private boolean allowInOtherWorlds = false;

    @ConfigComment("")
    @ConfigComment("Warp and warps commands. You can change them if they clash with other addons or plugins.")
    @ConfigEntry(path = "warp-command")
    String warpCommand = "warp";
    @ConfigEntry(path = "warps-command")
    String warpsCommand = "warps";


    // ---------------------------------------------------------------------
    // Section: Constructor
    // ---------------------------------------------------------------------


    /**
     * Loads the various settings from the config.yml file into the plugin
     */
    public Settings()
    {
        // empty constructor
    }


    // ---------------------------------------------------------------------
    // Section: Methods
    // ---------------------------------------------------------------------


    /**
     * @return the warpLevelRestriction
     */
    public int getWarpLevelRestriction()
    {
        return warpLevelRestriction;
    }

    /**
     * This method sets the warpLevelRestriction object value.
     * @param warpLevelRestriction the warpLevelRestriction object new value.
     *
     */
    public void setWarpLevelRestriction(int warpLevelRestriction)
    {
        this.warpLevelRestriction = warpLevelRestriction;
    }


    /**
     * This method returns the welcomeLine object.
     * @return the welcomeLine object.
     */
    public String getWelcomeLine()
    {
        return welcomeLine;
    }


    /**
     * This method sets the welcomeLine object value.
     * @param welcomeLine the welcomeLine object new value.
     *
     */
    public void setWelcomeLine(String welcomeLine)
    {
        this.welcomeLine = welcomeLine;
    }


    /**
     * This method returns the disabledGameModes object.
     * @return the disabledGameModes object.
     */
    public Set<String> getDisabledGameModes()
    {
        return disabledGameModes;
    }


    /**
     * This method sets the disabledGameModes object value.
     * @param disabledGameModes the disabledGameModes object new value.
     *
     */
    public void setDisabledGameModes(Set<String> disabledGameModes)
    {
        this.disabledGameModes = disabledGameModes;
    }


    /**
     * This method returns the icon object.
     * @return the icon object.
     */
    public String getIcon()
    {
        return icon;
    }


    /**
     * This method sets the icon object value.
     * @param icon the icon object new value.
     */
    public void setIcon(String icon)
    {
        this.icon = icon;
    }


    /**
     * @return the nameFormat
     */
    public String getNameFormat() {
        return nameFormat;
    }


    /**
     * @param nameFormat the nameFormat to set
     */
    public void setNameFormat(String nameFormat) {
        this.nameFormat = nameFormat;
    }


    /**
     * @return the loreFormat
     */
    public String getLoreFormat() {
        return loreFormat;
    }


    /**
     * @param loreFormat the loreFormat to set
     */
    public void setLoreFormat(String loreFormat) {
        this.loreFormat = loreFormat;
    }


    /**
     * @return the randomAllowed
     */
    public boolean isRandomAllowed() {
        return randomAllowed;
    }


    /**
     * @param randomAllowed the randomAllowed to set
     */
    public void setRandomAllowed(boolean randomAllowed) {
        this.randomAllowed = randomAllowed;
    }


    /**
     * @return the allowInOtherWorlds
     */
    public boolean isAllowInOtherWorlds() {
        return allowInOtherWorlds;
    }


    /**
     * @param allowInOtherWorlds the allowInOtherWorlds to set
     */
    public void setAllowInOtherWorlds(boolean allowInOtherWorlds) {
        this.allowInOtherWorlds = allowInOtherWorlds;
    }


    /**
     * @return the warpCommand
     */
    public String getWarpCommand() {
        return warpCommand;
    }


    /**
     * @param warpCommand the warpCommand to set
     */
    public void setWarpCommand(String warpCommand) {
        this.warpCommand = warpCommand;
    }


    /**
     * @return the warpsCommand
     */
    public String getWarpsCommand() {
        return warpsCommand;
    }


    /**
     * @param warpsCommand the warpsCommand to set
     */
    public void setWarpsCommand(String warpsCommand) {
        this.warpsCommand = warpsCommand;
    }


}
