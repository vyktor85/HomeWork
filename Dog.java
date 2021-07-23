package dog.muhtar;

public class Dog {
    String name;
    boolean isCollarPutOn;
    boolean isLeashPutOn;
    boolean isMuzzlePutOn;

    public Dog(String name){
        this.name=name;
    }

    public static void main(String[] args) {

    }
    public void putCollar() {
        System.out.println("The Collar is Put On");
        this.isCollarPutOn=true;
    }

    public void putLeash() {
        System.out.println("The Leash is Put On");
        this.isLeashPutOn=true;
    }

    public void putMuzzle() {
        System.out.println("The Muzzle is Put On");
        this.isMuzzlePutOn=true;
    }

    public void walk() throws DogIsNotReadyException {
        System.out.println("Go to Walk");
        if(isCollarPutOn&&isLeashPutOn&&isMuzzlePutOn){
            System.out.println("Hooray!!! We go to Walk!!!"+name+"Very Happy");
            } else{
            throw new DogIsNotReadyException ("Dog"+name+"Is Not Ready to Walk");
        }
    }
}
