package state.github;

public class OffState implements State{

	@Override
	public void doAction() {
		System.out.println("TV is off");
		
	}

}
