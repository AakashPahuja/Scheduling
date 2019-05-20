import java.util.*;

public class Scheduler 
{
	public void FCFS(ArrayList<Process>p)
	{
		int counter= 0;
		double totalTime = 0;
		double waitTimeTotal = 0;
		double turnaroundTime = 0;
		System.out.println("FCFS: ");
		System.out.println("------------");
		Collections.sort(p, Process.FCFSComparator);
		
		for (Process pro: p)
		{
			while(counter != totalTime){
				pro.waiting();
				counter++;
			}
			pro.setWaitTime((int)(totalTime));
			totalTime += pro.getBurstTime();
			System.out.println(pro + "  Turnaround time = " + (int)totalTime);
			turnaroundTime += totalTime;
			waitTimeTotal += pro.getWaitTime();
		}
		double averageTurnaroundTime = (turnaroundTime/p.size());
		double averageWaitTime = (waitTimeTotal/p.size());
		System.out.println("Average waiting time = " +averageWaitTime + "  Average turnaround Time = " + averageTurnaroundTime);
		System.out.println();
	}
	
	public void SJF(ArrayList<Process>p)
	{
		System.out.println();
		System.out.println();
		System.out.println("SJF: ");
		System.out.println("------------");
		Collections.sort(p, Process.SFJComparator);
		
		for (Process pro: p)
		{
			System.out.print(pro);
		}
	}
	
	public void Priority(ArrayList<Process>p)
	{
		int counter= 0;
		double totalTime = 0;
		double waitTimeTotal = 0;
		double turnaroundTime = 0;
		System.out.println();
		System.out.println();
		System.out.println("Priority: ");
		System.out.println("------------");
		Collections.sort(p, Process.PriorityComparator);
		
		for (Process pro: p)
		{
			while(counter != totalTime){
				pro.waiting();
				counter++;
			}
			pro.setWaitTime((int)(totalTime));
			totalTime += pro.getBurstTime();
			System.out.println(pro + "  Turnaround time = " + (int)totalTime);
			turnaroundTime += totalTime;
			waitTimeTotal += pro.getWaitTime();
		}
		double averageTurnaroundTime = (turnaroundTime/p.size());
		double averageWaitTime = (waitTimeTotal/p.size());
		System.out.println("Average waiting time = " +averageWaitTime + "  Average turnaround Time = " + averageTurnaroundTime);
		System.out.println();
	}

}

	

