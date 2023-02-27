package chap_13;

import java.io.File;

public class _07_DeleteFile {
    public static void main(String[] args) {
        File file = new File("god.txt");
        if(file.exists()){
            if(file.delete()){
                System.out.println("삭제성공" + file.getName());
            }else {
                System.out.println("실패" + file.getName());
            }
        }


        File folder = new File("A");  // 하위 폴더가 잇기때문에 실패

        if(folder.exists()){
            if(folder.delete()){
                System.out.println("성공");
            }else {
                System.out.println("실패");
            }
        }




        if(deleteFolder(folder)){
            System.out.println("!! 폴더 삭제성공");
        }else {
            System.out.println("!! 폴더 삭제 실패 ");
        }
    }

    // A 호출  B 호출 C 호출 C 삭제 B 삭제 A삭제
    public static boolean deleteFolder(File folder){  // 재귀 호출 A -> B -> C C아래의 하위폴더는 없기때문에삭제
        if( folder.isDirectory()){
            for(File file : folder.listFiles()){
                deleteFolder(file);
            }
        }
        System.out.println("삭제 대상 +" + folder.getAbsolutePath());
        return folder.delete();
    }


}
