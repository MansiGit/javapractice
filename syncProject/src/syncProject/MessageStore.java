package syncProject;

public class MessageStore {
	private String message;

	synchronized public void storeMessage(String msg) {
		if (message != null)
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		message = msg;
		notify();
	}

	synchronized public String readMessage() {
		if (message == null) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		String m = message;
		message = null;
		notify();
		return m;
	}
}
