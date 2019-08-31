package test.pack;

public class Dog {
    public String name;
    static int i;//成员变量，全局变量

    void add(){
        i++;
    }
    public static void main(String[] args) {
        i++;
        Dog dog =new Dog();
        dog.add();
        System.out.println(i);

    }
    static {
        
    }
}
