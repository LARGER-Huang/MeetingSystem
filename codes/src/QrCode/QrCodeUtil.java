package QrCode;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;

import java.awt.*;
import java.io.File;
import java.nio.file.Path;
import java.util.HashMap;

/**
 * @Author Huang J.X
 * @Date 2019-12-06 23:22
 */
public class QrCodeUtil {
    public static void encodeQrCode(String content,String imagname) {
    String relativePath= "C:\\Users\\HUANG\\Desktop\\2019实验报告合集\\web程序设计\\期中实验项目\\codes\\web\\images\\";
    String path = relativePath + imagname;
    String type = "png";
    int width = 200; //二维码图像宽度
    int height = 200; // 二维码图像高度
    HashMap hints = new HashMap();
        hints.put(EncodeHintType.CHARACTER_SET, "UTF-8");
        hints.put(EncodeHintType.ERROR_CORRECTION, ErrorCorrectionLevel.M);
        hints.put(EncodeHintType.MARGIN,2);
        try {
        BitMatrix bitMatrix = new MultiFormatWriter().encode(content, BarcodeFormat.QR_CODE, width, height, hints);

        Path file = new File(path).toPath();
        MatrixToImageWriter.writeToPath(bitMatrix, type, file);
    } catch (Exception e) {

        e.printStackTrace();
    }

}
}
