package dog.muhtar;

public class newDog {
    public static void main(String[] args) throws DogIsNotReadyException {
        Dog dog = new Dog("Muhtar");
        dog.putCollar();
        dog.putMuzzle();
        dog.putLeash();
        dog.walk();

    }
}
