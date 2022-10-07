
public class pr22_accessmodifiers {
	public static void main(String[] args) {
        modifiers obj=new modifiers();
        System.out.println(obj.p);
        System.out.println(obj.pro);
        System.out.println(obj.i);

        obj.method();
        obj.method3();
        obj.method4();
    }
}

class modifiers{
    public int p=10;
    private int pr=12;
    protected int pro=14;
    int i=16;

    public void method(){
        method2();
    }
    private void method2(){
        System.out.println(pr);
    }
    protected void method3(){

    }
    void method4(){

    }
}
