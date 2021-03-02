package proyectopokemon;
import java.util.Scanner;
public class ProyectoPokemon {
    public static void main(String[] args) {
        int count = 1;
        /**
         * Esto es para pedir los datos por consola, pueden quitar esto y hacerlo
         * de forma manual.
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Elige el nombre del primer pokemon.");
        String nombre1 = scanner.nextLine();
        System.out.println("Elige el ataque del primer pokemon.");
        int att1 = Integer.parseInt(scanner.nextLine());
        System.out.println("Elige la vida del primer pokemon.");
        int vida1 = Integer.parseInt(scanner.nextLine());
        System.out.println("Elige el nombre del segundo pokemon.");
        String nombre2 = scanner.nextLine();
        System.out.println("Elige el ataque del segundo pokemon.");
        int att2 = Integer.parseInt(scanner.nextLine());
        System.out.println("Elige la vida del segundo pokemon.");
        int vida2 = Integer.parseInt(scanner.nextLine());
        /**
         * Creamos a nuestros pokemones.
         */
        Pokemon pokemon1 = new Pokemon(nombre1, att1, vida1);
        Pokemon pokemon2 = new Pokemon(nombre2, att2, vida2);
        /**
         * Logica pura, No mover nada acá.
         */
        while(pokemon1.Hp >= 0 && pokemon2.Hp >= 0) {
            if(count == 1) {
                pokemon2.Hp = pokemon1.attack(pokemon2.Hp, pokemon1.att);
                count++;
            } else {
                pokemon1.Hp = pokemon2.attack(pokemon1.Hp, pokemon2.att);
                count--;
            }
        }
        /**
         * Si alguno de los pokemones fue derrotado que diga cual fue
         */
        if(pokemon1.Hp <= 0) {
            System.out.println("El pokemon "+ pokemon1.Name + " Fue derrotado por " + pokemon2.Name);
        } else {
            System.out.println("El pokemon "+ pokemon2.Name + " Fue derrotado por " + pokemon1.Name);
        }
    }
    
}
