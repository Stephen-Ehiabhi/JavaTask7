package Task2;

public class Dog extends Mammal {
    private String breed;

    Dog(){
        super();
        breed = "Null";
    }

     public Dog(String name, String age, String weight_fields, String breed){
        super(name,age,weight_fields,breed);
        this.breed = breed;
    }

    public Dog(String name,String breed){
      super(name,breed);
    }

    public String getBreed(){
        return breed;
    }

    public void setBreed(String newBreed){
         this.breed = newBreed;
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
    public void ToString(){
        System.out.printf("Breed: %s\n", this.breed);
    }

}
