package rpg;

import java.util.ArrayList;

public class Dungeon
{
    private Skeleton protoSkeleton;
    private Zombie protoZombie;

    public ArrayList<Monster> monsters;

    /**
     * Constructs a new dungeon.
     * Creates a skeleton and zombie as prototypes.
     */
    public Dungeon()
    {
        protoSkeleton = new Skeleton();
        protoZombie = new Zombie();
    }

    /**
     * Gets a new monster.
     * 
     * @param monsterType the type of monster to get.
     * @return the new monster.
     */
    public Monster getMonster(String monsterType)
    {
        switch (monsterType.toLowerCase())
        {
            case "skeleton": return protoSkeleton.clone();
            case "zombie": return protoZombie.clone();
            default: throw new IllegalArgumentException("Invalid Monster Type");
        }
    }
}
