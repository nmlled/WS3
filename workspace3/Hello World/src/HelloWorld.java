/**
 * this is an hello!
 * this shows da basic anatomy of a program in Java
 * */
public class HelloWorld {
	
	
	public static void main (String[] args){
		
		/*System.out.println("foram passados " + args.length + " parametros");
		
		if(args.length != 0)
		System.out.println("hello world " + args[0]);
		
		
		String str ="Hello World";
		
		//ternary operator
		str = (args.length >0)? str + " " + args[0] + " e " + args[1] : str;
		System.out.println(str);
		
		//String empty;//variavel sem objecto
		//empty = "";//empty = new String("") - objecto tipo string
		String empty = new String("");
		
		String noString = null;
		*/
		
		//criar objecto do tipo empregado com o costrutor por omiss�o
		//Employee emp = new Employee();
		//atribuir valores aos campos com os m�todos setters
		//emp.setEmpNum(1234);
		//emp.setName("Nuno");
		//emp.setCity("Lisboa");
		
		//criar objecto do tipo empregado com construtor com parametros
		Employee emp = new Employee (1234, "Nuno", "Lisboa");
		
		String name = emp.getName();
		System.out.println("Hello " + name + ", from " + emp.getCity());
		
		System.out.println(emp.toString());//n�o � necess�rio o toString
		
		Object emp2 = new Employee (1234, "Nuno", "Lisboa");
		System.out.println(emp2.toString());
	}

}

