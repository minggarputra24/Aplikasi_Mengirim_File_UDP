/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sendfileudp;

import java.io.FileOutputStream;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

/**
 *
 * @author ASUS
 */
public class Penerima {
    public static void main(String[] args) throws IOException{
        DatagramSocket ds = new DatagramSocket(1987);
        byte[] b = new byte[1024]; //mendefinisikan var b dari byte array 1024
        DatagramPacket dp = new DatagramPacket(b, b.length); //mendefinisikan var dp dari datagrampacket
        ds.receive(dp);  //Mepanggil method receive yang berparameter dp pada var ds
        byte[] bs = dp.getData(); //Membuat var bs dari byte array yang isinya dp.getData
        int length = dp.getLength(); //Membuat var length dari int yang isinya dp.getLength
        FileOutputStream fos = new FileOutputStream("D:\\Minggar\\Tes2.txt"); //Sebagai tempat menyimpan file
        fos.write(bs, 0, length); //Memanggil method write dengan parameter bs, 0, length
        fos.close();
        ds.close();
    }
}
