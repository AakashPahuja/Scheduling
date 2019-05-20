import java.util.*;

public class Process {
	private int pid;
	private int burstTime;
	private int arrivalTime;
	private int priority;
	private int waitTime = 0;

	public Process(int p, int bt, int at, int pri)
	{
		this.pid = p;
		this.burstTime = bt;
		this.arrivalTime = at;
		this.priority = pri;
	}
	
	//PID
	public int getPid()
	{
		return pid;
	}
	
	public void setPid(int p)
	{
		this.pid = p;
	}
	
	//Burst Time
	public int getBurstTime ()
	{
		return burstTime;
	}
	
	public void setBurstTime(int bt)
	{
		this.burstTime = bt;
	}
	
	//Arrival Time
	public int getArrivalTime ()
	{
		return arrivalTime;
	}
	
	public void setArrivalTime(int at)
	{
		this.arrivalTime = at;
	}
	
	//Priority
	public int getPriority ()
	{
		return priority;
	}
	
	public void setPriority(int pri)
	{
		this.priority = pri;
	}
	
	//Wait Time
	public int getWaitTime()
	{
		return waitTime;
	}
	
	public void setWaitTime(int wt)
	{
		waitTime = wt;
		wt = 0;
	}
	
	public void waiting(){
		waitTime++;
	}
	
	//FCFS Comparator
	public static Comparator<Process>FCFSComparator = new Comparator<Process>()
	{
		public int compare(Process at1, Process at2)
		{
			int arrivalTime1 = at1.getArrivalTime();
			int arrivalTime2 = at2.getArrivalTime();
			
			return arrivalTime1-arrivalTime2;  //which one is less
		}
	};

	//SJF Comparator
	public static Comparator<Process>SFJComparator = new Comparator<Process>()
	{
		public int compare(Process bt1, Process bt2)
		{
			int burstTime1 = bt1.getBurstTime();
			int burstTime2 = bt2.getBurstTime();
			
			return burstTime1-burstTime2;
		}
	};
	
	//Priority Comparator
	public static Comparator<Process>PriorityComparator = new Comparator<Process>()
	{
		public int compare(Process p1, Process p2)
		{
			int Priority1 = p1.getPriority();
			int Priority2 = p2.getPriority();
					
			return Priority1-Priority2;
		}
	};
	
	public String toString()
	{
		return "\nPid = " +pid+", Burst Time = " +burstTime+", Arrival Time = " +arrivalTime+", Priority = " +priority+", Wait Time =  "+waitTime;
	}
	

}
