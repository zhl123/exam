package com.itheima;
/**
 * 3�� дһ��ArrayList��Ĵ���ʵ�ֺ�ArrayList����ȫ��ͬ�Ĺ��ܣ������Լ���ÿ���������е�ʱ�䡣
 * @author zhl
 *
 */
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.*;
import java.util.*;

public class Test3 {
	public static void main(String[] args) throws Exception {
		List list = arrayListProxy();
		list.add("zou");
		list.add("hai");
		list.add("lin");
		System.out.println("Ԫ�ظ�����"+list.size());
		System.out.println("list�е�����:"+list);
	}
	
	/**
	 * ArrayList������
	 * @return List ����
	 */
	public static List arrayListProxy() {
		//��newProxyInstanceʵ���������
		return (List)Proxy.newProxyInstance(			//newProxyInstance����������classloader��class��invocationhandler
				List.class.getClassLoader(), 
				new Class[]{List.class}, 
				new InvocationHandler() {
					private List target = new ArrayList();
					public Object invoke(Object proxy, Method method, Object[] args)
						throws Throwable {
							//long start = System.currentTimeMillis(); System.currentTimeMillis()ʱ�䵥λ���룩̫��					
							long start = System.nanoTime();					//��ʼʱ�䣨���룩
							Object ret = method.invoke(target, args);
							//long end = System.currentTimeMillis();
							long end = System.nanoTime();					//����ʱ��
							
							//��ӡ����������е�ʱ��
							System.out.println("����" + method.getName() + "��������:" + (end - start) + "����");		
							return ret;
					}
		});
	}
}