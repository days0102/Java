import java.net.MalformedURLException;
import java.net.URL;

public class Url {
    public static void main(String []args){
        try {
            URL url=new URL("http","www.baidu.com",80,"baidu.txt");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }
}
