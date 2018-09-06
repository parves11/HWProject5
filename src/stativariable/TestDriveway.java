package stativariable;

public class TestDriveway {

    public static void main(String[] args) {
        DriveWay parves = new DriveWay();
        parves.drivewaysize = 10;
        System.out.println(parves.drivewaysize);

        DriveWay mahedi = new DriveWay();
        mahedi.drivewaysize  = 35;

       System.out.println(mahedi.drivewaysize);

       System.out.println(parves.drivewaysize);


    }
}