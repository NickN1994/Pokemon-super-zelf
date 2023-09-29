public abstract class Pokemon {

    private String name;
    private int level;

    private String sound;

    private String type;

    public Pokemon(String name, int level, String sound, String type) {
        this.name = name;
        this.level = level;
        this.sound = sound;
        this.type = type;
    }

    public abstract void eats();

    public void solarBeam() {
        System.out.println(name + " use Solarbeam");
    }

    public void speak() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public abstract void attack();
}
