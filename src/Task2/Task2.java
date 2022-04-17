package Task2;

class Task2 {
    public static void main(String[] args){
        Animal Ehiabhi56481animal[]= new Animal[6];

        Ehiabhi56481animal[0]=new Mammal("Dolphin","4","30kg","Bat");
        Ehiabhi56481animal[1]=new Fish("tilapia","1","6kg","blue");
        Ehiabhi56481animal[2]=new Bird("Eagle","1" ,"1kg");

        Ehiabhi56481animal[3]=new Dog("Simba","5","20kg","Bull dog");
        Ehiabhi56481animal[4]=new Pigeon("Fred","2","2","N. mayeri");
        Ehiabhi56481animal[5]=new BlowFish("frank","2","5kg","6ft");

        //Ehiabhi56481animal[3].getVoice();
        //Ehiabhi56481animal[1].getVoice();

        AnimalBehavior animalBehaviorEhiabhi56481[] = new AnimalBehavior[3];

        animalBehaviorEhiabhi56481[0]=new Dog("Simba","5","20kg","Bull dog");
        animalBehaviorEhiabhi56481[1]=new BlowFish("frank","2","5kg","6ft");
        animalBehaviorEhiabhi56481[2]=new Pigeon("Fred","2","2","N. mayeri");


        animalBehaviorEhiabhi56481[0].sleep();
        animalBehaviorEhiabhi56481[1].sleep();
        animalBehaviorEhiabhi56481[2].sleep();


        System.out.println();

        //get names of animals
        for (Animal a : Ehiabhi56481animal) {
           AnimalName.name(a.getNameEhiabhi56481());
        }

        System.out.println();

        //get animal motion
        for (Animal b: Ehiabhi56481animal){
            b.move();
        }
    }
}