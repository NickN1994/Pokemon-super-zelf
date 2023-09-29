public class Water extends Pokemon {

    private int attackPower;
    private int defensePower;


    public Water(String name, int level, String sound, String type, int attackPower, int defensePower) {
        super(name, level, sound, type);
        this.attackPower = attackPower;
        this.defensePower = defensePower;

    }

    @Override
    public void eats() {
        System.out.println(getName() + " eats a fish");
    }

    @Override
    public void attack() {
        System.out.println(getName() + " uses Hydro Pump");
    }

    public int getAttackPower() {
        return attackPower;
    }

    public void setAttackPower(int attackPower) {
        this.attackPower = attackPower;
    }

    public int getDefensePower() {
        return defensePower;
    }

    public void setDefensePower(int defensePower) {
        this.defensePower = defensePower;
    }
}
