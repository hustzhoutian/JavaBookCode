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
		// TODO �Զ����ɵķ������
		this.id = id;
	}

	private void setName(String name) {
		// TODO �Զ����ɵķ������
		this.name = name;
	}
	
	public Book getBook() {
		return this;
	}
	
}
