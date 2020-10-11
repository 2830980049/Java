import java.util.Random;

public class SSSS {
    static class Runner2 implements Runnable{

        @Override
        public void run() {
            Integer speed = new Random().nextInt(10) + 1;
            for (int i = 1; i <= 100; i++){
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName()+"已前进"+(i * speed)+"米");
            }
        }

        public static void main(String[] args) {
            Thread r1 = new Thread(new Runner2());
            r1.setName("苏苏");
            Thread r2 = new Thread(new Runner2());
            r2.setName("苏酒儿");
            r1.start();
            r2.start();
        }
    }
}
