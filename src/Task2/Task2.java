package Task2;

class Task2 {
    public static void main(String[] args){
        Animal animal[]= new Animal[6];

        animal[0]=new Mammal("Dolphin","4","30kg","Bat");
        animal[1]=new Dog("Simba","5","20kg","Bull dog");
        animal[2]=new Bird("Eagle","1" ,"1kg");
        animal[3]=new Pigeon("Fred","2","2","");
        animal[4]=new Fish("tilapia","1","6kg","blue");
        animal[5]=new BlowFish("frank","2","5kg","6ft");

        animal[2].eat();
        animal[4].eat();
    }
}