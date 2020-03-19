package t_10_innerClasses.ex01;

public class Outer {

    public static void main(String[] args)
    {
        Outer o = new Outer();
        Inner inner = o.getInner();
    }

    public Inner getInner()
    {
        return new Inner();
    }

    class Inner {

    }
}
