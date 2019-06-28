package test.WeekEnumeration;

import java.util.Scanner;

public class WeekTest {
    public static void main(String[] args) {
        Week day=null;
        Scanner sc=new Scanner(System.in);
        System.out.println("输入要查询哪一天：");
        int daynum=sc.nextInt();
        switch(daynum){
            case 1:
               day=Week.Monday;
                System.out.println(day.getName()+day.getTask());break;
            case 2:
                day=Week.Tuesday;
                System.out.println(day.getName()+day.getTask());break;
            case 3:
                day=Week.Wednesday;
                System.out.println(day.getName()+day.getTask());break;
            case 4:
                day=Week.Thursday;
                System.out.println(day.getName()+day.getTask());break;
            case 5:
                day=Week.Friday;
                System.out.println(day.getName()+day.getTask());break;
            case 6:
                day=Week.Saturday;
                System.out.println(day.getName()+day.getTask());break;
            case 7:
                day=Week.Sunday;
                System.out.println(day.getName()+day.getTask());break;
                default:
                    System.out.println("请输入1-7查询！！！");
        }
    }
}
