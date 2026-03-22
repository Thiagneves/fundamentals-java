package petshop;

public class Animals {
    String name;
    String species;
    String race;
    String dateOfBirthage; // a idade pode mudar a data de nascimento não

    String furColor; // pelo
    String colorEye;
    String sex;

    double height;
    double weight;

    Client owner; // dono

    void imprimir() {
        System.out.println("Name: " + this.name);
        System.out.println("Specie: " + this.species);
        System.out.println("Race" + this.race);
        System.out.println("Date of Brirthage: " + this.dateOfBirthage);
    }
}
