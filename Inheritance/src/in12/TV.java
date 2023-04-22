package in12;

public class TV implements Sound { // Sound
	private int sndLevel;
	
	public TV() {
		sndLevel = 0;
	}
	
	@Override
	public void SoundUp(int level) {
		sndLevel += level;
		System.out.println("TV 볼륨 증가");
	}
	
	@Override
	public void SoundDown(int level) {
		sndLevel -= level;
		if(sndLevel < 0) 
			sndLevel = 0;
		System.out.println("TV 볼륨 감소");
		
	}
	
	
}
