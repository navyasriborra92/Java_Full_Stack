package com.objectmethods;

import java.util.Objects;

public class ObjectMethods {

	int age =10;//declaration with initialization
	String name;
	
	//3rd way of initializing varaibles parameterized constructor
	public ObjectMethods(int age, String name) {
		this.age = age;
		this.name = name;
	}
	
	public ObjectMethods() {

	}
	public static void main(String[] args) {
		ObjectMethods objectMethods = new ObjectMethods();
		objectMethods.age =20;
		objectMethods.name = "Navya"; // 2nd way of initializing varaibles
		
		ObjectMethods om = new ObjectMethods(40,"n");
		
		ObjectMethods om2 =new ObjectMethods();
		om2.setAge(40);
		om2.setName("n");
		
//		ObjectMethods om3 = null;
//		om3.equals(objectMethods);
		
		System.out.println(om.equals(objectMethods));
		System.out.println(om.equals(om2));
		System.out.println(om.hashCode());
		System.out.println(om2.hashCode());
		System.out.println(objectMethods.hashCode());
		
	}

	@Override
	public int hashCode() {
		return Objects.hash(age, name);
	}

	@Override
	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
		ObjectMethods other = (ObjectMethods) obj;
		return this.age == other.age && this.name.equals(other.name);
//				Objects.equals(name, other.name);
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
