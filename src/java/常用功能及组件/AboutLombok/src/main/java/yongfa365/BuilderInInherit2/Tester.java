package yongfa365.BuilderInInherit2;

public class Tester {
    public static void main(String[] args) {
        //lombok-intellij-plugin 还不支持，https://github.com/mplushnikov/lombok-intellij-plugin/issues/513
        var item = Child.builder().childName("B.b").parentName("A.a").build();
        System.out.println(item);
    }
}
