/* Generated by star.annotations.GeneratedClass, all changes will be lost */

package star.hydrology.events;

public class ApplicableLayerEvent extends star.event.Event
{
	private static final long serialVersionUID = 1L;

	public  ApplicableLayerEvent(star.event.Raiser raiser, boolean valid)
	{
		super( raiser , valid ) ;
	}
	 
	public  ApplicableLayerEvent(star.hydrology.events.ApplicableLayerEvent event)
	{
		super( event ) ;
	}
	 
	public  ApplicableLayerEvent(star.hydrology.events.ApplicableLayerRaiser raiser)
	{
		super( raiser ) ;
	}
	 
	public void raise()
	{
		raiseImpl();
	}
	 
}