import java.util.*;

public class RunScheduler {
	public static void main (String []args)
	{
		ArrayList<Process> p = new ArrayList<Process>();
		p.add(new Process(1, 10, 0, 1));
		p.add(new Process(2, 15, 5, 3));
		p.add(new Process(3, 17, 8, 5));
		p.add(new Process(4, 18, 10, 4));
		p.add(new Process(5, 5, 14, 2));
		p.add(new Process(6, 8, 3, 6));
		p.add(new Process(7, 20, 16, 7));
		p.add(new Process(8, 7, 20, 9));
		p.add(new Process(9, 23, 9, 10));
		p.add(new Process(10, 9, 18, 8));
		
		Scheduler s = new Scheduler();
		
		s.FCFS(p);
		s.SJF(p);
		s.Priority(p);
		
	}
}
