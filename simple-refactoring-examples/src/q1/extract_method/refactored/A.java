package q1.extract_method.refactored;

import java.util.List;

public class A {
   Node m1(List<Node> nodes, String p) {
      // TODO: Your answer
	   test(nodes,p);
      // other implementation
      return null;
   }

   Edge m2(List<Edge> edgeList, String p) {
      // TODO: Your answer
	   test(edgeList,p);
      // other implementation
      return null;
   }

   // TODO: Your answer
   // ? extractedMethod(?) {
   //
   // }
   <T extends Refactored> void test(List<T> objects, String p){
	   for(T object : objects) {
		   if (object.contains(p)) {System.out.println(object);}
	   }
   }
}

class Node extends Refactored {
   String name;

   public boolean contains(String p) {
      return name.contains(p);
   }
}

class Edge extends Refactored {
   String name;

   public boolean contains(String p) {
       return name.contains(p);
   }
}
class Refactored {
	String name;
	 public boolean contains(String p) {
	       return name.contains(p);
	   }
}
