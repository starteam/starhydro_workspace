/* Generated by star.annotations.GeneratedClass, all changes will be lost */

package star.hydrology.events.map;

public class RegionalizeWorkerDiscreteColorMapLayerEvent extends star.hydrology.events.map.MapLayerEvent
{
	private static final long serialVersionUID = 1L;

	public  RegionalizeWorkerDiscreteColorMapLayerEvent(star.event.Raiser raiser, boolean valid)
	{
		super( raiser , valid ) ;
	}
	 
	public  RegionalizeWorkerDiscreteColorMapLayerEvent(star.hydrology.events.map.RegionalizeWorkerDiscreteColorMapLayerEvent event)
	{
		super( event ) ;
	}
	 
	public  RegionalizeWorkerDiscreteColorMapLayerEvent(star.hydrology.events.map.RegionalizeWorkerDiscreteColorMapLayerRaiser raiser)
	{
		super( raiser ) ;
	}
	 
	public void raise()
	{
		raiseImpl();
	}
	 
}