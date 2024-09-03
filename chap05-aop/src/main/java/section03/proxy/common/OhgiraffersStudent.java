package section03.proxy.common;

public class OhgiraffersStudent implements Student {

    private int test = 1;

    @Override
    public void study(int hours) {
        System.out.println(hours + "시간 동안 열심히 공부합니다.");
        this.test = 0;
        System.out.println(test);
    }

    public int getTest() {
        return test;
    }
}