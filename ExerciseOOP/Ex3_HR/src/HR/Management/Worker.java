package HR.Management;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Worker extends Human implements Comparator<Worker> {
	private int weekSalary;
	private int workHouseSalary;
	
	public Worker(){
		super();
		this.weekSalary = 0;
		this.workHouseSalary = 0;
	}
	
	public Worker(String firstName, String lastName, int weekSalary, int workHourSalary){
		super(firstName, lastName);
		this.weekSalary = weekSalary;
		this.workHouseSalary = workHourSalary;
	}
	
	
	@Override
	public String toString() {
		return "Worker [firstName=" + firstName + ", lastName="
				+ lastName + ", weekSalary=" + weekSalary + ", workHouseSalary="
				+ workHouseSalary +  "]";
	}

	public int getWeekSalary() {
		return weekSalary;
	}

	public void setWeekSalary(int weekSalary) {
		this.weekSalary = weekSalary;
	}

	public int getWorkHouseSalary() {
		return workHouseSalary;
	}

	public void setWorkHouseSalary(int workHouseSalary) {
		this.workHouseSalary = workHouseSalary;
	}

	public Double moneyPerHours(){
		
		 return (double) (this.weekSalary/7);
	}
	
	
	public void showWorker(List<Worker> worker){
		Collections.sort(worker, new Worker());
		for(Worker w : worker){
			System.out.println(w);
		}
		System.out.println("\n");
		
	}

	@Override
	public int compare(Worker o1, Worker o2) {
		// TODO Auto-generated method stub
		if(o1.moneyPerHours() < o2.moneyPerHours())
		{
			return 1;
		}
		else
		{
			return -1;
		}
	}
}
