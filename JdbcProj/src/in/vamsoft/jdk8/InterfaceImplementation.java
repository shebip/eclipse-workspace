package in.vamsoft.jdk8;

interface I1{
	public default void m() {
		System.out.println("M in I1");
	}
}
interface I2{
	public default void m() {
		System.out.println("M in I2");
	}
}
class InterfaceImplementation implements I1,I2
 {
			public static void main(String[] args) {
			InterfaceImplementation mc=new InterfaceImplementation();
			mc.m();
		}
	
	@Override
	public void m() {
		// TODO Auto-generated method stub
		I1.super.m();
	}	
	

}
