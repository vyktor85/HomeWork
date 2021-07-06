public class Exercise2 {
    class Human{

        int age;
        int weight;
        int height;


        Human(int age, int weight){
            this.age = age;
            this.weight = weight;
        }
        Human(int age, int weight, int height){
            this(age, weight);
            this.height = height;
            System.out.println(weight);
        }
    }
}
