package HR.Management;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main implements Comparator<Human> {

	@Override
	public int compare(Human o1, Human o2) {
		int res = o1.getFirstName().compareToIgnoreCase(o2.getFirstName());
		if (res != 0) {
			return res;
		}
		return o1.getLastName().compareToIgnoreCase(o2.getLastName());
	}

	public static void Print(List<Human> merge)
	{
		Collections.sort(merge, new Main());
		{
			for(Human h : merge)
			{
				System.out.println(h);
			}
		}
	}

	public static void main(String[] args) {
		List<Student> listStudent = new ArrayList<Student>();
		List<Worker> listWorker = new ArrayList<Worker>();

		listStudent.add(new Student("Nguyen Van", "A", 5));
		listStudent.add(new Student("Nguyen Van", "B", 9));
		listStudent.add(new Student("Tran Van", "Chi", 10));
		listStudent.add(new Student("Bui Duc", "Luc", 12));
		listStudent.add(new Student("Nguyen Duc", "Anh", 7));
		listStudent.add(new Student("Ho Van", "Tuan", 8));
		listStudent.add(new Student("Trinh Van", "Loc", 6));
		listStudent.add(new Student("Nguyen Xuan", "Phu", 2));
		listStudent.add(new Student("Nguyen Huu", "Cuong", 1));
		listStudent.add(new Student("Tran Anh", "Khoa", 3));

		listWorker.add(new Worker("Nguyen Viet", "Vong", 5000, 2000));
		listWorker.add(new Worker("Nguyen Thanh", "Nhat", 6000, 5000));
		listWorker.add(new Worker("Le Van", "Hiep", 12000, 3000));
		listWorker.add(new Worker("Tran Van", "Nhan", 14000, 1000));
		listWorker.add(new Worker("To Van", "Trieu", 6000, 1000));
		listWorker.add(new Worker("Huynh Van", "Thai", 9000, 1000));
		listWorker.add(new Worker("Hoang Nhat", "Quang", 4000, 3000));
		listWorker.add(new Worker("Phan Van", "Cuong", 7000, 7000));
		listWorker.add(new Worker("Pham Nhat", "Tuan", 3000, 5000));
		listWorker.add(new Worker("Nguyen Viet", "Nam", 20000, 2000));
		
		//merge list student and list worker
		
		List<Human> listHuman = new ArrayList<Human>();
		listHuman.addAll(listStudent);
		listHuman.addAll(listWorker);

		/*
		 * Collections.sort(listStudent, (Student o1, Student o2) -> { if
		 * (o1.getGrade() - o2.getGrade() > 0) { return o1.getGrade(); } return
		 * o2.getGrade(); });
		 */

		// show student list
		Student student = new Student();
		student.showStudent(listStudent);
		
		
		
		//show list worker
		Worker worker = new Worker();
		worker.showWorker(listWorker);
		
		
		Print(listHuman);
	}

}
