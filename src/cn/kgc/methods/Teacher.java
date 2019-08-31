package cn.kgc.methods;

import java.util.Scanner;

public class Teacher {
    public static void main(String[] args) {
        Students stu=new Students();
        Scanner input =new Scanner(System.in);
        String name="";
        for(int i=0; i<5;i++){
            System.out.println("请输入姓名：");
            name=input.next();
            stu.addName(name);
        }
            stu.showNames();
        System.out.println("请输入要查找的姓名：");
        String searchName=input.next();
        System.out.println("请输入要查找的起始位置：");
        int start=input.nextInt();
        System.out.println("请输入要查找的结束位置：");
        int end=input.nextInt();
        if(stu.searchName(searchName,start,end)){
            System.out.println("找到了");
        }else{
            System.out.println("没找到");
        }
    }
}
