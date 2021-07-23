package dog.muhtar;

public class Dog2 {
    public static void main(String[] args) {
        Dog dog = new Dog("Muhtar");
        dog.putCollar();
        dog.putMuzzle();
        try{
            dog.walk();
        }catch(DogIsNotReadyException e) {
            System.out.println(e.getMessage());
            System.out.println("Check equipment"+dog.isCollarPutOn+"Check Leash"+ dog.isLeashPutOn+"Check Muzzle"+dog.isMuzzlePutOn);
        }
    }
}
