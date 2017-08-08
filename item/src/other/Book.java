package other;


public class Book {
	private String name;
	private int id;
	
	public Book(int id){
		this.id = id;
	}
	
	public String getName() {
		//int id = 0;
		setName("java");
		//setId(1);
		return this.id+this.name;
	}

	private void setId(int id) {
		// TODO 自动生成的方法存根
		this.id = id;
	}

	private void setName(String name) {
		// TODO 自动生成的方法存根
		this.name = name;
	}
	
	public Book getBook() {
		return this;
	}
	
}
