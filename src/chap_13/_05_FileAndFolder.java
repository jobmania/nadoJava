package chap_13;

import java.io.File;

public class _05_FileAndFolder {
    public static void main(String[] args) {
//        String folder = "C:\\Users\\SON\\IdeaProjects\\JavaWorkspace\\src\\chap_13";
        String folder = "src/chap_13";
        File fileAndFolders = new File(folder);
        System.out.println(" 현재 파일의 절대 경로 " + fileAndFolders.getAbsolutePath());
        for (File file : fileAndFolders.listFiles()) {

            if(file.isFile()){
                System.out.println("파일" + file.getName());
            } else if (file.isDirectory()) {
                System.out.println("폴더" + file.getName());
            }


        }


    }
}
