package state.github;

public class Demo {

	public static void main(String[] args) {
		State off = new OffState();
		TV tv = new TV(off);
		tv.doAction();
		
		State on = new OnState();
		tv.changeState(on);
		tv.doAction();
                              
                State nw = new NotWorkingState();
                tv.changeState(nw);
                tv.doAction();
                
                
                
            
	}

}
