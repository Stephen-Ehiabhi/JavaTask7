package Task2;

public class BlowFish extends Fish implements AnimalBehavior, AnimalMove{
   private String Ehiabhi56481height;

    BlowFish(){
        super();
        this.Ehiabhi56481height = "Null";
    }

    public BlowFish(String Ehiabhi56481name, String Ehiabhi56481age,String Ehiabhi56481weight_fields, String Ehiabhi56481height){
        super(Ehiabhi56481name,Ehiabhi56481age,Ehiabhi56481weight_fields,Ehiabhi56481height);
        this.Ehiabhi56481height = Ehiabhi56481height;
    }

    public BlowFish(String Ehiabhi56481name, String Ehiabhi56481height){
        super(Ehiabhi56481name, Ehiabhi56481height);
        this.Ehiabhi56481height = Ehiabhi56481height;
    }

    public String getHeightEhiabhi56481() {
        return this.Ehiabhi56481height;
    }

    public void setHeightEhiabhi56481(String Ehiabhi56481newHeight) {
        this.Ehiabhi56481height = Ehiabhi56481newHeight;
    }

    @Override
    public void eat(){
        System.out.println("Blowfish is eating seaweed");
    }

    @Override
    public void getVoice(){
        System.out.println("Blowfish Sound!");
    }

    @Override
    public void sleep(){
        System.out.println("Blowfish is sleeping");
    }

    @Override
    public void move(){
        System.out.println("Blowfish is swimming");
    }

    @Override
    public void ToString(){
        System.out.printf("Blowfish height: %s\nAge:", this.Ehiabhi56481height);
    }

}
