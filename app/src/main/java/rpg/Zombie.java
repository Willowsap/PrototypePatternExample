package rpg;

/**
 * A zombie monster.
 * 
 * @author Willow Sapphire
 * @version 10/10/2023
 */
public class Zombie extends Monster
{
    /**
     * The default health of zombies.
     */
    public static final int DEFAULT_HEALTH = 15;

    /**
     * The default attack of zombies.
     */
    public static final int DEFAULT_ATTACK = 1;

    /**
     * The default defense of zombies.
     */
    public static final int DEFAULT_DEFENSE = 1;

    /**
     * The default attack method of zombies.
     */
    public static final String DEFAULT_ATTACK_METHOD = "fists";

    /**
     * The attack method of the zombie.
     */
    private String attackMethod;

    /**
     * Constructor for objects of class Zombie.
     */
    public Zombie()
    {
        super("Zombie", "An undead rotting corpse",
            DEFAULT_HEALTH, DEFAULT_ATTACK, DEFAULT_DEFENSE);
        this.attackMethod = DEFAULT_ATTACK_METHOD;
    }

    /**
     * Accessor method for the attack method of the zombie.
     * 
     * @return The attack method of the zombie.
     */
    public String getAttackMethod()
    {
        return attackMethod;
    }

    /**
     * Mutator method for the attack method of the zombie.
     * 
     * @param attackMethod The new attack method of the zombie.
     */
    public void setAttackMethod(String attackMethod)
    {
        this.attackMethod = attackMethod;
    }

    @Override
    public double attack()
    {
        System.out.printf("The zombie attacks with its %s!%n", attackMethod);
        return attack();
    }

    @Override
    public Monster clone()
    {
        Zombie zombie = new Zombie();
        zombie.setAttack(getAttack());
        zombie.setDefense(getDefense());
        zombie.setHealth(getHealth());
        zombie.setAttackMethod(getAttackMethod());
        return zombie;
    }
}

