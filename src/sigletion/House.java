package sigletion;

public class House {


    private House() {
    }
    //  public static House house1 = new House();


    // private static House house1 = new House();

    public static  House getSingletion() {
        return new House();
    }

    public void displayHousedim() {
        System.out.println(" 100 by 100");
    }


}
