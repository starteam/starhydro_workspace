/* Generated by star.annotations.GeneratedClass, all changes will be lost */

package star.hydrology.events;

public class RenderableVisibleEvent extends star.event.Event
{
	private static final long serialVersionUID = 1L;

	public  RenderableVisibleEvent(star.event.Raiser raiser, boolean valid)
	{
		super( raiser , valid ) ;
	}
	 
	public  RenderableVisibleEvent(star.hydrology.events.RenderableVisibleEvent event)
	{
		super( event ) ;
	}
	 
	public  RenderableVisibleEvent(star.hydrology.events.RenderableVisibleRaiser raiser)
	{
		super( raiser ) ;
	}
	 
	public void raise()
	{
		raiseImpl();
	}
	 
}