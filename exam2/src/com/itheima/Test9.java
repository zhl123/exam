package com.itheima;

import java.util.Arrays;

/**
 * 9�� ��һ�����б�дһ�������������������һ���ַ��������Ƿ����ĳ���ַ���������ڣ�
 *    �򷵻�����ַ����ַ������е�һ�γ��ֵ�λ�ã���Ŵ�0��ʼ���㣩�����򣬷���-1��
 *    Ҫ�������ַ�������ַ����Բ�����ʽ���ݴ��ݸ��÷�����������������Ϊnull��
 *    Ӧ�׳�IllegalArgumentException�쳣�������main�������Ը��ֿ��ܳ��ֵ����������֤�÷���
 *    ��д���Ƿ���ȷ�����磬�ַ������ڣ��ַ����ڣ����������Ϊnull�ȡ�
 * @author zhl
 *
 */
public class Test9 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//���鲻Ϊ�գ��ַ�����
		char [] ch = new char[]{'z','h','l'};

		char c1 = 'h';
		System.out.println("1������("+Arrays.toString(ch)+")��Ϊ�գ��ַ�("+c1+")����:");
		search(ch, c1);
		
		//���鲻Ϊ�գ��ַ�������

		char c2 = 'n';
		System.out.println("2������("+Arrays.toString(ch)+")��Ϊ�գ��ַ�("+c2+")������:");
		search(ch, c2);
		
		//����Ϊ�գ��ַ������ڻ����
		System.out.println("3������Ϊ�գ��ַ������ڻ����");
		char [] ch1 = null;
		search(ch1, c1);
	}
	public static void search(char [] ch,char c){
		int index = -1;
		try{
			for(int i = 0;i<ch.length;i++){
				if(c == ch[i]){
					index = i;
					break;
				}
			}
			if(index>0)
				System.out.println(c+"���±�"+index);
			else
				System.out.println("������û���ַ���"+c);
		}catch (Exception e) {
			// TODO: handle exception
			e.getStackTrace();
			System.out.println("�������ַ�������Ϊ�գ�");
		}
	}

}
