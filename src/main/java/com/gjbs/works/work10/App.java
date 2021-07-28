package com.gjbs.works.work10;

/**
 * 1. 显示系统功能
 *欢迎进入到员工管理系统^0^:请选择如下功能:
         *1. 新增   2.查询   3.删除   4.修改
         *
         *  
         *请选择_1
         *  
         *2.提示用户输入员工信息
         *  请输入姓名:
         *  请输入年龄:
         *  请输入工号:
         *  请输入地址:
         *  请输入工资:
         *3. 提示新增成功，然后把所有的员工信息自动查询出来
         *  
         *恭喜您！新增成功!!
         *
         *   序号  姓名   年龄   工号   地址   工资
         *    1    张三    23    001    济南市   1000
         *    2    李四    11    909    北京市   50000
         *    3    王五    34    234    山东省   100
         *
         *  
         *注意：要求姓名不能重复。
         *  
 */
public class App {

    public static void main(String[] args) {
//        System.out.println(Utils.getFormatString(5, "一二")+"1");
//        System.out.printf("%8s", 1,"fghj","1111111");
//        System.out.println(Utils.getFormatString(22,"Helloworld!"));
        System.out.println(Utils.computeLength("你好") );
//        System.out.println("Hello \u001b[31m red world!");
//        System.out.println("Hello \u001b[41;5;186;187;188m 后端颜色!");
    }
}
