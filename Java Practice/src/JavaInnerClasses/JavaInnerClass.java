package JavaInnerClasses;

class outerClass{
    int x = 10;

    class innerClass{
        int y = 5;
    }
}
public class JavaInnerClass {
    public static void main(String[] args){
        outerClass myOuter = new outerClass();
        outerClass.innerClass myInner = myOuter.new innerClass();
        System.out.println("myOuter.x: "+myOuter.x);
        System.out.println("myInner.y: "+myInner.y);
    }
}
