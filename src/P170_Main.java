import com.p170.Geometry;
import com.p170.GeometryDirector;
import com.p170.GeometrysBuilder;

public class P170_Main {
    public static void main(String[] args) {
        GeometryDirector gd=new GeometryDirector();
        Geometry geometry=gd.constructGeometry(new GeometrysBuilder());
        System.out.println(geometry.getCircular());
        System.out.println(geometry.getRectangle());
        System.out.println(geometry.getTriangle());

    }
}
