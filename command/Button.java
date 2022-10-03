package command;

public class Button {

	private Command command;

	public Button(Command command) {
		this.command = command;
	}

	public static void main(String[] args) {
		Button button = new Button(new LightOnCommand(new Light()));
		button.press();
		button.press();
	}

	public void press() {
		command.execute();
	}

}
