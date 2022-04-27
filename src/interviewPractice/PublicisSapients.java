package interviewPractice;

public class PublicisSapients {
	public static void main(String[] args) {
		System.out.println("Hello Java");

		Animal a = new Dog();
		a.show();
		Animal b = new Cat();
		b.show();
		try {
			Cat c = (Cat) a;
			c.show();
		} catch (Exception ex) {
			System.out.println("Exception is: " + ex.getLocalizedMessage());
		} finally {
			System.out.println("Done Here..");
		}
	}

}

class Animal {
	void show() {
		System.out.println("Inside Animal");
	}
}

class Dog extends Animal {
	void dogShow() {
		System.out.println("Inside Dog");
	}
}

class Cat extends Animal {
	void catShow() {
		System.out.println("Inside Cat");
	}
}

//package whatever; // don't place package name!
//Installed Libraries: JSON-Simple, JUNit 4, Apache Commons Lang3
/*
 * import java.io.*;
 * 
 * class MyCode { public static void main (String[] args) {
 * System.out.println("Hello Java"); Fish fish=new Fish(); fish.swim();
 * 
 * List<Employee> empList = new ArrayList<>();
 * 
 * // create 5 objects // fileer out salry > 5000 // sort them by name Employee
 * emp1=Employee("aaa",25,100); Employee emp2=Employee("bbb",26,20000); Employee
 * emp3=Employee("ccc",27,30000);
 * 
 * empList.add(emp1); empList.add(emp2); empList.add(emp3); List<Employee>
 * filteredList=null; for(Employee empl:empList){ if(empl.sal>5000){
 * System.out.println("List Value:" + empl.name,empl.age,empl.sal);
 * filteredList.add(empl); } } retrun fiterList; //sort
 * 
 * 
 * }
 * 
 * 
 * class Employee{ private String name; private int age; private int sal;
 * 
 * Employee(String name,int age,int sal){ this.name=name; this.age=age;
 * this.sal=sal; } }
 * 
 * public static void main(String[] args) { ArrayList<Integer> list = new
 * ArrayList<>();
 * 
 * list.add(1); list.add(2); list.add(3); list.add(4); list.add(5);
 * 
 * Iterator<Integer> it = list.iterator(); while (it.hasNext()) { Integer value
 * = it.next(); System.out.println("List Value:" + value); if (value.equals(3))
 * list.remove(value); }
 * 
 * }
 * 
 * 
 * 
 * public static int test(int i) { try { if (i == 0) throw new Exception();
 * return 0; } catch (Exception e) { return 1; } finally { return 2; } }
 * 
 * public static void main(String[] args) { System.out.println(test(0));
 * System.out.println(test(1)); } } interface animal{ void name(); static void
 * makesound(); } class Cat implements animal{ void name(){
 * system.out.println("Cat"); } void makesound(){ system.out.println("Cat"); } }
 * class Dog implements animal{ }
 * 
 * class Fish implements animal{ void name(){ system.out.println("fish"); }
 * 
 * void swim(){ system.out.println("Swim"); }
 * 
 * Animal obj = new Dog(); Animal obj2 = new Cat();
 * 
 * Dog d = new Animal();
 * 
 * Cat obj3 = (Cat) obj;
 * 
 * }
 */