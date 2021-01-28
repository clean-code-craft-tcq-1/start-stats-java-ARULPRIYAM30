package statisticker;

public class EmailAlert implements IAlerter {

	public boolean emailSent;
	
	public void alert(boolean emailSent)
	{
		this.emailSent = emailSent;
	}

}


