package oops.interfaces;

public abstract interface YouTuber extends VideoEditor {

	 void makevideo();
	 
	 default void uploadVideo() {
		 System.out.println("Upload the video.");
	 }
}
