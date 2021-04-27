import com.p141.AmorelfineMakeFactory;
import com.p141.IDrugFactory;
import com.p141.ParacetamolMakeFactory;

public class P141_Main {
    public static void main(String[] args) {
        IDrugFactory A_w_f=new AmorelfineMakeFactory();
        A_w_f.getDurg().makeDrug();
        IDrugFactory P_w_f=new ParacetamolMakeFactory();
        P_w_f.getDurg().makeDrug();
    }
}
