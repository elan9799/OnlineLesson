import java.util.Arrays;

public class Point3D {
    public static void main(String[] args) {

        points.getDistToZero(1 , 2 , 3);
        points.getStringValue(1, 2 , 4);
        points.gerDistToOtherPoint(1,2,3,8,2,1);
    }
}
class points{
    double x;
    double y;
    double z;
    public static void getDistToZero (int x , int y, int z){
        System.out.println("расстояние до центра = " + Math.sqrt(x*x + y*y + z*z));
}

    public static void getStringValue(int x, int y, int z) {
        int array [] = {x,y,z};
        System.out.println(Arrays.toString(array));
    }

    public static void gerDistToOtherPoint(int x, int y, int z, int a, int b, int c) {
        System.out.println(Math.sqrt((x - a) * (x - a) + (y - b) * (y - b) + (z - c) * (z - c)));
    }
}