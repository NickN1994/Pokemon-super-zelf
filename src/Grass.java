public class Grass extends Pokemon{

    private int specialPower;
    private double weight;

    public Grass(String name, int level, String sound, String type, int specialPower, double weight) {
        super(name, level, sound, type);
        this.specialPower = specialPower;
        this.weight = weight;
    }

//    public static void solarbeam() {
//        System.out.println(getName() + " attack with Solarbeam");
//    }

//    public void solarBeam(String name, String attack) {
//        System.out.println(getName() + " attack with Solarbeam");
//    }


    @Override
    public void eats() {

    }

    @Override
    public void attack() {

    }

    public int getSpecialPower() {
        return specialPower;
    }

    public void setSpecialPower(int specialPower) {
        this.specialPower = specialPower;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
