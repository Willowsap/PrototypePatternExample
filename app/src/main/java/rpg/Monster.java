package rpg;

/**
 * A generic landscape feature.
 * 
 * @author Willow Sapphire
 * @version 10/10/2023
 */
public abstract class Monster implements Cloneable
{
    /**
     * The name of the landscape feature.
     */
    private String name;

    /**
     * The description of the landscape feature.
     */
    private String description;

    /**
     * The health of the monster.
     */
    private int health;

    /**
     * The attack of the monster.
     */
    private int attack;

    /**
     * The defense of the monster.
     */
    private int defense;

    /**
     * Constructor for objects of class Monster.
     * 
     * @param name the name of the monster.
     * @param description the description of the monster.
     * @param health the health of the monster.
     * @param attack the attack of the monster.
     * @param defense the defense of the monster.
     */
    public Monster(String name, String description, int health, int attack, int defense)
    {
        this.name = name;
        this.description = description;
        this.health = health;
        this.attack = attack;
        this.defense = defense;
    }

    /**
     * Accessor method for the name of the landscape feature.
     * 
     * @return The name of the landscape feature.
     */
    public String getName()
    {
        return name;
    }

    /**
     * Accessor metghod for the description of the landscape feature.
     * 
     * @return The description of the landscape feature.
     */
    public String describe()
    {
        return description;
    }

    /**
     * Accessor method for the health of the monster.
     * 
     * @return The health of the monster.
     */
    public int getHealth()
    {
        return health;
    }

    /**
     * Accessor method for the attack of the monster.
     * 
     * @return The attack of the monster.
     */
    public int getAttack()
    {
        return attack;
    }

    /**
     * Accessor method for the defense of the monster.
     * 
     * @return The defense of the monster.
     */
    public int getDefense()
    {
        return defense;
    }

    /**
     * Mutator method for the name of the landscape feature.
     * 
     * @param health The new health of the monster.
     */
    public void setHealth(int health)
    {
        this.health = health;
    }

    /**
     * Mutator method for the attack of the monster.
     * 
     * @param attack The new attack of the monster.
     */
    public void setAttack(int attack)
    {
        this.attack = attack;
    }

    /**
     * Mutator method for the defense of the monster.
     * 
     * @param defense The new defense of the monster.
     */
    public void setDefense(int defense)
    {
        this.defense = defense;
    }

    /**
     * Attacks an enemy.
     * 
     * @return The amount of damage dealt.
     */
    public abstract double attack();

    /**
     * Clones the monster.
     * 
     * @return an exact copy of the monster.
     */
    @Override
    public abstract Monster clone();
}
