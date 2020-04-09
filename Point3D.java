import java.util.Arrays;

public class Point3D {
    public static void main(String[] args) {

        points a = new points(1, 5, 3);
        a.getDistToZero();
        a.getStringValue();
        points b = new points(4,2,7);
        points.gerDistToOtherPoint(a,b);
    }
}
class points{
    double x;
    double y;
    double z;
    public points(double xx, double yy, double zz){
        x = xx;
        y = yy;
        z = zz;
    }

    public void getDistToZero (){
        System.out.println("расстояние до центра = " + Math.sqrt(x*x + y*y + z*z));
}

    public void getStringValue() {
        double array [] = {x,y,z};
        System.out.println(Arrays.toString(array));
    }

    public static void gerDistToOtherPoint(points a, points b) {
        System.out.println(Math.sqrt((a.x - b.x) * (a.x - b.x) + (a.y - b.y) * (a.y - b.y) + (a.z - b.z) * (a.z - b.z)));
    }
}
