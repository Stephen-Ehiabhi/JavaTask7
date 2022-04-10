package Task2;

public class Fish extends Animal {
    private String species;


    Fish(){
        super();
        this.species = "Null";
    }

    public Fish(String name, String age, String weight_fields, String species){
        super(name,age,weight_fields);
        this.species = species;
    }

    public Fish(String name, String species){
        super(name);
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
        System.out.println("fish is eating seaweed");
    }

    @Override
    public void getVoice(){
        System.out.println("fish Sound!");
    }

    @Override
    public void ToString(){
        System.out.printf("Fish species: %s\nAge:", species);
    }
}
