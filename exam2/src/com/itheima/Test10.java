package com.itheima;

/**
 * 10��  ���ת��������������ת�����й���ͳ��ʽ��
 * 		���磺101000001010   ת��Ϊ   ҼǪ��Ҽʰ����ҼǪ��ҼʰԲ��
 * @author zhl
 *
 */
public class Test10{ public static void main(String[] args) {    
	System.out.println(convertNumber(101000001010l));  
	} 
public static String convertNumber(long number) {
	char[] chineseNumber = new char[]  { '��', 'Ҽ', '��', '��', '��', '��', '½', '��', '��', '��' };
	char[] units = new char[]  { 'Ԫ', 'ʰ', '��', 'Ǫ', '��', 'ʰ', '��', 'Ǫ', '��', 'ʰ', '��', 'Ǫ'};
	StringBuilder sb = new StringBuilder();
	long lastNumber = 0;
	int index = 0;
	while(number > 0){
		lastNumber = number % 10;
		//���������
		if(lastNumber != 0){
				sb.insert(0, units[index++]);//�ȴ��ȥ��λ    
				sb.insert(0, chineseNumber[(int) lastNumber]);//�ٴ��ȥ����   
			}else{		//�������   
					//�����λ������,��ֻ���ȥ��λ,�����Ǹ�'Ԫ'
					if(sb.length() == 0){
							sb.insert(0, units[index++]);
						}else{     //������Ǵ�λ֮��Ҳ������,�򲻴��κε�λ  
							if(sb.lastIndexOf("Ԫ") == 0){
								index++;     
								}else{
									if(sb.charAt(0) != '��'){//�����һλ����,�򲻴浥λ     
										sb.insert(0, chineseNumber[(int) lastNumber]);//�ٴ��ȥ����
										index++;      
										}else{
											index++;
											}
									}
							}
					}
		number /= 10;
	}
	return sb.toString();
	}
}
										
										