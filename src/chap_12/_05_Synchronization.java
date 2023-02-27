package chap_12;

import chap_12.clean.Room;

public class _05_Synchronization { /// 순서대로 1, 2, 3, 4, 5, 6,7, ~
    public static void main(String[] args) {

        Room room = new Room();


        Runnable cleaner1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("-- 직원1 청소 시작-- ");
                for (int i = 1; i <= 5 ; i++) {
                    room.clean("직원 1");

                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }

                    if( i ==2 ){
                        throw new RuntimeException("안해안해~");
                    }

                }

                System.out.println("----- 직원1 청 소 끝 ");
            }
        };


        Runnable cleaner2 = () -> {
            System.out.println("-- 직원2 청소 시작-- ");
            for (int i = 1; i <= 5 ; i ++) {

                room.clean("직원 2");
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
