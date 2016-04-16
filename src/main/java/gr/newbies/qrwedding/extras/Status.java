package gr.newbies.qrwedding.extras;

/**
 *
 * @author SoUlKeePeR
 */
public enum Status {
    PENDING("PENDING"),
    ACCEPTED("ACCEPTED"),
    DECLINDED("DECLINED");
    
    private final String str;
    
    Status(String str) {
        this.str = str;        
    }
    
    public String getData(){
        return str;
    }
}
