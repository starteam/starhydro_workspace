/* Generated by star.annotations.GeneratedClass, all changes will be lost */

package star.hydrology.events;

public class PaletteChangedEvent extends star.event.Event
{
	private static final long serialVersionUID = 1L;

	public  PaletteChangedEvent(star.event.Raiser raiser, boolean valid)
	{
		super( raiser , valid ) ;
	}
	 
	public  PaletteChangedEvent(star.hydrology.events.PaletteChangedEvent event)
	{
		super( event ) ;
	}
	 
	public  PaletteChangedEvent(star.hydrology.events.PaletteChangedRaiser raiser)
	{
		super( raiser ) ;
	}
	 
	public void raise()
	{
		raiseImpl();
	}
	 
}