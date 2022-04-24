package staticNnonstatic;

public class TestDriveway {
    public static void main(String[] args) {
        System.out.println("static variable demo");
        SharedDriveway george = new SharedDriveway();
        george.setDriveWaySize(6);
        System.out.println("Geroge's drive way size: " + george.getDriveWaySize());

        SharedDriveway json = new SharedDriveway();
        json.setDriveWaySize(8);
        System.out.println("Json's drive way size: " + json.getDriveWaySize());

        System.out.println("after modified the drive size by json ");

        System.out.println("Geroge's drive way size: " + george.getDriveWaySize());

        SharedDriveway.drivewayPath();

    }
}
