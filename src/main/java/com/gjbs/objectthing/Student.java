package com.gjbs.objectthing;

//  private   protected public
public class Student {
    public int getHight() {
        return hight;
    }

    public void setHight(int hight) {
        this.hight = hight;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private int hight; // 身高
    private boolean sex; // 性别, false位男  true为女
    private String name; // 名字

    public static void main(String[] args) {
        Student student = new Student();
//        student.
    }
}
