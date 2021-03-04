package proyectopokemon;

public class Pokemon {

    String Name;
    private int Hp;
    private int att;

    public Pokemon(String Name, int Hp, int att) {
        this.Name = Name;
        this.Hp = Hp;
        this.att = att;
    }

    public int attack(int Hp, int att) {
        int vida = 0;
            vida = (Hp - att);
        return vida;
    }
}
