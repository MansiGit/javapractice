package syncProject;

public class SyncMain {

	public static void main(String[] args) {
		MessageStore m=new MessageStore();
		MessageReader mr= new MessageReader(m);
		MessageWriter mw= new MessageWriter(m);
		mw.start();
		mr.start();

	}

}
/* ======When no notify is used. some msgs are skipped while receiving. 
 * Stored Message 1
                         Received Message : 1
Stored Message 2
                         Received Message : 2
Stored Message 3
                         Received Message : 3
Stored Message 4
Stored Message 5
                         Received Message : 5
Stored Message 6
                         Received Message : 6
Stored Message 7
Stored Message 8
                         Received Message : 8
Stored Message 9
                         Received Message : 9
Stored Message 10
                         Received Message : 10
                         Received null
                         Received null
*/
 /*===========when notify is used, even if msgs are wtritten faster than they are read, 
  * notify will wait for read, then only write new msg 
  * Stored Message 1
                         Received Message : 1
Stored Message 2
                         Received Message : 2
Stored Message 3
                         Received Message : 3
Stored Message 4
                         Received Message : 4
Stored Message 5
                         Received Message : 5
Stored Message 6
                         Received Message : 6
Stored Message 7
                         Received Message : 7
Stored Message 8
                         Received Message : 8
Stored Message 9
                         Received Message : 9
Stored Message 10
                         Received Message : 10

  * */
