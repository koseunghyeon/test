
public class FourOp {
	private int a;
	private int b;
	
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	
	void plus() {
		// a와 b를 더한 합을 출력 (a+b=x)
		System.out.println(this.a+"+"+this.b+"="+(this.a+this.b));
	}
	void minus() {
		// a-b
		System.out.println(this.a+"-"+this.b+"="+(this.a-this.b));
	}
	void multiply() {
		//a*b
		System.out.println(this.a+"x"+this.b+"="+(this.a*this.b));
	}
	void divide() {
		// a/b
		System.out.println(this.a+"/"+this.b+"="+(this.a/this.b));
	}
}
