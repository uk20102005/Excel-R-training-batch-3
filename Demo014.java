class UnaryDemo {
    void UnaryOp(){
		int a = 10, b = 5;
		System.out.println(a++);
		System.out.println(++a);
		System.out.println(b--);
		System.out.println(--b);
		
		a = 7 ;
		b = 8;
		int c = a++ * --b * a;
		System.out.println(c);
	}

}

public class Demo014 {
    public static void main(String[] args) {
        UnaryDemo obj = new UnaryDemo();
        obj.UnaryOp();
    }
}
