package chap_13;

import java.io.File;

public class _04_Folder {
    public static void main(String[] args) {
        String folderName = "A";
        File folder = new File(folderName);
        folder.mkdir(); // 폴더만들기
        if(folder.exists()){
            System.out.println("폴더 존재 " + folder.getAbsolutePath());
        }


        folderName = "A/B/C";
//        "A" + File.separator + "B"
//
         folder = new File(folderName);
//        folder.mkdir();// 단일 폴더
        folder.mkdirs();  // 하위폴더도

        if(folder.exists()){
            System.out.println("폴더 존재" + folder.getAbsolutePath());
        }else {
            System.out.println(" = 실패ㅣ.." );
        }
    }
}
