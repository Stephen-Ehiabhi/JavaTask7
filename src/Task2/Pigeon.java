package Task2;

public class Pigeon extends Bird implements AnimalBehavior, AnimalMove {
    private String Ehiabhi56481species;

    Pigeon(){
        super();
        this.Ehiabhi56481species = "Null";
    }

    public  Pigeon(String Ehiabhi56481name, String Ehiabhi56481age, String Ehiabhi56481weight_fields, String Ehiabhi56481species){
        super(Ehiabhi56481name,Ehiabhi56481age,Ehiabhi56481weight_fields);
        this.Ehiabhi56481species = Ehiabhi56481species;
    }

    public  Pigeon(String Ehiabhi56481name, String Ehiabhi56481featherColor,String Ehiabhi56481species){
        super(Ehiabhi56481name,Ehiabhi56481featherColor,Ehiabhi56481species);
        this.Ehiabhi56481species = Ehiabhi56481species;
    }

    public String getSpeciesEhiabhi56481() {
        return this.Ehiabhi56481species;
    }

    public void setSpeciesEhiabhi56481(String newSpecies) {
        this.Ehiabhi56481species = newSpecies;
    }

    @Override
    public void eat(){
        System.out.println("Pigeon is eating seeds");
    }

    @Override
    public void getVoice(){
        System.out.println("Pigeon is making sound");
    }

    @Override
    public void sleep(){
        System.out.println("Pigeon is sleeping");
    }

    @Override
    public void move(){
        System.out.println("Pigeon is flying");
    }

    @Override
    public void ToString(){
        System.out.printf("Pigeon species: %s\n", this.Ehiabhi56481species);
    }
}
