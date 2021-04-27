import com.f.*;
import com.p157.*;

public class P157_Main {
    public static void main(String[] args) {

        IGunFactory TuTu = new TuTuTuFactory();
        IGun TuTuGun = TuTu.createGun();
        TuTuGun.Production_gun();
        IBullets TuTuBullets = TuTu.createBullets();
        TuTuBullets.Making_bullets();

        IGunFactory DaDa = new DaDaDaFactory();
        IGun DaDaGun = DaDa.createGun();
        DaDaGun.Production_gun();
        IBullets DaDaBullets = DaDa.createBullets();
        DaDaBullets.Making_bullets();
    }
}
