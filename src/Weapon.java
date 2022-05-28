import java.util.ArrayList;

public abstract class Weapon extends Item implements IWeaponSkills {

    public Weapon(String name, int weight, double value) {
        super(name, weight, value);
    }




    public abstract void attack(Character chosenEnemy, Character chosenCharacter);

    public abstract void SpecialAction(Character chosenEnemy, ArrayList<Character> characters);



}
