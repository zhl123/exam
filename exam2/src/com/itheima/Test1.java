package com.itheima;

import java.lang.reflect.*;
import java.util.*;

/**
 * 1�� ArrayList<Integer> list = new ArrayList<Integer>(); 
 * 	      ���������ΪInteger��ArrayList�д��һ��String���͵Ķ���
 * 
 * ���������ڷ��;��г��������͵Ĺ��ܣ��������ֽ����в�û�з������͵���Ϣ��
 * 		  ���Կ���ͨ���������ArrayList�ֽ��룬ͨ��ArrayList��add�������ֽ��������String����
 * @author zhl
 * 
 */

public class Test1 {
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<Integer>(); 
		
		//��list�����Integer����
		list.add(new Integer(1));
		list.add(new Integer(2));
		list.add(new Integer(3));
		list.add(new Integer(4));
		
		//���list�е�����
		System.out.println("Ingeger:"+list);
		
		
		//����list�������ArrayList�ֽ���
		Class clazz = list.getClass();
		//����ArrayList���add�����ֽ���
		Method addMethod = clazz.getMethod("add", Object.class);
		
		//list��Ԥ��ӵ��ַ���
		String str= "ZouHailin";
		
		//���÷������invoke����Ϊlist���StringԪ��
		addMethod.invoke(list,str);
		System.out.println("Ingeger���ͼ���String��:"+list);
	}

}
