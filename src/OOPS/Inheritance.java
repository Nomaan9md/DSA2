package OOPS;
class Pokemon{
    int power; // 0
    String type; // null
    Pokemon(){ // default constructor

    }
    Pokemon(String type, int power ){
        this.power = power;
        this.type = type;
    }
    int getPower(){
        return power;
    }
    void print(){ // act  getter
        System.out.println(this.power+" "+this.type);
    }
}

class LegendaryPokemon extends Pokemon{ // child class
        String ability;
}

class GodPokemon extends Pokemon{
    char tag;
}


public class Inheritance {
   public static void main(String[] args){
       LegendaryPokemon mewtwo = new LegendaryPokemon();
       mewtwo.ability = "Pressure";
       Pokemon pikachu = new Pokemon();
       GodPokemon dialga = new GodPokemon();
       dialga.power = 40;
       dialga.type = "Pi";
       dialga.tag = 'G';
   }
}
