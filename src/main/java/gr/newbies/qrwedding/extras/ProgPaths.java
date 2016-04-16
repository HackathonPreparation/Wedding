package gr.newbies.qrwedding.extras;

public enum ProgPaths {
    IMAGE_ONLINE_PATH("http://83.212.105.54/visitor/"),
    IMAGES_OUTPUT_FOLDER("C:\\Wedding\\QRCodes");
    
    private final String str;
    ProgPaths(String str) {
        this.str = str;        
    }
    
    public String getData(){
        return str;
    }
    
    public String getData(String folder,String spliter){
        return str + spliter + folder;
    }
    
    public String getData(String folder, String file ,String spliter){
        return str + spliter + folder + spliter + file;
    }
}
