/* Generated by star.annotations.GeneratedClass, all changes will be lost */

package star.hydrology.events.map;

public class FlowdirectionMapLayerEvent extends star.hydrology.events.map.MapLayerEvent
{
	private static final long serialVersionUID = 1L;

	public  FlowdirectionMapLayerEvent(star.event.Raiser raiser, boolean valid)
	{
		super( raiser , valid ) ;
	}
	 
	public  FlowdirectionMapLayerEvent(star.hydrology.events.map.FlowdirectionMapLayerEvent event)
	{
		super( event ) ;
	}
	 
	public  FlowdirectionMapLayerEvent(star.hydrology.events.map.FlowdirectionMapLayerRaiser raiser)
	{
		super( raiser ) ;
	}
	 
	public void raise()
	{
		raiseImpl();
	}
	 
}