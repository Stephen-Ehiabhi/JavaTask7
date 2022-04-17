package Task2;

interface AnimalMove {
    default void move(){
        System.out.println("Animal is moving!");
    }
}
