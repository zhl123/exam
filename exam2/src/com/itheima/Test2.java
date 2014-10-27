package com.itheima;

/**
 * 2�� ���������ڿ���һ��ϵͳʱ��Ҫ��Ա�����н�ģ��Ա������ 3 �����ԣ������������Լ����ʡ�
 * 	      ����Ҳ��Ա�������˺���Ա���������⣬��Ϊ����һ���������ԡ�
 * 	      ��ʹ�ü̳е�˼����Ƴ�Ա����;����ࡣҪ�������ṩ��Ҫ�ķ����������Է��ʡ�
 * @author zhl
 *
 */
public class Test2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Ա��
		Employee ZhangSan = new Employee("ZhangSan",1,-9);
		Employee LiSi = new Employee("LiSi",2,3000);
		//����
		Manager ZHL = new Manager("ZHL", 1, 4000, 2000);
		
		System.out.println("-----------Ա��---------------");
		System.out.println("ZhangSan�Ĺ����ǣ�"+ZhangSan.getSalary());
		ZhangSan.printInfo();
		
		System.out.println("-------------Ա��-------------");
		System.out.println("LiSi�Ĺ����ǣ�"+LiSi.getSalary());
		LiSi.printInfo();
		
		System.out.println("-------------����-------------");
		System.out.println("ZHL�Ĺ����ǣ�"+ZHL.getSalary());
		System.out.println("ZHL�Ľ����ǣ�"+ZHL.getReward());
		ZHL.printInfo();
	}
}
 
//Ա����
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
	
	//���Ա������
	public int getSalary(){
		return salary;
	}
	
	//��ӡԱ����Ϣ
	public void printInfo(){
		System.out.println(name+"��ϸ����Ϣ��");
		System.out.println("	����(name)��"+name);
		System.out.println("	����(id)��"+id);
		System.out.println("	����(salary)��"+salary);
	}
}

//������
class Manager extends Employee{
	private int reward = 0;
	
	public Manager(String name,int id,int salary,int reward){
		super(name,id,salary);
		if(reward > 0)
			this.reward = reward;
	}
	
	//���Ա������
		public int getReward(){
			return reward;
		}
	
	//��ӡ������Ϣ
	public void printInfo(){
		super.printInfo();
		System.out.println("	����(reward)��"+reward);
	}
}