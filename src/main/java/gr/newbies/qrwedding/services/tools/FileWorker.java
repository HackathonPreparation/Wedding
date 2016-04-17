package gr.newbies.qrwedding.services.tools;

import java.io.File;

public class FileWorker {
    public boolean deleteFolder(String path){
        File p = new File(path);
        
        if( p.exists() ) {
        File[] files = p.listFiles();
            for (File file : files) {
                if (file.isDirectory()) {
                    deleteFolder(file.toPath().toString());
                } else {
                   file.delete();
                }
            }
        }
        return true;
    }
}
