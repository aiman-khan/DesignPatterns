package balking_pattern;

public class Example {
    private boolean jobInProgress = false;      //here the initial value is set to false of job in progress 

    //
    public void job() {
        synchronized(this) {
            if (jobInProgress) {   // will check it the job is in progress, e.g there is a machine and it is in ON state 
                return; 			// will do nothing here, because is is already in ON state
            }						
            jobInProgress = true;	// will set to true, because machine is already running
            System.out.println("Job in Progress");      //prints out the message
        }

        jobCompleted(); // call the other method, where we set it to complete
    }

    
    void jobCompleted() {
        synchronized(this) {
            jobInProgress = false;    // if the job is completed, the progress will stop, 
            System.out.println("Job Completed");
            // BALKING OCCURS 

        }
    }
}