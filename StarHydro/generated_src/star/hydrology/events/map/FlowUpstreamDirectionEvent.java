/* Generated by star.annotations.GeneratedClass, all changes will be lost */

package star.hydrology.events.map;

public class FlowUpstreamDirectionEvent extends star.hydrology.events.map.MapLayerEvent
{
	private static final long serialVersionUID = 1L;

	public  FlowUpstreamDirectionEvent(star.event.Raiser raiser, boolean valid)
	{
		super( raiser , valid ) ;
	}
	 
	public  FlowUpstreamDirectionEvent(star.hydrology.events.map.FlowUpstreamDirectionEvent event)
	{
		super( event ) ;
	}
	 
	public  FlowUpstreamDirectionEvent(star.hydrology.events.map.FlowUpstreamDirectionRaiser raiser)
	{
		super( raiser ) ;
	}
	 
	public void raise()
	{
		raiseImpl();
	}
	 
}