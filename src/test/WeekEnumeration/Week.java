package test.WeekEnumeration;

public enum Week {
    Monday("星期一","课程：Java综合项目"),
    Tuesday("星期二","课程：Http协议，web基础"),
    Wednesday("星期三","课程：内置对象（一）request response session"),
    Thursday("星期四","课程：内置对象（二）application out pageContext"),
    Friday("星期五","课程：javabean"),
    Saturday("星期六","放假，开心。。。个屁"),
    Sunday("星期日","晚上有自习，难受。。。");
    private final String name;
    private final String task;

    Week(String name, String task) {
        this.name = name;
        this.task = task;
    }

    public String getName() {
        return name;
    }

    public String getTask() {
        return task;
    }
}
