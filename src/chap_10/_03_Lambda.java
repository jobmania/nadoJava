package chap_10;

public class _03_Lambda {
    public static void main(String[] args) {
        // 람다식 (코드 줄이기)
        // (전달값 1, 전달값 2,....) -> {코드~~}





    }

    public void print(){
        String s = "test";
        System.out.println(s);
    }

    // 접근제어자x 리턴값x, 메소드명x
//     () -> {
//        String s = "test";
//        System.out.println(s);
//    }

        public void print(String s){
        System.out.println(s);
    }

    // 전달값 1개,
//     s -> {
//        System.out.println(s);
//    }

    public  int add( int x , int y ){
        return x+y;
    }

//    (x,y) ->{
//        return x+y;
//    }

}
