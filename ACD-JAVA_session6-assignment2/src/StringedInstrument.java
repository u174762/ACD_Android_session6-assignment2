
public class StringedInstrument extends maininstument {

	// this class extends the abstract class Instrument and adds an attribute numberOfStrings. 
	
	
	
	int numberOfStrings;
	
	public void play()
	{}
	
	
}

class ElectricGuitar extends StringedInstrument
{
	//This class extends the StringedInstrument class and provides body to the play method.
	
	
	public void play()
	{
		name="ElectricGuitar";
		numberOfStrings = 20;
		
		System.out.println("The name of the instrument is: "+name+" and it has: "+numberOfStrings+" strings.");
	}
	
	
}



class ElectricBassGuitar extends StringedInstrument
{
	//this class also extends the StringedInstrument method and provides body for the play method.
	
	public void play()
	{
		name="ElectricBassGuitar";
		numberOfStrings=25;
		System.out.println("The name of the instrument is: "+name+" and it has: "+numberOfStrings+" strings.");
	}
	
	
}