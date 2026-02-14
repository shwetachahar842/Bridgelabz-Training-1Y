 public class constructor{

	 int id;
	 String name;
	 int age;
	// public Constructor(){
	//	 System.out.println("Constructor Program");
	// }
	 public Constructor(int id, String name, int age){
		 this.id = id;
		 this.name = name;
		 this.age = age;
		 
	 }
	 
	 void display(){
		 System.out.println("ID:" +id);
		 System.out.println("Name:" +name);
		 System.out.println("Name:" +age);
	 }
	 public static void main(String[] args){
		 Constructor c = new Constructor(1,"Shweta",25);
		 System.out.println(c);
	 }
 }