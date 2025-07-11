package JavaInnerClasses;

class OuterClass{
    int x = 7;
    class InnerClass{
        int y = 8;
    }
}

public class JavaPrivateInnerClass {
    public static void main(String[] args){
        OuterClass myOuter = new OuterClass();
        OuterClass.InnerClass myInner = myOuter.new InnerClass();
        System.out.println(myInner.y+myOuter.x);
        //If you try to access a private inner class from an outside class, an error occurs
    }
}
