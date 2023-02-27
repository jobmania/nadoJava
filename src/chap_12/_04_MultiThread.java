package chap_12;

public class _04_MultiThread {

    public static void main(String[] args) {

        Runnable cleaner1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("-- 직원1 청소 시작-- ");
                for (int i = 1; i < 11; i += 2) {
                    System.out.println("직원1  " + i + "번방 청소중  ");

                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }

                System.out.println("----- 직원1 청 소 끝 ");
            }
        };


        Runnable cleaner2 = () -> {
            System.out.println("-- 직원2 청소 시작-- ");
            for (int i = 2; i < 11; i += 2) {
                System.out.println("직원2 " + i + "번방 청소중  ");

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }

            System.out.println("----- 직원2 청 소 끝 ");
        };

        Thread thread1 = new Thread(cleaner1);
        Thread thread2 = new Thread(cleaner2);

        thread1.start();
        thread2.start();



    }
}
