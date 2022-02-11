package woohyunhome08;

public class ChildrenBook implements Book {
	private String title;
	private String author;
	
	ChildrenBook(){}
	ChildrenBook(String title, String author){
		this.title= title;
		this.author = author;
	}
	public void printInfo() {
		System.out.println("** info for books **");
	}
	public void showTitle() {
		System.out.println("title : " + title);
		System.out.println("author : "+ author);
	}

}
