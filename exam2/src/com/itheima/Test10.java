package com.itheima;

/**
 * 10、  金额转换，阿拉伯数字转换成中国传统形式。
 * 		例如：101000001010   转换为   壹仟零壹拾亿零壹仟零壹拾圆整
 * @author zhl
 *
 */
public class Test10{ public static void main(String[] args) {    
	System.out.println(convertNumber(101000001010l));  
	} 
public static String convertNumber(long number) {
	char[] chineseNumber = new char[]  { '零', '壹', '贰', '叁', '肆', '伍', '陆', '柒', '捌', '玖' };
	char[] units = new char[]  { '元', '拾', '佰', '仟', '万', '拾', '佰', '仟', '亿', '拾', '佰', '仟'};
	StringBuilder sb = new StringBuilder();
	long lastNumber = 0;
	int index = 0;
	while(number > 0){
		lastNumber = number % 10;
		//如果不是零
		if(lastNumber != 0){
				sb.insert(0, units[index++]);//先存进去单位    
				sb.insert(0, chineseNumber[(int) lastNumber]);//再存进去数字   
			}else{		//如果是零   
					//如果个位上是零,就只存进去单位,就是那个'元'
					if(sb.length() == 0){
							sb.insert(0, units[index++]);
						}else{     //如果不是此位之后也都是零,则不存任何单位  
							if(sb.lastIndexOf("元") == 0){
								index++;     
								}else{
									if(sb.charAt(0) != '零'){//如果下一位是零,则不存单位     
										sb.insert(0, chineseNumber[(int) lastNumber]);//再存进去数字
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
										
										