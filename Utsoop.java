
import java.util.Scanner;
/**
 *
 * @author 19102130 ahmad wahyu azumardi
 */
public class Utsoop {

    private static String Azumardi;
    private static String Plat;

    public static void main(String[] args) {
    Mapala MPA = new Mapala();
            MPA.setNIA ("DS.20.01.114");
            MPA.setNIM ("19102130");
            MPA.setNAMA(Azumardi);
            MPA.setNAMALAPANGAN(Plat);
            
            System.out.println("NIA:  "+MPA.GetNIA() );
            System.out.println("NIM:  "+MPA.GetNIM() );
            System.out.println("NAMA:  "+MPA.GetNAMA() );
            System.out.println("NAMALAPANGAN:  "+MPA.GetNAMALAPANGAN() );
    }
}
