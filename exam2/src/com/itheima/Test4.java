package com.itheima;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Test4 {

	/**
	 * 4�� ��дһ���࣬��main�����ж���һ��Map���󣨲��÷��ͣ���
	 * 	      �������ɸ�����Ȼ���������ӡ����Ԫ�ص�key��value��
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, String> map = new HashMap<Integer, String>();
		//��Ӷ���
		map.put(0, "ZHL");
		map.put(1, "zou");
		map.put(2, "hai");
		map.put(3, "lin");	
		
		//��ӡmap��Ԫ�صĸ���
		System.out.println("map��С��"+map.size());
		Set key= map.keySet();
		//���map�е�keyֵ
		System.out.println("map�е�keyֵ��"+key);
		//���õ��������map�е�valueֵ
		Iterator keyIt = key.iterator();
		while(keyIt.hasNext()){
			Object num = keyIt.next();
			System.out.println(num+":"+map.get(num));
		}
	}
}
