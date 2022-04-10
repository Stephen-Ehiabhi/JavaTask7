package Task2;

public class Mammal extends Animal {
    private String Ehiabhi56481type;

    Mammal(){
        super();
        this.Ehiabhi56481type = "Null";
    }

    public Mammal(String Ehiabhi56481name, String Ehiabhi56481age, String Ehiabhi56481weight_fields, String Ehiabhi56481type){
        super(Ehiabhi56481name,Ehiabhi56481age,Ehiabhi56481weight_fields);
        this.Ehiabhi56481type = Ehiabhi56481type;
    }

    public Mammal(String Ehiabhi56481name, String Ehiabhi56481type){
       super(Ehiabhi56481name);
       this.Ehiabhi56481type = Ehiabhi56481type;
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
        System.out.printf("Mammal type: %s\n", this.Ehiabhi56481type);
    }

}
