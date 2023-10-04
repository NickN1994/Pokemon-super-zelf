public class Electric extends Pokemon {


    private int attackPower;
    private int defensePower;
    private int electricLevel;

    public Electric (String name, int level, String sound, String type, int attackPower, int defensePower, int electricLevel) {
        super (name, level, sound, type);
        this.attackPower = attackPower;
        this.defensePower = defensePower;
        this.electricLevel = electricLevel;

    }

    public void defend(){
        System.out.println(getName() + " use double team. " + getName() + "raise you defensepower to level " + getDefensePower());
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

    public int getElectricLevel() {
        return electricLevel;
    }

    public void setElectricLevel(int electricLevel) {
        this.electricLevel = electricLevel;
    }

    @Override
    public void eats() {
        System.out.println(getName() + " eats a yellow berry");

    }

    @Override
    public void attack() {
        System.out.println(getName() + " and raises its attackpower to " + getAttackPower() + " And now it can use Thunder");

    }
}