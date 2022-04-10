package Task2;

public class Pigeon extends Bird {
    private String species;

    Pigeon(){
        super();
        this.species = "Null";
    }

    public  Pigeon(String name, String age, String weight_fields, String species){
        super(name,age,weight_fields);
        this.species = species;
    }

    public  Pigeon(String name, String featherColor,String species){
        super(name,featherColor,species);
        this.species = species;
    }

    public String getSpecies() {
        return this.species;
    }

    public void setSpecies(String newSpecies) {
        this.species = newSpecies;
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
    public void ToString(){
        System.out.printf("Pigeon species: %s\n", this.species);
    }
}
