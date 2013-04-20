
public class test {

	public void test() {

		new asd();
		Intent i = new Intent("android.intent.action.WEB_SEARCH");
		Intent fbi = new Intent("itu.dk.aamj.broadcastintent");
		try {
			sendBroadcast(fbi);
		} catch (ActivityNotFoundException e) {
		}
		
	}

}
