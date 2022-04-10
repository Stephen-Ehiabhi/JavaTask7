package Task2;

abstract class Animal {
    protected String name, age,weight_fields;

    public Animal(){
        name = "Null";
        weight_fields = "30kg";
        age = "12";
    }

    public Animal(String name, String age, String weight_fields){
        this.name = name;
        this.age = age;
        this.weight_fields = weight_fields;
    }

    public Animal(String name){
        this.name = name;
    }

    //to get a particular variable
    abstract void eat ();
    abstract void getVoice ();

    public String getName (){
        return name;
    }

    public String getAge (){
        return age;
    }

    public String getWeight (){
        return weight_fields;
    }

    //to set a variable
    public String setName (String newName){
        return this.name = newName;
    }

    public String setAge (String newAge){
        return this.age = newAge;
    }

    public String setWeight (String newWeight){
        return this.weight_fields = newWeight;
    }

    public void ToString (){
        System.out.printf("Animal name: %s\n", this.name);
    }

}
