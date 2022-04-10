package Task2;

public class Mammal extends Animal {
    private String type;

    Mammal(){
        super();
        this.type = "Null";
    }

    public Mammal(String name, String age, String weight_fields, String type){
        super(name,age,weight_fields);
        this.type = type;
    }

    public Mammal(String name, String type){
       super(name);
       this.type = type;
    }

    @Override
    public void eat(){
        System.out.println("Mammal Eats");
    }

    @Override
    public void getVoice() {
        System.out.println("Mammal sound");
    }

    @Override
    public void ToString(){
        System.out.printf("Mammal type: %s\n", this.type);
    }

}
