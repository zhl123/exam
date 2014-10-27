package com.itheima;
/**
 * 5、  编写三各类Ticket、SealWindow、TicketSealCenter分别代表票信息、售票窗口、售票中心。
 *	       售票中心分配一定数量的票，由若干个售票窗口进行出售，利用你所学的线程知识来模拟此售票过程。
 * @author zhl
 *
 */
public class Test5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//创建SealWindow线程对象
		SealWindow sw = new SealWindow();
		
		//启动四个线程
		new Thread(sw).start();
		new Thread(sw).start();
		new Thread(sw).start();
		new Thread(sw).start();

	}
}

//票信息类
class Ticket{
	//票的编号
	private static int ticketId = 100;
	
	//获取票编号信息
	public int getTicketId(){
		return ticketId++;
	}
}

//售票中心类
class TicketSealCenter{
	private int ticketsNum = 0;
	
	public TicketSealCenter(int ticketsNum){
		this.ticketsNum = ticketsNum;
	}
	//票数减少
	public void  subTicket(){
		ticketsNum--;
	}
	//得到剩余票数
	public int getTicket(){
		return ticketsNum;
	}
}

//售票窗口类
class SealWindow implements Runnable{
	private TicketSealCenter tsc = new TicketSealCenter(100);
	private Ticket t = new Ticket();
	@Override
	public void run() {
		while(tsc.getTicket()>0){
			// TODO Auto-generated method stub
			tsc.subTicket();
			System.out.println(Thread.currentThread().getName()+"号窗口"+"正在售"+t.getTicketId()+"号票，还剩下"+tsc.getTicket());
		}
	}
}
