package cn.kgc.methods;

public class Students {
    String[] names=new String[30];

    /**
     * 增加学生姓名
     * @param name 要增加的姓名
     */
    public void addName(String name){
        for(int i=0;i<names.length;i++){
            if(names[i]==null){
                names[i]=name;
                break;
            }
        }
    }

    /**
     * 查看所有学生姓名
     */
    public void showNames(){
        for(int i=0;i<names.length;i++){
            if(names[i]!=null){
                System.out.print(names[i]+",");
            }
        }
        System.out.println();
    }

    /**
     * 按名称在区间内查找
     * @param name 要查找的姓名
     * @param s 起始查找位置，不能小于
     * @param e 结束的位置
     * @return 是否查找成功
     */
    public boolean searchName(String name,int s,int e){
        boolean isFind=false;
        if(s<=0 || e<s || e>names.length){
            System.out.println("请注意输入的起始位置必须大于0且要小于结束位置，结束位置不可以大于数组长度！！！");
            return isFind;
        }
        for(int i=s-1;i<e;i++){
            if(name.equals(names[i])){
                isFind=true;
                break;
            }
        }
        return isFind;
    }
}
