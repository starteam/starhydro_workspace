/* Generated by star.annotations.GeneratedClass, all changes will be lost */

package star.hydrology.events;

public class SlopePDFEvent extends star.hydrology.events.PDFEvent
{
	private static final long serialVersionUID = 1L;

	public  SlopePDFEvent(star.event.Raiser raiser, boolean valid)
	{
		super( raiser , valid ) ;
	}
	 
	public  SlopePDFEvent(star.hydrology.events.SlopePDFEvent event)
	{
		super( event ) ;
	}
	 
	public  SlopePDFEvent(star.hydrology.events.SlopePDFRaiser raiser)
	{
		super( raiser ) ;
	}
	 
	public void raise()
	{
		raiseImpl();
	}
	 
}