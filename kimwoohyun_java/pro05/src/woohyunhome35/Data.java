package woohyunhome35;

public class Data<T> {
	T obj;
	Data(T ob){
		obj = ob;
	}
	T getOjb() {
		return obj;
	}
	void showType() {
		System.out.println("Type of T : " + obj.getClass().getName());
	}
}
