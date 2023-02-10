package 객체직렬화예제1번;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SerialStreamEx1 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        writeList();
        List<Board> list = readList();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        for(Board e : list){
            System.out.println("번호 : " + e.getNumber());
            System.out.println("제목 : " + e.getTitle());
            System.out.println("내용 : " + e.getContent());
            System.out.println("연출 : " + e.getWriter());
            System.out.println("시간 : " + sdf.format(e.getDate()));
        }
    }
    static void writeList() throws IOException {
        List<Board> list = new ArrayList<>();
        list.add(new Board(1,"일타스캔들","로맨틱 코미디","유제원", new Date()));
        list.add(new Board(2,"대행사","오피스 드라마","이창민", new Date()));
        list.add(new Board(3,"재벌집 막내아들","경제 드라마","정대윤", new Date()));

        FileOutputStream fos = new FileOutputStream("board.bin");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(list); // 객체 출력 스트림을 이용해 list 를 출력
        oos.flush(); // write 이후에는 반드시 flush
        oos.close();
    }
    static List<Board> readList() throws IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream("board.bin");
        ObjectInputStream ois = new ObjectInputStream(fis);
        List<Board> list = (List<Board>) ois.readObject(); // 파일의 바이너리를 역직렬화
        return list;
    }
}
