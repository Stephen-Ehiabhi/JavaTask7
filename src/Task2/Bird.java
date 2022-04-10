package Task2;

public class Bird extends Animal {
    private  String Ehiabhi56481featherColor;
    private Boolean Ehiabhi56481canFly;

   Bird(){
        super();
        this.Ehiabhi56481canFly = true;
    }

    public Bird(String Ehiabhi56481name, String Ehiabhi56481age, String Ehiabhi56481weight_fields){
        super(Ehiabhi56481name,Ehiabhi56481age,Ehiabhi56481weight_fields);
        this.Ehiabhi56481weight_fields = Ehiabhi56481weight_fields;
    }

    public Bird(String Ehiabhi56481name, String Ehiabhi56481featherColor){
        super(Ehiabhi56481name);
        this.Ehiabhi56481featherColor = Ehiabhi56481featherColor;
    }

    public String getColorEhiabhi56481(){
            return this.Ehiabhi56481featherColor;
        }

        //set variables
        public void setColorEhiabhi56481(String Ehiabhi56481newColor){
            this.Ehiabhi56481featherColor = Ehiabhi56481newColor;
        }

        public void setCanFlyEhiabhi56481(Boolean Ehiabhi56481fly){
            this.Ehiabhi56481canFly = Ehiabhi56481fly;
        };

    @Override
        public void eat(){
            System.out.println("Bird eating seeds");
       }

    @Override
        public void getVoice(){
            System.out.println("Bird whistling");
       }

    @Override
    public void ToString(){
        System.out.printf("Bird feather color: %s\n", this.Ehiabhi56481featherColor);
    }

}
