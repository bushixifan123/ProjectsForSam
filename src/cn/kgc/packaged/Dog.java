package cn.kgc.packaged;

public class Dog {
    private String name = "小哈";//名称，默认值为小哈
    private int health = 100;//健康值，默认值为100，0-100，60以下为不健康
    private int love = 0;//亲密度
    private String strain = "二货哈士奇";//品种，默认值为二货哈士奇
    //开放输入输出接口
    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name=name;
    }
    public int getHealth(){
        return this.health;
    }
    //健康值应在0-100之间，默认值60
    public void setHealth(int health){
        if(health<0 || health>100){
            System.out.println("健康值应在0-100之间，默认值60");
            this.health=60;
            return;
        }
        this.health=health;
    }
    public int getLove(){
        return this.love;
    }
    //亲密度应在0-100之间，默认值20
    public void setLove(int love){
        if(love<0 || love>100){
            System.out.println("亲密度应在0-100之间，默认值20");
            this.love=20;
            return;
        }
        this.love=love;
    }
    public String getStrain(){
        return this.strain;
    }
    public void setStrain(String strain){
        this.strain=strain;
    }

    /*
     * 打印狗狗的信息
     */
    public void print() {
        System.out.println("宠物的自白：\n我的名字是：" + name
                + ",健康值是：" + health + ",亲密度为：" + love + ",品种是：" + strain);
    }
}
