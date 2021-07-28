package com.gjbs.works.work10;

import java.util.Scanner;

public class Main {

    private Employee[] employees;

    private int employeeNum = 0;

    /**
     * 添加员工
     *
     * @param
     * @return
     */
    public Employee[] add() {
        Employee employee = new Employee();
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入要新增员工的姓名, 以回车结束:");
        String name = scanner.nextLine();
        if (name != null && !name.equals("")) {
            employee.setName(name);
        }
        while (true) {
            System.out.println("请输入要新增员工的年龄, 以回车结束:");
            String age = scanner.nextLine();
            if (age != null && !age.equals("")) {
                try {
                    employee.setAge(Integer.parseInt(age));
                } catch (NumberFormatException e) {
                    System.out.println("年龄请输入整型数据!");
                    continue;
                }
                break;
            }
        }
        while (true) {
            System.out.println("请输入要新增员工的工号, 以回车结束:");
            String no = scanner.nextLine();
            if (no != null && !no.equals("")) {
                try {
                    employee.setNo(Integer.parseInt(no));
                } catch (NumberFormatException e) {
                    System.out.println("工号请输入整型数据!");
                    continue;
                }
                break;
            }
        }
        System.out.println("请输入要新增员工的地址, 以回车结束:");
        String address = scanner.nextLine();
        if (address != null && !address.equals("")) {
            employee.setAddress(address);
        }
        while (true) {
            System.out.println("请输入要新增员工的薪资, 以回车结束:");
            String salary = scanner.nextLine();
            if (salary != null && !salary.equals("")) {
                try {
                    employee.setSalary(Float.parseFloat(salary));
                } catch (NumberFormatException e) {
                    System.out.println("薪资请输入浮点类型数据!");
                    continue;
                }
                break;
            }
        }
        // 判断存放员工的数组是否为空， 为空则实例化一个空间为10的数组
        if (employees == null) {
            employees = new Employee[10];
        }
        // 判断数组是否填满， 填满则把数组的空间扩大一倍
        if (employeeNum == employees.length) {
            employees = (Employee[]) Utils.copyAndExpandArray(employees);
        }

        // 相同名字的员工不能再次添加
        for (Employee item : employees) {
            if (item != null && item.getName() != null && !item.getName().equals("")) {
                if (item.getName().equals(employee.getName())) {
                    System.out.println("员工:" + employee.getName() + "已存在，不能重复添加！");
                    return employees;
                }
            }
        }

        // 添加员工
        employees[employeeNum] = employee;
        // 记录员工总数的变量加1
        employeeNum++;
        System.out.println("员工添加成功！");
        this.printEmployee();
        return this.employees;
    }

    /**
     * 删除员工
     *
     * @param no
     * @return
     */
    public Employee[] del(int no) {
        if (this.employees != null && this.employees.length != 0) {
            // 是否删除成功
            boolean delState = false;
            for (int i = 0; i < employees.length; i++) {
                if (employees[i] != null) {
                    if (employees[i].getNo() == no) {
                        Utils.moveArrayFromIndex(i, employees);
                        employeeNum--;
                        delState = true;
                    }
                }
            }
            if (delState) {
                System.out.println("删除成功");
            } else {
                System.out.println("删除失败");
            }
            this.printEmployee();
        } else {
            System.out.println("员工记录为0， 无法执行删除操作！");
        }


        return this.employees;
    }

    /**
     * 修改员工信息
     *
     * @param no
     * @return
     */
    public Employee[] update(int no) {
        if (this.employees != null && this.employees.length != 0) {
            Employee employee = null;
            for (int i = 0; i < employees.length; i++) {
                if (employees[i] != null && employees[i].getNo() == no) {
                    employee = employees[i];
                }
            }
            if (employee == null) {
                System.out.println("没有查询到要修改的员工信息， 修改失败!");
            } else {
                Scanner scanner = new Scanner(System.in);
                System.out.println("请输入要修改的姓名, 以回车结束:");
                String name = scanner.nextLine();
                if (name != null && !name.equals("")) {
                    employee.setName(name);
                }
                System.out.println("请输入要修改的年龄, 以回车结束:");
                String age = scanner.nextLine();
                if (age != null && !age.equals("")) {
                    employee.setAge(Integer.parseInt(age));
                }
                System.out.println("请输入要修改的地址, 以回车结束:");
                String address = scanner.nextLine();
                if (address != null && !address.equals("")) {
                    employee.setAddress(address);
                }
                System.out.println("请输入要修改的薪资, 以回车结束:");
                String salary = scanner.nextLine();
                if (salary != null && !salary.equals("")) {
                    employee.setSalary(Float.parseFloat(salary));
                }
                System.out.println("修改成功！");
            }

            this.printEmployee();
        } else {
            System.out.println("员工记录为0， 无法执行修改操作！");
        }
        return this.employees;
    }

