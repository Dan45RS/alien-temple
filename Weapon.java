package Alien_Temple;

class Weapon extends Item
{
    /*
    private Item weaponName;
    private Item weaponDescription;
    */
    private String weaponStats;
    private int dmgOutput;

    public Item weaponName()
    {
        return weaponName;
    }

    public Item weaponDescription()
    {
        return weaponDescription;
    }

    public String getWeaponStats()
    {
        return weaponStats;
    }

    public int getDmgOutput()
    {
        return dmgOutput;
    }

    public Weapon(String itemName, String itemDescription, String weaponStats, int dmgOutput)
    {
        super(itemName, itemDescription);
        this.weaponStats = weaponStats;
        this.dmgOutput = dmgOutput;
    }
}
