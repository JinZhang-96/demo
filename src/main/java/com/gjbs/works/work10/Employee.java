package com.gjbs.works.work10;

/**
 * 员工的类
 *   姓名:
 *  年龄:
 *  工号:
 *  地址:
 *  工资:
 */
public class Employee {
    public Employee(){
    }

    public Employee(String name, int age, int no, String address, float salary){
        this.name = name;
        this.age = age;
        this.no = no;
        this.address = address;
        this.salary = salary;
    }

    // 姓名
    private String name;

    // 年龄
    private int age;

    // 工号
    private int no;

    // 地址
    private String address;

    // 工资
    private float salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

//    @Override
//    public String toString() {
//        // 张三    23    001    济南市   1000
//        return "\t\t"+this.name+"\t\t"+this.age+"\t\t"+this.no+"\t"+this.address+"\t"+this.salary;
//    }
//
//    public String toString(int[] num) {
//        // 张三    23    001    济南市   1000
//        return "\t\t"+this.name+"\t\t"+this.age+"\t\t"+this.no+"\t"+this.address+"\t"+this.salary;
//    }
}
