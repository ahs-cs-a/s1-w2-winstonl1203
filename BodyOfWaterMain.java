public class BodyOfWaterMain {
    public static void main(String[] args) {
        BodyOfWater b = new BodyOfWater("tahoe", 100, 50, true);
        BodyOfWater b1 = new BodyOfWater("anza", 40);

        System.out.println(b.name());
        System.out.println(b.largestDiameter());
        System.out.println(b.avgDepth());
        System.out.println(b.isSaltWater());

        System.out.println(b1.name());
        System.out.println(b1.avgDepth());
        
        b.setName("reservoir");
        b.setlargestDiameter(90);
        b.setavgDepth(75);
        b.setisSaltWater(false);

        b1.setName("thorp");
        b1.setavgDepth(3);

        System.out.println(b.name());
        System.out.println(b.largestDiameter());
        System.out.println(b.avgDepth());
        System.out.println(b.isSaltWater());

        System.out.println(b1.name());
        System.out.println(b1.avgDepth());

    }
    
}
