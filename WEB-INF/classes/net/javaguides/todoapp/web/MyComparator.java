package net.javaguides.todoapp.web;

import java.util.Comparator;
import net.javaguides.todoapp.model.*;

public class MyComparator  implements Comparator<Todo>{

	@Override
	public int compare(Todo arg0, Todo arg1) {
		// TODO Auto-generated method stub
		if(arg0.getTargetDate().isBefore(arg1.getTargetDate())) {
			return -1;
		}else if(arg0.getTargetDate().isAfter(arg1.getTargetDate())){
			return +1;
		}else if(arg0.getPriority()>arg1.getPriority()) {
			return -1;
		}else if(arg0.getPriority()<arg1.getPriority()) {
			return +1;
		}else {
			return -1;
		}
	}

}
