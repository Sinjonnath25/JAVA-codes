abstract class Parent 
{ 
abstract void message(); 
} 
class child1 extends Parent 
{ void message()
 { System.out.println("This is first subclass"); 
} 
} 
class child2 extends Parent 
{ void message()
 { System.out.println("This is second subclass");
 } } 
class abstract1
 { public static void main(String []args)
 { 
 
 Parent obj; 
 obj=new child1();
 obj.message();
 obj=new child2();
 obj.message();
 }
 }