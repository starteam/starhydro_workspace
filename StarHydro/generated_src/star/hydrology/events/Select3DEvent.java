/* Generated by star.annotations.GeneratedClass, all changes will be lost */

package star.hydrology.events;

public class Select3DEvent extends star.event.Event
{
	private static final long serialVersionUID = 1L;

	public  Select3DEvent(star.event.Raiser raiser, boolean valid)
	{
		super( raiser , valid ) ;
	}
	 
	public  Select3DEvent(star.hydrology.events.Select3DEvent event)
	{
		super( event ) ;
	}
	 
	public  Select3DEvent(star.hydrology.events.Select3DRaiser raiser)
	{
		super( raiser ) ;
	}
	 
	public void raise()
	{
		raiseImpl();
	}
	 
}