    /**
     * 查询员工
     */
    public void printEmployee() {
//           *   序号  姓名   年龄   工号   地址   工资
//           *    1    张三    23    001    济南市   1000
//           *    2    李四    11    909    北京市   50000
//           *    3    王五    34    234    山东省   100
        int no = 1;
        if (employees != null && employees.length != 0 && employeeNum != 0) {
            int[] colMaxLength = new int[6];
            for (int i = 0; i < colMaxLength.length; i++) {
                if (i == 0) {
                    colMaxLength[i] = Utils.computeLength(new Integer(employees.length).toString()) > 4 ? Utils.computeLength(new Integer(employees.length).toString()) : 4;
                } else if (i == 1) {
                    int l = 4;
                    for (Employee employee : employees) {
                        if (employee != null && !employee.getName().equals("")) {
                            l = Utils.computeLength(employee.getName()) > l ? Utils.computeLength(employee.getName()) : l;
                        }
                    }
                    colMaxLength[i] = l;
                } else if (i == 2) {
                    int l = 4;
                    for (Employee employee : employees) {
                        if (employee != null) {
                            l = Utils.computeLength(new Integer(employee.getAge()).toString()) > l ? Utils.computeLength(new Integer(employee.getAge()).toString()) : l;
                        }
                    }
                    colMaxLength[i] = l;
                } else if (i == 3) {
                    int l = 4;
                    for (Employee employee : employees) {
                        if (employee != null) {
                            l = Utils.computeLength(new Integer(employee.getNo()).toString()) > l ? Utils.computeLength(new Integer(employee.getNo()).toString()) : l;
                        }
                    }
                    colMaxLength[i] = l;
                } else if (i == 4) {
                    int l = 4;
                    for (Employee employee : employees) {
                        if (employee != null && !employee.getAddress().equals("")) {
                            l = Utils.computeLength(employee.getAddress()) > l ? Utils.computeLength(employee.getAddress()) : l;
                        }
                    }
                    colMaxLength[i] = l;
                } else {
                    int l = 4;
                    for (Employee employee : employees) {
                        if (employee != null) {
                            l = Utils.computeLength(new Float(employee.getSalary()).toString()) > l ? Utils.computeLength(new Float(employee.getSalary()).toString()) : l;
                        }
                    }
                    colMaxLength[i] = l;
                }
            }
            String f = Utils.getFormatString(colMaxLength[0], "序号") + "\t" +
                    Utils.getFormatString(colMaxLength[1], "姓名") + "\t" +
                    Utils.getFormatString(colMaxLength[2], "年龄") + "\t" +
                    Utils.getFormatString(colMaxLength[3], "工号") + "\t" +
                    Utils.getFormatString(colMaxLength[4], "地址") + "\t" +
                    Utils.getFormatString(colMaxLength[5], "工资");
            System.out.println(f);
            for (Employee employee : employees) {
                if (employee != null) {
                    String format = Utils.getFormatString(colMaxLength[0], String.valueOf(no)) + "\t" +
                            Utils.getFormatString(colMaxLength[1], employee.getName()) + "\t" +
                            Utils.getFormatString(colMaxLength[2], String.valueOf(employee.getAge())) + "\t" +
                            Utils.getFormatString(colMaxLength[3], String.valueOf(employee.getNo())) + "\t" +
                            Utils.getFormatString(colMaxLength[4], employee.getAddress()) + "\t" +
                            Utils.getFormatString(colMaxLength[5], String.valueOf(employee.getSalary()));
                    System.out.println(format);
                    no++;
                }
            }
        } else {
            System.out.println("员工个数为0");
        }
    }

    public static void main(String[] args) {
        Main main = new Main();
        while (true) {
            System.out.println("欢迎进入到员工管理系统 ^0^: 请选择如下功能:\n" +
                    "1. 新增   2. 查询   3.删除   4.修改");
            Scanner scanner = new Scanner(System.in);
            int i = scanner.nextInt();
            switch (i) {
                case 1:
                    main.add();
                    break;
                case 2:
                    main.printEmployee();
                    break;
                case 3:
                    System.out.println("请输入要删除员工的工号, 以回车结束:");
                    int no = scanner.nextInt();
                    main.del(no);
                    break;
                case 4:
                    System.out.println("请输入要修改员工的工号, 以回车结束:");
                    int no1 = scanner.nextInt();
                    main.update(no1);
                    break;
                default:
                    System.out.println("无效的操作!");
                    break;
            }
        }


    }
}
