package chap_12;

public class _Quiz_12 {

    private static int number = 1;

    public static void main(String[] args) throws InterruptedException {



        Runnable productA = new Runnable() {
            @Override
            public void run() {

                System.out.println("-- 상품 A 준비 시작 -- ");
                for (int i = 1; i <= 5; i++) {

                    System.out.println("A 상품 준비  " +i+"/5" );

                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }

                System.out.println("----- 상품 A 준비 끝 ");
            }
        };


        Runnable productB = () -> {

            System.out.println("-- 상품 B 준비 시작 -- ");
            for (int i = 1; i <= 5; i++) {
                System.out.println("B 상품 준비  " +i+"/5" );
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }


            System.out.println("----- 상품 B 준비 끝 ");
        };


        Thread thread1 = new Thread(productA);
        Thread thread2 = new Thread(productB);


        thread1.start();
        thread2.start();

//        while( thread1.isAlive() || thread2.isAlive()) { // 쓰레드가 살아있는지에 대해서 , join과동일
//
//        }

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        Runnable runnableSet = () -> {

            System.out.println("-- 세트 상품 포장 시작 -- ");
            for (int i = 1; i <= 5; i++) {
                System.out.println("세트상품토장  " +i+"/5" );
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }


            System.out.println("-- 세트 상품 포장 끝 -- ");
        };


        Thread threadSet = new Thread(runnableSet);
        threadSet.start();

//        settingProduct();


    }

    public static void settingProduct() throws InterruptedException {
        for (int i = 1; i <=5 ; i++) {
            System.out.println("세트 상품포장"+ i+"/5");
            Thread.sleep(1000);
        }

        System.out.println("세트 포장 끝!!");
    }


}
