/**
 * this is an hello!
 * this shows da basic anatomy of a program in Java
 * */
public class HelloWorld {
	
	
	public static void main (String[] args){
		
		System.out.println("foram passados " + args.length + " parametros");
		
		if(args.length != 0)
		System.out.println("hello world " + args[0]);
		
		
		String str ="Hello World Ola";
		
		//ternary operator
		str = (args.length >0)? str + " " + args[0] + " e " + args[1] : str;
		System.out.println(str);
		
		//String empty;//variavel sem objecto
		//empty = "";//empty = new String("") - objecto tipo string
		String empty = new String("");
		
		String noString = null;
		
	}

}

