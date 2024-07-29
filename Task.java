
public class Task implements Priority , Comparable<Task>{

	public enum Status {NOT_STARTED, IN_PROCESS, COMPLETE}
	public String name;
	public int priority;
	
	public Task() {
		this.name = "";
		this.priority = 0;
	}//end empty-argument constructor
	
	public Task(String string) {
		this.name=string;
		this.priority=getPriority();
	}//end preferred constructor
	
	public void setStatus(Status status) {
		this.setStatus(status);
	}//end setStatus
	
	@Override
	public void setPriority(int priority) {
		if(this.priority >= 1 || this.priority <= 4) {
			
			this.priority = 1;
		}
			if(this.priority >= 5 || this.priority <= 7) {
				
				this.priority = 5;
			}
				if(this.priority >= 8 || this.priority <= 10) {
					
					this.priority = 10;
				}		
	}// end setPriority

	@Override
	public int getPriority() {
		
		return priority;
	}// end getPriority
	
	@Override
	public int compareTo(Task other) {
		 // Compare the current object (this) with the specified object (other)
        if (this.priority < other.priority) {
            return -1;
        } else if (this.priority > other.priority) {
            return 1;
        } else {
            return 0;
        }
	}//end compareTo()
	@Override
	public String toString() {
		return "Task [name=" + name + ", priority=" + priority + "]";
	}//end toString
	
}// end class

