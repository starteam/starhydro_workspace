/* Generated by star.annotations.GeneratedClass, all changes will be lost */

package star.hydrology.events;

public class ViewerChangeEvent extends star.event.Event
{
	private static final long serialVersionUID = 1L;

	public  ViewerChangeEvent(star.event.Raiser raiser, boolean valid)
	{
		super( raiser , valid ) ;
	}
	 
	public  ViewerChangeEvent(star.hydrology.events.ViewerChangeEvent event)
	{
		super( event ) ;
	}
	 
	public  ViewerChangeEvent(star.hydrology.events.ViewerChangeRaiser raiser)
	{
		super( raiser ) ;
	}
	 
	public void raise()
	{
		raiseImpl();
	}
	 
}