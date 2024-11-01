import java.util.*;

public class VolumeOfSphere {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float r , pi = 3.14f, VolumeOfSp;
        System.out.println("Enter your radius:");
        r = sc.nextFloat();
        VolumeOfSp = (float)(4.0/3.0*pi*r*r*r);
        System.out.println("Volume of Sphere:"+ VolumeOfSp);
        sc.close();
    }
}
