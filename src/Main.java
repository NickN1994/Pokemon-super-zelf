public class Main {
    public static void main(String[] args) {

    Fire Charmander = new Fire("Charmander", 14, "Char Char Charmanderrrrr", "Fire-type", "Water-type", true);
    Fire Charizard = new Fire("Charizard", 45, "rooooaaaaaar", "Fire-type", "Water-type", true);
    Water Blastoise = new Water ("Blastoise", 44, "Blaaaaaaastoiiiiiiiiise", "Water type", 90, 120);
    Electric Pikachu = new Electric("Pikachu", 40, "Pikaaaaachuuuuuuuuuuuuuuu", "Electric", 100, 70, 125);

    Charmander.eats();
    Charizard.eats();
    Charizard.speak();
    Blastoise.eats();
    Blastoise.attack();
    Charizard.print();
    Pikachu.eats();
    Pikachu.attack();
    Pikachu.defend();


    }
}