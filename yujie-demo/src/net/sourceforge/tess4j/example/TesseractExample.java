package net.sourceforge.tess4j.example;


import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;
 
import java.io.File;
public class TesseractExample {
	 public static void main(String[] args){
		 
	        try {
	            File imageFile = new File("E:\\test\\test.pdf");//ͼƬλ��
	            Tesseract instance = Tesseract.getInstance();
	            instance.setDatapath("E:\\tessdata\\tessdata");
	            instance.setLanguage("eng");//ѡ���ֿ��ļ���ֻ��Ҫ�ļ���������Ҫ��׺����
	            String result = instance.doOCR(imageFile);//��ʼʶ��
	            System.out.println(result);//��ӡͼƬ����
	        } catch (TesseractException e) {
	            e.printStackTrace();
	        }
	    }
}
