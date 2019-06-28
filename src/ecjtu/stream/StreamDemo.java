package ecjtu.stream;

import java.util.*;
import java.util.stream.Collectors;

enum Status{
    OPEN,CLOSED
}
//任务类
class  Task{
    private final Status  status;
    private final Integer points;
    Task(final Status status,final Integer points){
        this.status=status;
        this.points=points;
    }

    public Status getStatus() {
        return status;
    }

    public Integer getPoints() {
        return points;
    }

    @Override
    public String toString() {
        return String.format("[%s,%d]",status,points);
    }
}
public class StreamDemo {

    public static void main(String[] args) {
        Collection<Task> tasks= Arrays.asList(new Task(Status.OPEN,5),
                new Task(Status.OPEN,13),
                new Task(Status.CLOSED,8));
        //使用传统方式统计状态为open的任务总分
        int sum=0;
        for(Task t:tasks){
            if(t.getStatus()==Status.OPEN){
                sum+=t.getPoints();
            }
        }
        System.out.println("for循环统计状态为Open的任务总分："+sum);
        int totalPointsOfopenTasks=tasks.stream().filter(t->t.getStatus()==Status.OPEN).mapToInt(Task::getPoints).sum();
        System.out.println("使用Stream流方式统计状态为Open的任务总分："+totalPointsOfopenTasks);
        //使用Stream流方式计算所有任务总分
        int totalPoints=tasks.stream().parallel().map(Task::getPoints).reduce(0,Integer::sum);
        System.out.println("所有任务总分："+totalPoints);
        //按照状态进行分组
        Map<Status, List<Task>> map=tasks.stream().collect(Collectors.groupingBy(Task::getStatus));
        System.out.println(map);

    }

}
