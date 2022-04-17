package Task2;

public class Dog extends Mammal implements AnimalBehavior, AnimalMove {
    private String Ehiabhi56481breed;

    Dog(){
        super();
        Ehiabhi56481breed = "Null";
    }

     public Dog(String Ehiabhi56481name, String Ehiabhi56481age, String Ehiabhi56481weight_fields, String Ehiabhi56481breed){
        super(Ehiabhi56481name,Ehiabhi56481age,Ehiabhi56481weight_fields,Ehiabhi56481breed);
        this.Ehiabhi56481breed = Ehiabhi56481breed;
    }

    public Dog(String Ehiabhi56481name,String Ehiabhi56481breed){
      super(Ehiabhi56481name,Ehiabhi56481breed);
    }

    public String getBreedEhiabhi56481(){
        return Ehiabhi56481breed;
    }

    public void setBreedEhiabhi56481(String Ehiabhi56481newBreed){
         this.Ehiabhi56481breed = Ehiabhi56481newBreed;
    }

    @Override
    public void eat(){
        System.out.println("Dog eating bones");
    }

    @Override
    public void getVoice(){
        System.out.println("Dog Barking");
    }

    @Override
    public void sleep(){
        System.out.println("Dog is sleeping");
    }

    @Override
    public void move(){
        System.out.println("Dog is running");
    }

    @Override
    public void ToString(){
        System.out.printf("Breed: %s\n", this.Ehiabhi56481breed);
    }

}
