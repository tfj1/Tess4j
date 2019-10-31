package net.sourceforge.tess4j.example;


import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;
 
import java.io.File;
public class TesseractExample {
	 public static void main(String[] args){
		 
	        try {
	            File imageFile = new File("E:\\test\\test.pdf");//图片位置
	            Tesseract instance = Tesseract.getInstance();
	            instance.setDatapath("E:\\tessdata\\tessdata");
	            instance.setLanguage("eng");//选择字库文件（只需要文件名，不需要后缀名）
	            String result = instance.doOCR(imageFile);//开始识别
	            System.out.println(result);//打印图片内容
	        } catch (TesseractException e) {
	            e.printStackTrace();
	        }
	    }
}
