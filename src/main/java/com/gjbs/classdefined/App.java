package com.gjbs.classdefined;

/**
 * 修饰符 class 类名{
 *
 * 变量类型 变量名; // 成员变量
 *
 * // 成员方法
 * 修饰符 返回值 方法名(参数列表){
 * 语句
 * return 值;
 * }
 * }
 */
public class App {

    /**
     *  定义一个员工类 Employee, 在类里面有姓名、年龄、工号、地址、工资 5个私有成员变量， 并且为这5个变量提供相应读、写的公有方法
     */
//    public App(int a) {
//        System.out.print("调用构造方法" + a);
//    }

    int a;

    public int b(App a){
     return 1;
    }

   // 传引用: 传内存地址的值
    public static void main(String[] args) {

        Employee employee = new Employee();
        System.out.println(employee.getName());
        employee.setName("小明");
        System.out.print(employee.getName());

//        int a = 5;
//        int b = a;
//        b = 7;

//        App app = new App();
//        app.b(new App());
//
//        new App().a = 10;



//        app.a = 8;
//
//        App a = app;
//        a.a = 9;
//
//        System.out.println(a);
//        System.out.print(b);

//        app.a =9;

    }
}


