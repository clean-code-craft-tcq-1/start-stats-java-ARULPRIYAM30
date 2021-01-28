package statisticker;

public class LEDAlert implements IAlerter {

	public boolean ledGlows;
	
	public void alert(boolean ledGlows)
	{
		this.ledGlows = ledGlows;
	}

}
