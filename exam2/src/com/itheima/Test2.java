package com.itheima;

/**
 * 2、 假如我们在开发一个系统时需要对员工进行建模，员工包含 3 个属性：姓名、工号以及工资。
 * 	      经理也是员工，除了含有员工的属性外，另为还有一个奖金属性。
 * 	      请使用继承的思想设计出员工类和经理类。要求类中提供必要的方法进行属性访问。
 * @author zhl
 *
 */
public class Test2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//员工
		Employee ZhangSan = new Employee("ZhangSan",1,-9);
		Employee LiSi = new Employee("LiSi",2,3000);
		//经理
		Manager ZHL = new Manager("ZHL", 1, 4000, 2000);
		
		System.out.println("-----------员工---------------");
		System.out.println("ZhangSan的工资是："+ZhangSan.getSalary());
		ZhangSan.printInfo();
		
		System.out.println("-------------员工-------------");
		System.out.println("LiSi的工资是："+LiSi.getSalary());
		LiSi.printInfo();
		
		System.out.println("-------------经理-------------");
		System.out.println("ZHL的工资是："+ZHL.getSalary());
		System.out.println("ZHL的奖金是："+ZHL.getReward());
		ZHL.printInfo();
	}
}
 
//员工类
class Employee{
	private String name = null;
	private int id = 0;
	private int salary = 0;
	
	public Employee(){}
	public Employee(String name,int id,int salary){
		this.name = name;
		this.id = id;
		if(salary > 0)
			this.salary = salary;
	}
	
	//获得员工工资
	public int getSalary(){
		return salary;
	}
	
	//打印员工信息
	public void printInfo(){
		System.out.println(name+"详细的信息：");
		System.out.println("	姓名(name)："+name);
		System.out.println("	工号(id)："+id);
		System.out.println("	工资(salary)："+salary);
	}
}

//经理类
class Manager extends Employee{
	private int reward = 0;
	
	public Manager(String name,int id,int salary,int reward){
		super(name,id,salary);
		if(reward > 0)
			this.reward = reward;
	}
	
	//获得员工工资
		public int getReward(){
			return reward;
		}
	
	//打印经理信息
	public void printInfo(){
		super.printInfo();
		System.out.println("	奖金(reward)："+reward);
	}
}