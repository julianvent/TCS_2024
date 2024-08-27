package CharacterExample;

public abstract class Character {
    protected String name;
    protected int health;
    protected int level;

    public Character(String name, int health, int level) {
        this.name = name;
        this.health = health;
        this.level = level;
    }

    public String getName() {
        return name;
    }

    protected void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    protected void setHealth(int health) {
        this.health = health;
    }

    public int getLevel() {
        return level;
    }

    protected void setLevel(int level) {
        this.level = level;
    }


    public void showStatusCharacter() {
        System.out.println(name + " tiene " + health + " PV y es nivel " + level);
    }


    public abstract void attack(Character enemy);

    public abstract void heal();

    public abstract void useSpecialAbility(Character enemy);
}
