package CharacterExample;

public class Main {
    public static void main(String[] args) {
        Character guerrero = new Warrior("Kevin", 100, 10, "Logitech MX Master 3");
        Character mago = new Wizard("Calec", 100, 10, "Bola de fuego");

        Warrior guerrero1 = (Warrior)guerrero;
        guerrero.showStatusCharacter();
        mago.showStatusCharacter();

        guerrero.attack(mago);
        guerrero1.attack(mago);
        mago.showStatusCharacter();
    }
}
