package exam2;

public class Zoo {
    public static void main(String[] args) {
        
        Animal animal[] = {new Sheep(),new Horse(),new Goat()};

        for(Animal ani : animal){
            ani.cry();
        }
    }

}
