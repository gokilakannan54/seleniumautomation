package facebook;


	
		import java.util.ArrayList;

		public class Geeks {

			public static void main(String[] args) {
				
				ArrayList<String> li=new ArrayList<String>();
				
				li.add("Java");
				//li.add("Java");
				li.add("Python");
				li.add("C#");
				li.add("C++");
				
				System.out.println("Element of the given Arraylist are");
				
				
				for(String s:li) {
					System.out.println(s);
				}
				
				System.out.println("Element at index 1 : "+li.get(1));
				
				li.remove("C++");
				
				System.out.println("List After removing element "+li);
				

			}

		

	}


