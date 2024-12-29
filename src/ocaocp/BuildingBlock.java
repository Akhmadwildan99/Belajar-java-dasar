package ocaocp;

public class BuildingBlock {
    public static boolean isBlocked=true;
    public static void main(String[] args) {
        System.out.println(BuildingBlock.isBlocked); // true

        BuildingBlock b1 = new BuildingBlock();
        BuildingBlock b2 = new BuildingBlock();

        System.out.println(b1.isBlocked);  // true
        System.out.println(b2.isBlocked);  // true

        b1.isBlocked=false;

        System.out.println(b1.isBlocked); //false
        System.out.println(b2.isBlocked); //false
        System.out.println(BuildingBlock.isBlocked); //false
    }
}
