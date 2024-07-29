
public class Process implements Priority , Comparable<Process> {
	
	protected String processID;
	protected int priority;
	
	public Process(String string) {
		this.processID=getProcessID();
		this.priority=getPriority();
	}// end constructor
	@Override
	public int compareTo(Process other) {
		 if (this.priority < other.priority) {
	            return -1;
	        } else if (this.priority > other.priority) {
	            return 1;
	        } else {
	            return 0;
	        }
	}//end compareTo()

	@Override
	public void setPriority(int priority) {
		if(this.priority >= 1 || this.priority <= 4) {
			
			this.priority = 1;
		
			if(this.priority >= 5 || this.priority <= 7) {
				
				this.priority = 5;
			
				if(this.priority >= 8 || this.priority <= 10) {
					
					this.priority = 10;
				}
			}
		}
			
	}// end setPriority

	@Override
	public int getPriority() {
		
		return priority;
	}//end getPriority
	
	public String getProcessID() {
		return processID;
	}//end getProcessID
	public void setProcessID(String processID) {
		this.processID = processID;
	}//end setProcessID
	@Override
	public String toString() {
		return "Process [preocessID=" + processID + ", priority=" + priority + "]";
	}//end toString
	
}//end class

