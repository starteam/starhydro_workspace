/* Generated by star.annotations.GeneratedClass, all changes will be lost */

package star.hydrology.events;

public class HortonNumberEvent extends star.event.Event
{
	private static final long serialVersionUID = 1L;

	public  HortonNumberEvent(star.event.Raiser raiser, boolean valid)
	{
		super( raiser , valid ) ;
	}
	 
	public  HortonNumberEvent(star.hydrology.events.HortonNumberEvent event)
	{
		super( event ) ;
	}
	 
	public  HortonNumberEvent(star.hydrology.events.HortonNumberRaiser raiser)
	{
		super( raiser ) ;
	}
	 
	public void raise()
	{
		raiseImpl();
	}
	 
}