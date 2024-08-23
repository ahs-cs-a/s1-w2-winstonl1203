public class BodyOfWater{
    private String name;
    private int largestDiameter;
    private int avgDepth;
    private boolean isSaltWater;

    public BodyOfWater(String n, int lD, int aD, boolean iS ){
        name = n;
        largestDiameter = lD;
        avgDepth = aD;
        isSaltWater = iS;
    }

    public BodyOfWater(String n, int aD){
        name = n;
        avgDepth = aD;
    }

    public void setName(String n){
        name = n;
    }
    public void setlargestDiameter(int lD){
        largestDiameter = lD;
    }
    public void setavgDepth(int aD){
        avgDepth = aD;
    }
    public void setisSaltWater(boolean iS){
        iS = isSaltWater;
    }

    public String name(){
        return name;
    }
    public int largestDiameter(){
        return largestDiameter;
    }
    public int avgDepth(){
        return avgDepth;
    }
    public boolean isSaltWater(){
        return isSaltWater;
    }
    
    

}


