package Task2;

abstract class Animal {
    protected String Ehiabhi56481name, Ehiabhi56481age,Ehiabhi56481weight_fields;

    public Animal(){
        Ehiabhi56481name = "Null";
        Ehiabhi56481weight_fields = "30kg";
        Ehiabhi56481age = "12";
    }

    public Animal(String Ehiabhi56481name, String Ehiabhi56481age, String Ehiabhi56481weight_fields){
        this.Ehiabhi56481name = Ehiabhi56481name;
        this.Ehiabhi56481age = Ehiabhi56481age;
        this.Ehiabhi56481weight_fields = Ehiabhi56481weight_fields;
    }

    public Animal(String Ehiabhi56481name){
        this.Ehiabhi56481name = Ehiabhi56481name;
    }


    //to get a particular variable
    abstract void eat ();

    abstract void getVoice ();

    public String getNameEhiabhi56481 (){
        return Ehiabhi56481name;
    }

    public String getAgeEhiabhi56481 (){
        return Ehiabhi56481age;
    }

    public String getWeightEhiabhi56481 (){
        return Ehiabhi56481weight_fields;
    }

    //to set a variable
    public String setNameEhiabhi56481 (String newName){
        return this.Ehiabhi56481name = newName;
    }

    public String setAgeEhiabhi56481 (String Ehiabhi56481newAge){
        return this.Ehiabhi56481age = Ehiabhi56481newAge;
    }

    public String setWeightEhiabhi56481 (String Ehiabhi56481newWeight){
        return this.Ehiabhi56481weight_fields = Ehiabhi56481newWeight;
    }

    public void ToString (){
        System.out.printf("Animal name: %s\n", this.Ehiabhi56481name);
    }
}
