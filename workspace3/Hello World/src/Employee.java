/**
 * *
 * Class represents Employee
 *
 */
public class Employee {
	private int empNum;
	private String name;
	private String city;
	
	/**
	 * creates instance of {@link Employee} without arguments*
	 */
	
	public Employee(){
		this.city = "Lisboa";
	}
	
	/***
	 * Creates an instante of {@link Employee}, with arguments
	 * @param empNum number of the {@link Employee}
	 * @param name name of the {@link Employee}
	 */
	
	public Employee(int empNum, String name){
		this();//j� tem informa��o da cidade
		this.empNum = empNum;
		this.name = name;

	}
	
	
	/***
	 * Creates an instante of {@link Employee}, with arguments
	 * @param empNum number of the {@link Employee}
	 * @param name name of the {@link Employee}
	 * @param city of the {@link Employee}
	 */
	
	public Employee(int empNum, String name, String city){
		this.empNum = empNum;
		this.name = name;
		this.city = city;
	}
	
	//Getters/Setters methods
public int getEmpNum(){
	
	return empNum;
}

public void setEmpNum(int empNum){
	this.empNum = empNum;
}

public String getName(){
	
	return name;
}

public void setName(String name){
	
	this.name = name;
}

//setName Overload
public void setName(String firstName, String lastName){
	
	this.name = firstName + " " + lastName;
}

public String getCity(){
	
	return city;
}

public void setCity(String city){
	
	this.city = city;
}

@Override
public String toString(){
	//return super.toString();
	return "Employee [empName: " + this.getName() + " empNum: " + this.getEmpNum() +" empCity: " + this.getCity() + "]";
}

}
