//package 성능향상보조스트림;
//
//import java.io.BufferedInputStream;
//import java.io.BufferedOutputStream;
//import java.io.FileInputStream;
//import java.io.FileOutputStream;
//
//public class AssistStreamEx1 {
//    public static void main(String[] args) {
//        int data = -1;
//        long start = 0;
//        fis = new FileInputStream("src/성능향상보조스트림/puppy.0229.jpg");
//        bis = new BufferedInputStream(fis);
//        fos = new FileOutputStream("clonePuppy.0229.jpg");
//        bos = new BufferedOutputStream(fos);
//        start = System.currentTimeMillis();
//        while((data = bis.read()) != -1 ){
//            bos.write(data);
//        }
//        bos.flush();
//        end = System.currentTimeMillis();
//        bos.close();
//        fos.close();
//        bis.close();
//        fis.close();
//        System.out.println("버퍼를 사용하는 경우 : ");
//    }
//}
