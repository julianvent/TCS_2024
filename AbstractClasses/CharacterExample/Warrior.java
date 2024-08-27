package CharacterExample;

public class Warrior extends Character {
    protected String weapon;

    public Warrior(String name, int health, int level, String weapon) {
        super(name, health, level);
        this.weapon = weapon;
    }

    public void upgradeWeapon() {
        System.out.println("El guerrero " + name + " ha mejorado su " + weapon);
        level++;
    }


    @Override
    public void attack(Character enemy) {
        System.out.println("El guerrero " + name + " ataca a " + enemy.name);

        int damage = (int)(Math.random() * 20);
        enemy.health -= damage;
    }


    @Override
    public void heal() {
        int healing = (int)(Math.random() * 15);
        health += healing;

        System.out.println(name + " ha regenerado " + healing + " PV");
    }

    @Override
    public void useSpecialAbility(Character enemy) {
        System.out.println("El guerrero " + name + " ataca a " + enemy.name + " con su ulti");

        int damage = (int)(Math.random() * 45);
        enemy.health -= damage;
    }
}
