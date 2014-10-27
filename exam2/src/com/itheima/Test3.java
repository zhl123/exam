package com.itheima;
/**
 * 3、 写一个ArrayList类的代理，实现和ArrayList中完全相同的功能，并可以计算每个方法运行的时间。
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
		System.out.println("元素个数："+list.size());
		System.out.println("list中的数据:"+list);
	}
	
	/**
	 * ArrayList代理类
	 * @return List 对象
	 */
	public static List arrayListProxy() {
		//用newProxyInstance实例代理对象
		return (List)Proxy.newProxyInstance(			//newProxyInstance三个参数：classloader、class、invocationhandler
				List.class.getClassLoader(), 
				new Class[]{List.class}, 
				new InvocationHandler() {
					private List target = new ArrayList();
					public Object invoke(Object proxy, Method method, Object[] args)
						throws Throwable {
							//long start = System.currentTimeMillis(); System.currentTimeMillis()时间单位（秒）太大					
							long start = System.nanoTime();					//开始时间（纳秒）
							Object ret = method.invoke(target, args);
							//long end = System.currentTimeMillis();
							long end = System.nanoTime();					//结束时间
							
							//打印输出方法运行的时间
							System.out.println("调用" + method.getName() + "方法运行:" + (end - start) + "纳秒");		
							return ret;
					}
		});
	}
}