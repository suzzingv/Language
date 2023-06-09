package sec06.exam02;

public class YieldExample {
    public static void main(String[] args) {
        ThreadA threadA = new ThreadA();
        ThreadB threadB = new ThreadB();

        threadA.start();
        threadB.start();

        try { Thread.sleep(3000); } catch (InterruptedException e) {}
        threadA.work = false; //ThreadB만 실행

        try { Thread.sleep(3000); } catch (InterruptedException e) {}
        threadA.work = true; //ThreadA, ThreadB 모두 실행
        
        try { Thread.sleep(3000); } catch (InterruptedException e) {}
        threadA.stop = true;
        threadB.stop = true;

    }
}
