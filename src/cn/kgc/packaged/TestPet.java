package cn.kgc.packaged;


public class TestPet {
    public static void main(String[] args) {
        Dog dog =new Dog();
        dog.setHealth(-100);
        dog.setName("二哈");
        dog.setLove(10);
        dog.setStrain("蠢萌哈士奇");
        dog.print();
    }

}
