package Task2;

public class Bird extends Animal {
    private  String featherColor;
    private Boolean canFly;

   Bird(){
        super();
        this.canFly = true;
    }

    public Bird(String name, String age, String weight_fields){
        super(name,age,weight_fields);
        this.weight_fields = weight_fields;
    }

    public Bird(String name, String featherColor){
        super(name);
        this.featherColor = featherColor;
    }

    public String getColor(){
            return this.featherColor;
        }

        //set variables
        public void setColor(String newColor){
            this.featherColor = newColor;
        }

        public void setCanFly(Boolean fly){
            this.canFly = fly;
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
        System.out.printf("Bird feather color: %s\n", this.featherColor);
    }

}
