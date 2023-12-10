public class Main {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.name = "Chendler";
        person1.age = 5;
        person1.number = "993535433";
        Person person2 = new Person();
        person2.name = "Barry";
        person2.age = 26;
        person2.speak();
        person2.number = "8935353636";

    }
}
class Person{
    String name;
    int age;
    String number;
    void speak(){
        for(int i=0; i<5; i++){
            System.out.println("My name is "+name+", I am "+age+"My phone number is: "+ number);}
    }

}