package gr.newbies.qrwedding.extras;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.WriterException;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

public class QRGenerator {
    
    public String generateQR(String UUID_Visitor, String UUID_Event){	
	String qrCodeData = ProgPaths.IMAGE_ONLINE_PATH.getData(UUID_Visitor,"/"); // to link edw
        
        System.out.println("UUID_VIS->" + UUID_Visitor + "   UUID_EV-> " + UUID_Event );
        pathGenerator(UUID_Event);
        System.out.println("After path generator");
        
        String filePath = ProgPaths.IMAGES_OUTPUT_FOLDER
                .getData(UUID_Event,UUID_Visitor,"\\");
        
        System.out.println("Filepath -> " + filePath);
        
        String charset = "UTF-8"; 
        Map hintMap = new HashMap();
        hintMap.put(EncodeHintType.ERROR_CORRECTION, ErrorCorrectionLevel.L);

        try {
            createQRCode(qrCodeData, filePath, charset, hintMap, 200, 200);
        } catch (WriterException | IOException ex) {
            Logger.getLogger(QRGenerator.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return filePath;
    }

    private boolean pathGenerator(String filePath){
        File newFile = new File(ProgPaths.IMAGES_OUTPUT_FOLDER
                .getData(filePath,"\\"));
        System.out.println("newFile -> " + newFile);
        if (!newFile.getParentFile().exists()){
            System.out.println("Was it true?");
             newFile.getParentFile().mkdirs(); 
        } else {
            System.out.println("Was false");
            return false;
        }
        return true;
    }
    
    private void createQRCode(String qrCodeData, String filePath, 
            String charset, Map hintMap, int qrCodeheight, int qrCodewidth)
                            throws WriterException, IOException {
        filePath = filePath + ".png";
        System.out.println("filePath for the second time -> " + filePath);
        
        BitMatrix matrix = new MultiFormatWriter().encode( new String(
                qrCodeData.getBytes(charset), charset), BarcodeFormat.QR_CODE,
                qrCodewidth, qrCodeheight, hintMap);
        
        MatrixToImageWriter.writeToFile(matrix, filePath
                .substring(filePath.lastIndexOf('.') + 1), new File(filePath));
    }
}