package rpg;

/**
 * A skeleton monster.
 * 
 * @author Willow Sapphire
 * @version 10/10/2023
 */
public class Skeleton extends Monster
{
    /**
     * The default health of skeletons.
     */
    public static final int DEFAULT_HEALTH = 10;

    /**
     * The default attack of skeletons.
     */
    public static final int DEFAULT_ATTACK = 1;

    /**
     * The default defense of skeletons.
     */
    public static final int DEFAULT_DEFENSE = 0;

    /**
     * The default attack method of skeletons.
     */
    public static final String DEFAULT_ATTACK_METHOD = "claw-like fingers";

    /**
     * The attack method of the skeleton.
     */
    private String attackMethod;

    /**
     * Constructor for objects of class Skeleton.
     */
    public Skeleton()
    {
        super("Skeleton", "An undead bone creature",
            DEFAULT_HEALTH, DEFAULT_ATTACK, DEFAULT_DEFENSE);
        this.attackMethod = DEFAULT_ATTACK_METHOD;
    }

    /**
     * Accessor method for the attack method of the skeleton.
     * 
     * @return The attack method of the skeleton.
     */
    public String getAttackMethod()
    {
        return attackMethod;
    }

    /**
     * Mutator method for the attack method of the skeleton.
     * 
     * @param attackMethod The new attack method of the skeleton.
     */
    public void setAttackMethod(String attackMethod)
    {
        this.attackMethod = attackMethod;
    }

    @Override
    public double attack()
    {
        System.out.printf("The skeleton attacks with its %s!%n", attackMethod);
        return attack();
    }

    @Override
    public Monster clone()
    {
        Skeleton skeleton = new Skeleton();
        skeleton.setAttack(getAttack());
        skeleton.setDefense(getDefense());
        skeleton.setHealth(getHealth());
        skeleton.setAttackMethod(getAttackMethod());
        return skeleton;
    }
}

