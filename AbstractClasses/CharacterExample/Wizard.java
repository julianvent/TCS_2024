package CharacterExample;

public class Wizard extends Character {
    protected String spell;

    public Wizard(String name, int health, int level, String spell) {
        super(name, health, level);
        this.spell = spell;
    }

    public void upgradeSpell() {
        System.out.println("El mago " + name + " ha mejorado su " + spell);
        level++;
    }


    @Override
    public void attack(Character enemy) {
        System.out.println("El mago " + name + " ataca a " + enemy.name);

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
        System.out.println("El mago " + name + " ataca a " + enemy.name + " con su ulti");

        int damage = (int)(Math.random() * 45);
        enemy.health -= damage;
    }
}
