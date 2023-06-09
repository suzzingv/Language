package exam03;

import java.io.*;

public class DataInputOutputStreamExample {
    public static void main(String[] args) throws Exception{
        FileOutputStream fos = new FileOutputStream(
            "C:\\Users\\skylim\\Documents\\�ڹ� ������\\primitive.dat");
        DataOutputStream dos = new DataOutputStream(fos);

        dos.writeUTF("ȫ�浿");
        dos.writeDouble(95.5);
        dos.writeInt(1);

        dos.writeUTF("���ڹ�");
        dos.writeDouble(90.3);
        dos.writeInt(2);
        dos.flush(); dos.close(); fos.close();

        FileInputStream fis = new FileInputStream("C:\\Users\\skylim\\Documents\\�ڹ� ������\\primitive.dat");
        DataInputStream dis = new DataInputStream(fis);

        for(int i = 0; i < 2; i++) {
            String name = dis.readUTF(); //���ڿ� UTF�� ���� ����
            double score = dis.readDouble();
            int order = dis.readInt();
            System.out.println(name + " " + score + " " + order);
        }

        dis.close(); fis.close();
    }
}
