package pro01;
class Book2 {
	private String title;
	private int price;
	
	Book2(){}
	Book2(String title, int price){
		this.title = title;
		this.price = price;
	}
	String getTitle() {
		return title;
	}
	int getPrice() {
		return price;
	}
	void setTitle(String title) {
		this.title = title;
	}
	void setPrice(int price) {
		this.price =price;
	}
	void printBook2() {
	System.out.println("title : " + title);
	System.out.println("price : " + price);}
}
public class Woohyun80 {

	public static void main(String[] args) {
		Book2 bk = new Book2("Java Programming", 25000);
		bk.printBook2();
		bk.setPrice(27000);
		bk.setTitle("Java Programming 2");
		System.out.println("title : " + bk.getTitle());
		System.out.println("price : " + bk.getPrice());

	}

}
