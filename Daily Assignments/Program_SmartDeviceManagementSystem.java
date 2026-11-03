package dailyassignments;
interface Camera
{
	void takePhoto();
    void recordVideo();
	
}
interface MusicPlayer
{
	void playMusic();
	void stopMusic();
}
class SmartPhone implements Camera,MusicPlayer
{
	public void takePhoto()
	{
		System.out.println("Photo Captured Successfully");
	}
	public void recordVideo()
	{
		System.out.println("Video Recording Started");
	}
	public void playMusic()
	{
		System.out.println("Music is Playing");
	}
	public void stopMusic()
	{
		System.out.println("Music Stopped");
	}
	void makeCall()
	{
		System.out.println("Making a Phone Call");
	}
}
public class Program_SmartDeviceManagementSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       SmartPhone sp=new SmartPhone();
       sp.takePhoto();
       sp.recordVideo();
       sp.playMusic();
       sp.stopMusic();
       sp.makeCall();
	}

}
