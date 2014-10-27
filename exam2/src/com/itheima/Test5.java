package com.itheima;
/**
 * 5��  ��д������Ticket��SealWindow��TicketSealCenter�ֱ����Ʊ��Ϣ����Ʊ���ڡ���Ʊ���ġ�
 *	       ��Ʊ���ķ���һ��������Ʊ�������ɸ���Ʊ���ڽ��г��ۣ���������ѧ���߳�֪ʶ��ģ�����Ʊ���̡�
 * @author zhl
 *
 */
public class Test5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//����SealWindow�̶߳���
		SealWindow sw = new SealWindow();
		
		//�����ĸ��߳�
		new Thread(sw).start();
		new Thread(sw).start();
		new Thread(sw).start();
		new Thread(sw).start();

	}
}

//Ʊ��Ϣ��
class Ticket{
	//Ʊ�ı��
	private static int ticketId = 100;
	
	//��ȡƱ�����Ϣ
	public int getTicketId(){
		return ticketId++;
	}
}

//��Ʊ������
class TicketSealCenter{
	private int ticketsNum = 0;
	
	public TicketSealCenter(int ticketsNum){
		this.ticketsNum = ticketsNum;
	}
	//Ʊ������
	public void  subTicket(){
		ticketsNum--;
	}
	//�õ�ʣ��Ʊ��
	public int getTicket(){
		return ticketsNum;
	}
}

//��Ʊ������
class SealWindow implements Runnable{
	private TicketSealCenter tsc = new TicketSealCenter(100);
	private Ticket t = new Ticket();
	@Override
	public void run() {
		while(tsc.getTicket()>0){
			// TODO Auto-generated method stub
			tsc.subTicket();
			System.out.println(Thread.currentThread().getName()+"�Ŵ���"+"������"+t.getTicketId()+"��Ʊ����ʣ��"+tsc.getTicket());
		}
	}
}
