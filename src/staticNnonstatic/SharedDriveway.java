package staticNnonstatic;

public class SharedDriveway {
    public static int drivewaySize;
    public final String drivewayOrientation = "north-south entrance";
    public int getDriveWaySize(){
        return drivewaySize;
    }

    public void setDriveWaySize(int driveWaySize){
        this.drivewaySize = driveWaySize;
    }

    public static void drivewayPath(){
        System.out.println("Concrete driveway path");
    }
}
