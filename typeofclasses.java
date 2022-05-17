package classroom;

public class typeofclasses {

		public void sendMessage() {
			System.out.println("send Message");
		}
		private void audioCall() {//we can`t use this to any other classes
			System.out.println("Audio call");
		}
		protected void videoCall() {
			System.out.println("Video call");
		}
		  void shareDocument() {
			System.out.println("Share document");
		}
		 public static void main(String[] args) {
			 typeofclasses mob =new typeofclasses();
			 mob.audioCall();
			 mob.videoCall();
			 mob.sendMessage();
			 mob.shareDocument();

	}

}
