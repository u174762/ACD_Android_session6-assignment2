public class Main {

	public static void main(String args[])
	{
		// in this function the derived classes from StringedInstrument are called with their play methods.
		
		tambura guitar= new tambura();
		veena guiter1= new veena();
		
		guitar.play();
		guiter1.play();
	}
	
}