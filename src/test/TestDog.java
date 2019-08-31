package test;

public class TestDog {
    public static void main(String[] args) {
        Dog dog=new Dog();
        dog.health=-100;
        if(dog.health<0 || dog.health>100){
            dog.health=60;
        }
        dog.name="xiaohua";
        dog.print();
    }
}

