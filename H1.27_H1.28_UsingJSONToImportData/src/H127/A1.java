package H127;

public class A1 {

    private int aNumber;
    private String aName;
    private String someFood;

    public A1(int aNumber, String aName, String someFood) {
        this.aNumber = aNumber;
        this.aName = aName;
        this.someFood = someFood;
    }

    public int getaNumber() {
        return aNumber;
    }

    public String getaName() {
        return aName;
    }

    public String getSomeFood() {
        return someFood;
    }

    @Override
    public String toString(){
        return "\nA1:\n"+"theNumber = "+aNumber+"\n"+" theName = "+aName + "\n"+ " theFood = "+ someFood;
    }

}
