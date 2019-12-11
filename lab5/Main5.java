package lab5;

import java.text.Format.Field;
import java.util.ArrayList;

public class Main5 {

	public static void main(String[] args) throws Exception {
		ArrayList<SelfPrint> classes = new ArrayList();
		String[] strings = {"s1","s2","s3","s4","s5","s6","s7","s8","s9","s10"};
		
		
		A a = new A(strings[0]);
		classes.add(a);
		B b = new B(strings[1]);
		classes.add(b);
		C c = new C(strings[2]);
		classes.add(c);
		D d = new D(strings[3]);
		classes.add(d);
		E e = new E(strings[4]);
		classes.add(e);
		F f = new F(strings[5]);
		classes.add(f);
		G g = new G(strings[6]);
		classes.add(g);
		H h = new H(strings[7]);
		classes.add(h);
		I i = new I(strings[8]);
		classes.add(i);
		J j = new J(strings[9]);
		classes.add(j);
		
		for(SelfPrint o : classes) {
			System.out.println("class "+ o.getClass().getSimpleName());
			o.print();
			System.out.println("------------------");
		}
		
		
	     
		

	}

}

interface SelfPrint {
	public void print();
}

class X{
	private String doNotTouch;
	
	protected X(String s){
		doNotTouch = s;
	}

	public String getDoNotTouch() {
		return doNotTouch;
	}
	
}

class A implements SelfPrint{
	protected String stringA;
	protected X x = new X("cc");

	public A(String s) {
		stringA = s;
		x = new X("blablabla");
	}
	
	public void print() {
		System.out.print("stringA : "+stringA);
		System.out.println("  x : "+x+" "+x.getDoNotTouch());
	}
}

class B extends A{
	protected String stringB;
	
	public B(String s) {
		super(null);
		stringB = s;
	}
	
	public void print() {
		super.print();
		System.out.println("stringB : "+stringB);
	}

}

class C extends B{
	protected String stringC;
	
	public C(String s) {
		super(null);
		stringC = s;
	}
	
	public void print() {
		super.print();
		System.out.println("stringC : "+stringC);
	}
}

class D extends C{
	protected String stringD;
	private X x;
	
	public D(String s) {
		super(null);
		stringD = s;
		x = new X("blabla");
	}
	
	public void print() {
		super.print();
		System.out.println("stringD : "+stringD);
		System.out.println("  x : "+x+" "+x.getDoNotTouch());
	}
}

class E extends D{
	protected String stringE;
	
	public E(String s) {
		super(null);
		stringE = s;
	}
	
	public void print() {
		super.print();
		System.out.println("stringE : "+stringE);
	}
}

class F extends E{
	protected String stringF;
	
	public F(String s) {
		super(null);
		stringF = s;
	}
	
	public void print() {
		super.print();
		System.out.println("stringF : "+stringF);
	}
}

class G extends F{
	protected String stringG;
	
	public G(String s) {
		super(null);
		stringG = s;
	}
	
	public void print() {
		super.print();
		System.out.println("stringG : "+stringG);
	}
}

class H extends G{
	protected String stringH;
	
	public H(String s) {
		super(null);
		stringH = s;
	}
	
	public void print() {
		super.print();
		System.out.println("stringH : "+stringH);
	}
}

class I extends H{
	protected String stringI;
	
	public I(String s) {
		super(null);
		stringI = s;
	}
	
	public void print() {
		super.print();
		System.out.println("stringI : "+stringI);
	}
}

class J extends I{
	protected String stringJ;
	
	public J(String s) {
		super(null);
		stringJ = s;
	}
	
	public void print() {
		super.print();
		System.out.println("stringJ : "+stringJ);
	}
}