/* Generated by star.annotations.GeneratedClass, all changes will be lost */

package star.hydrology.events.map;

public class RegionalizeWorkerMapLayerEvent extends star.hydrology.events.map.MapLayerEvent
{
	private static final long serialVersionUID = 1L;

	public  RegionalizeWorkerMapLayerEvent(star.event.Raiser raiser, boolean valid)
	{
		super( raiser , valid ) ;
	}
	 
	public  RegionalizeWorkerMapLayerEvent(star.hydrology.events.map.RegionalizeWorkerMapLayerEvent event)
	{
		super( event ) ;
	}
	 
	public  RegionalizeWorkerMapLayerEvent(star.hydrology.events.map.RegionalizeWorkerMapLayerRaiser raiser)
	{
		super( raiser ) ;
	}
	 
	public void raise()
	{
		raiseImpl();
	}
	 
}