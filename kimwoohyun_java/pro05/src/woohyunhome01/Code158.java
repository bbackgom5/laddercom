package woohyunhome01;

public class Code158 {
	private int code;
	private String title;
	private int price;
	
	
	public void Code158() {}
	public void Code158(int code, String title, int price) {
		this.code=code;
		this.title=title;
		this.price=price;
	}
	public int getCode() {return code;}
	public String getTitle() {return title;}
	public int getPrice() {return price;}
	
	public void printBookinfo() {
		System.out.println("code : " + code);
		System.out.println("title : "+ title);
		System.out.println("price : "+ price);
	}

}
