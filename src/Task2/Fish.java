package Task2;

public class Fish extends Animal {
    private String Ehiabhi56481species;

    Fish(){
        super();
        this.Ehiabhi56481species = "Null";
    }

    public Fish(String Ehiabhi56481name, String Ehiabhi56481age, String Ehiabhi56481weight_fields, String Ehiabhi56481species){
        super(Ehiabhi56481name,Ehiabhi56481age,Ehiabhi56481weight_fields);
        this.Ehiabhi56481species = Ehiabhi56481species;
    }

    public Fish(String Ehiabhi56481name, String Ehiabhi56481species){
        super(Ehiabhi56481name);
        this.Ehiabhi56481species = Ehiabhi56481species;
    }

    public String getSpeciesEhiabhi56481() {
        return this.Ehiabhi56481species;
    }

    public void setSpeciesEhiabhi56481(String Ehiabhi56481newSpecies) {
         this.Ehiabhi56481species = Ehiabhi56481newSpecies;
    }

    @Override
    public void eat(){
        System.out.println("fish is eating seaweed");
    }

    @Override
    public void getVoice(){
        System.out.println("fish Sound!");
    }

    @Override
    public void ToString(){
        System.out.printf("Fish species: %s\nAge:", this.Ehiabhi56481species);
    }
}
