package lab7;

public class Main {
    public static void main(String[] args) {
        Cube cube = new Cube();
        Sphere sphere = new Sphere();
        Parallelepiped parallelepiped = new Parallelepiped();
        GeometricBodyController controller = new GeometricBodyController();
        GeometricBodyInterface[] geometricBodyInterfaces = new GeometricBodyInterface[3];
        geometricBodyInterfaces[0] = cube;
        geometricBodyInterfaces[1] = sphere;
        geometricBodyInterfaces[2] = parallelepiped;
        controller.biggestVolume(geometricBodyInterfaces);
        controller.biggestSurface(geometricBodyInterfaces);
    }
}
