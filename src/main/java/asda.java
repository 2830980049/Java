public class asda {
    public static void main(String[] args) {
        new S();
    }
}
class P{
    static {
        System.out.println("1");
    }
    public P(){
        System.out.println("2");
    }
    {
        System.out.println("3");
    }
}

class S extends P{
    static {
        System.out.println("4");
    }
    public S(){
        System.out.println("5");
    }
    {
        System.out.println("6");
    }
}