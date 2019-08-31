package cn.kgc;

public class Penguin {
    String name="无名氏";//姓名，默认值无名氏
    int health=100;//健康值，默认值100
    int love=0;//亲密值，默认值0
    String sex="Q仔";//性别
    public void print(){
        System.out.println("宠物的自白：\n我的名字是："+name
                +",健康值是："+health+",亲密度为："+love+",性别是："+sex);
    }
}
