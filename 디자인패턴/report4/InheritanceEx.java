package chapter5;

class Person {
	private int weight;
	int age;
	protected int height;
	public String name;
	
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	public int getWeight() {
		return weight;
	}
}

class Student extends Person {
	public void set() {
		age = 25;
		name = "�̻��";
		height = 175;
		// weight = 65;
		setWeight(65);
	}
}

public class InheritanceEx {
	public static void main(String[] args) {
		Student s = new Student();
		s.set();
		System.out.print("����: " + s.age + "\n�̸�: " + s.name
				+ "\nŰ: " + s.height + "\n������: " + s.getWeight());
	}
}
