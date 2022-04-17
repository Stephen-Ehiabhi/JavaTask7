package Task2;

class Task2 {
    public static void main(String[] args){
        Animal Ehiabhi56481animal[]= new Animal[6];

        Ehiabhi56481animal[0]=new Mammal("Dolphin","4","30kg","Bat");
        Ehiabhi56481animal[1]=new Fish("tilapia","1","6kg","blue");
        Ehiabhi56481animal[2]=new BlowFish("frank","2","5kg","6ft");

        Ehiabhi56481animal[3]=new Dog("Simba","5","20kg","Bull dog");
        Ehiabhi56481animal[4]=new Bird("Eagle","1" ,"1kg");
        Ehiabhi56481animal[5]=new Pigeon("Fred","2","2","N. mayeri");

        Ehiabhi56481animal[3].getVoice();
        Ehiabhi56481animal[1].getVoice();

        System.out.println();

        //get names of animals
        for (var a : Ehiabhi56481animal) {
           AnimalName.name(a.getNameEhiabhi56481());
        }
    }
}