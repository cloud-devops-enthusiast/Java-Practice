class OuTerClass{
    int x = 9;

    static class InnErClass{
        public int y = 13;
    }
}

public class JavaStaticInnerClass {
    public static void main(String[] args){
        OuTerClass.InnErClass internal = new OuTerClass.InnErClass();
        System.out.println("myInner.y: "+internal.y);
    }
}
