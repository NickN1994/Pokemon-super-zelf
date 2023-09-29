public class Fire extends Pokemon {

    private String weakness;
    private Boolean hasTrainer;

    public Fire (String name, int level, String sound, String type, String weakness, boolean hasTrainer) {
        super (name, level, sound, type);
        this.weakness = weakness;
        this.hasTrainer = hasTrainer;

    }

    @Override
    public void eats() {
        System.out.println(getName() + " eats a Fire Berry");
    }

    @Override
    public void attack() {

    }

    @Override
    public void speak() {
        System.out.println(getName() + " says " + getSound());
    }

    public String getWeakness() {
        return weakness;
    }

    public void setWeakness(String weakness) {
        this.weakness = weakness;
    }

    public void print () {
        System.out.println(getName() + " is level " + getLevel() + " This is the sound of a Charizard: " + getSound() + " and is " + getType() + " and is weak to " + getWeakness() + isHasTrainer());
    }

    public String isHasTrainer() {

        if (hasTrainer) {
            return " has a trainer";
        } else {
            return " is a wild Pokemon";
        }
    }

    public void setHasTrainer(Boolean hasTrainer) {
        this.hasTrainer = hasTrainer;
    }
}
