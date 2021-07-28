package com.gjbs.classdefined;


public class Employee {
    private String name;
    private  int age;
    private String gonghao;
    private String dizhi;
    private  int money;

    public void setName(String name)
    {
        this.name = name;
    }
    public  String getName(){
        return this.name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGonghao() {
        return gonghao;
    }

    public void setGonghao(String gonghao) {
        this.gonghao = gonghao;
    }

    public String getDizhi() {
        return dizhi;
    }

    public void setDizhi(String dizhi) {
        this.dizhi = dizhi;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }


    public static void main(String[] args) {
//        Employee employee = new Employee();
//        System.out.println(employee.getAge());

    }

}
