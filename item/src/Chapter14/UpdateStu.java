package Chapter14;

import java.util.Iterator;
import java.util.TreeSet;

public class UpdateStu implements Comparable<Object>{
	
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		UpdateStu stu1 = new UpdateStu("李同学", 01011);
		UpdateStu stu2 = new UpdateStu("陈同学", 01021);
		UpdateStu stu3 = new UpdateStu("王同学", 01051);
		UpdateStu stu4 = new UpdateStu("马同学", 01012);
		TreeSet<UpdateStu> tree = new TreeSet<>();
		tree.add(stu1);
		tree.add(stu2);
		tree.add(stu3);
		tree.add(stu4);
		Iterator<UpdateStu> it = tree.iterator();
		while (it.hasNext()) {
			UpdateStu stu = (UpdateStu) it.next();
			System.out.println(stu.getId()+" "+stu.getName());
		}
		it = tree.headSet(stu2).iterator();
		while (it.hasNext()) {
			UpdateStu stu = (UpdateStu) it.next();
			System.out.println(stu.getId()+" "+stu.getName());
		}
		it = tree.subSet(stu2, stu3).iterator();
		while (it.hasNext()) {
			UpdateStu stu = (UpdateStu) it.next();
			System.out.println(stu.getId()+" "+stu.getName());
		}
	}

	String name;
	long id;
	
	public UpdateStu(String name,int id) {
		// TODO 自动生成的构造函数存根
		this.id = id;
		this.name = name;
	}
	
	@Override
	public int compareTo(Object o) {
		// TODO 自动生成的方法存根
		UpdateStu upstu = (UpdateStu) o;
		int result = id>upstu.id?1:(id == upstu.id?0:1);
		return result;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public long getId() {
		return id;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	
}
