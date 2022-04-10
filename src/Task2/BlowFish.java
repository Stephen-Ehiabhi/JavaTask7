package Task2;

public class BlowFish extends Fish{
   private String height;

    BlowFish(){
        super();
        this.height = "Null";
    }

    public BlowFish(String name, String age,String weight_fields, String height){
        super(name,age,weight_fields,height);
        this.height = height;
    }

    public BlowFish(String name, String height){
        super(name, height);
        this.height = height;
    }

    public String getHeight() {
        return this.height;
    }

    public void setHeight(String newHeight) {
        this.height = newHeight;
    }

    @Override
    public void eat(){
        System.out.println("Blowfish is eating");
    }

    @Override
    public void getVoice(){
        System.out.println("Blowfish Sound!");
    }

    @Override
    public void ToString(){
        System.out.printf("Blowfish height: %s\nAge:", this.height);
    }

}
