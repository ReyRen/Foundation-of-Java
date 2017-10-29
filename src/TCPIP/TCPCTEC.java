package TCPIP;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.Socket;

/**
 * Created by reyren on 2/20/17.
 */

//TEC-Client
public class TCPCTEC {
    public static void main(String[] args)throws IOException {

        Socket s = new Socket("192.168.1.194",9090);

        DataInputStream inp = new DataInputStream(s.getInputStream());

        boolean more_data = true;

        System.out.println("Established connection!");

        while (more_data){
            String line = inp.readLine();
            if (line == null){
                more_data = false;
            }else {
                System.out.println(line);
            }
        }

    }
}
