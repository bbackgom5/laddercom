package woohyunhome35;

public class Code229 {

	public static void main(String[] args) {
		Data<Integer> d1 = new Data<Integer>(100);
		System.out.println(d1.getOjb());
		d1.showType();
		
		Data<String> d2 = new Data<String>("JAVA");
		System.out.println(d2.getOjb());
		d2.showType();
	}

}
