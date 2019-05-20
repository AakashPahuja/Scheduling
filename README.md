# Scheduling
Your task is to implement two of the following scheduling algorithms: First
Come First Served (FCFS), Shortest Job First (SJF), Priority Scheduling, or
Round Robin by creating a Java program to run a simulation. Create a Process
class that will contain necessary information about the process such as process
id, running time, arrival time, priority, etc. Then, create another class called
Scheduler, in which you will have a List or Queue of Process objects, along
with methods for each of the scheduling algorithms. Your program should
input information for 10 processes from the user (or set the values in the
program code), display the order in which they will run, along with each
process’ wait time and turnaround time – then, compute and display the
average wait time and average turnaround time.
Sample variables for the Process class:
pid: process id (unique value)
burstTime: running time
arrivalTime: arrival time
priority: priority
waitTime: wait time (initialized to 0)
Hints for program:
*In the Process class - Create a constructor that will take parameters to
initialize pid, burstTime, arrivalTime, and priority; waitTime will be
initialized to 0 in the constructor. Create get methods for each of the
variables. Include a method called waiting() that will increment the
waitTime variable.
*In the Scheduler class – Include methods for each of the scheduling
algorithms (FCFS, SJF, or priority). The list, or queue, of process objects
(stored in either an ArrayList, List, or Queue) can either be an instance
variable of the class, or setup as a parameter to each of the scheduling
methods. 
[In the methods it would be useful to create a time variable (counter). Based
on the time and algorithm, select which process will run (will need to keep
track of remaining running time). While a process is running, will need to call
the waiting() method on all processes that have arrived but are not yet
running.]
*Create a RunScheduler class that contains a main method that will run the
simulation. Create the list, or queue, of processes and run each of the 2
algorithms using the methods of the Scheduler class.
[The values to initialize the processes can be hardcoded in the Java code,
rather than user input to make it more efficient to test] 
