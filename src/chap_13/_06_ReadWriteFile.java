package chap_13;

import java.io.*;

public class _06_ReadWriteFile {

    public static void main(String[] args) {

        //BufferedReader : 파일을 내용을 읽어올때, 효율적이고 빠름
        //BufferedWriter : 파일의 내용을 쓸때


//        파일쓰기

//        try( BufferedWriter bw = new BufferedWriter(new FileWriter("god.txt", true))) {
////            bw.write("1. 이제 거의 긑이 보이는구나");
////            bw.newLine();
////            bw.write("2. 그래 수고햇다");
////            bw.newLine();
//            bw.write("3. 조금만 더 힘내자 ");  // true를 설정시 내용추가 없으면 덮어스기
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }

        // 파일 읽기

        try(BufferedReader br = new BufferedReader(new FileReader("god.txt"))) {
            String line;
            while((line = br.readLine()) != null ){
                System.out.println(line);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
