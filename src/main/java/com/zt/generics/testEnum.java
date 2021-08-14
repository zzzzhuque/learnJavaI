package com.zt.generics;

import org.junit.Test;

/**
 * 带有超类型限定的通配符允许你写入一个范型对象（set）
 * 带有子类型限定的通配符允许你读取一个范型对象（get）
 */
public class testEnum {
    public static void printBuddies(Pair<? extends Employee> p) {
        Employee first = p.getFirst();
        Employee second = p.getSecond();
        System.out.println(first.getName() + " and " + second.getName() + " are buddies.");
    }

    public static void minmaxBonus(Manager[] a, Pair<? super Manager> result) {
        if (a.length == 0) {
            return;
        }

        Manager min = a[0];
        Manager max = a[0];
        for (int i = 1; i < a.length; ++i) {
            if (min.getBonus() > a[i].getBonus()) {
                min = a[i];
            }

            if (max.getBonus() < a[i].getBonus()) {
                max = a[i];
            }
        }

        result.setFirst(min);
        result.setSecond(max);
    }


    @Test
    public void testExtends() {
        Manager ceo = new Manager(0L, 100L, "xiaoming", "ceo", 100L);
        Manager cfo = new Manager(1L, 200L, "xiaohong", "cfo", 200L);
        Employee lowlyEmployee = new Employee(3L, 300L, "xiaowang");
        Employee highlyEmployee = new Employee(4L, 400L, "xiaozhao");
        Pair<Employee> employeeBuddies = new Pair<>(lowlyEmployee, highlyEmployee);
        Pair<Manager> managerBuddies = new Pair<>(ceo, cfo);
        printBuddies(managerBuddies);
        printBuddies(employeeBuddies);
    }

    @Test
    public void testSuper() {
        Manager ceo = new Manager(0L, 100L, "xiaoming", "ceo", 100L);
        Manager cfo = new Manager(1L, 200L, "xiaohong", "cfo", 200L);
        Manager[] a = new Manager[2];
        a[0] = ceo;
        a[1] = cfo;
        Pair<Employee> result = new Pair<>();
        minmaxBonus(a, result);
        System.out.println(result);
    }
}
