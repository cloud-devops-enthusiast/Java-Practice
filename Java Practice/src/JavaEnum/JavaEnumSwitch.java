package JavaEnum;

enum Levels{
    High,
    Medium,
    Low
}
public class JavaEnumSwitch {
    public static void main(String[] args){
        Levels myVar = Levels.Low;

        switch(myVar){
            case Low:
                System.out.println("myVar: Low Level");
                break;
            case Medium:
                System.out.println("myVar: Medium Level");
                break;
            case High:
                System.out.println("myVar: High Level");
                break;
        }
    }
}
