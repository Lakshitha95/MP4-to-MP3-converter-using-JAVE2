package media.converter;


import java.io.File;
import java.util.ArrayList;
import java.util.List;


public class folderchecker {

    private String folderPath;
    private List<File> fileList = new ArrayList<>();
    public folderchecker(String folderPath){
        this.folderPath = folderPath;
    }
    public void fileAdded(File file){
        fileList.add(file);
    }
    public void fileDeleted(File file){
        fileList.remove(file);
    }
    public void encode(){
        for (File media : fileList){
            mediaConverter converter = new mediaConverter();
        }
    }

}
