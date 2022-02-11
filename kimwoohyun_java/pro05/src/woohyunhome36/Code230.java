package woohyunhome36;

public class Code230 {

	public static void main(String[] args) {
		TwoGenerics<Integer,String> x=
				new TwoGenerics<Integer,String>(100,"hello");
		x.showGenericType();
		int y = x.getData1();
		System.out.println("value : " + y);
		String z = x.getData2();
		System.out.println("value : " + z);
	}

}
