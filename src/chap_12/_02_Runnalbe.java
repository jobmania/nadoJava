package chap_12;

import chap_12.clean.CleanRunnable;

public class _02_Runnalbe {

    public static void main(String[] args) {
        CleanRunnable cleanRunnable = new CleanRunnable();
        Thread thread = new Thread(cleanRunnable);

        thread.start(); // 새로우 스래드드

        cleanByBoss();
    }
    public static void cleanByBoss() {
        System.out.println("-- 사장 청소 시작 -- ");
        for (int i = 1; i < 11; i += 2) {
            System.out.println("사장 " + i + "번방 청소중 ");
        }

        System.out.println("----- 사장 청 소 끝 ");
    }
}
