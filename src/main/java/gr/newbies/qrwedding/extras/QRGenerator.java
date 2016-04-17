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
        
        pathGenerator(UUID_Event);
        
        String filePath = ProgPaths.IMAGES_OUTPUT_FOLDER
                .getData(UUID_Event,UUID_Visitor,"\\");
        
        
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
        if (!newFile.exists()){
             newFile.mkdirs(); 
        } else {
            return false;
        }
        return true;
    }
    
    private void createQRCode(String qrCodeData, String filePath, 
            String charset, Map hintMap, int qrCodeheight, int qrCodewidth)
                            throws WriterException, IOException {
        filePath = filePath + ".png";
        
        BitMatrix matrix = new MultiFormatWriter().encode( new String(
                qrCodeData.getBytes(charset), charset), BarcodeFormat.QR_CODE,
                qrCodewidth, qrCodeheight, hintMap);
        
        MatrixToImageWriter.writeToFile(matrix, filePath
                .substring(filePath.lastIndexOf('.') + 1), new File(filePath));
    }
}