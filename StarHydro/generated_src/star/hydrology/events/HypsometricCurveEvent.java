/* Generated by star.annotations.GeneratedClass, all changes will be lost */

package star.hydrology.events;

public class HypsometricCurveEvent extends star.event.Event
{
	private static final long serialVersionUID = 1L;

	public  HypsometricCurveEvent(star.event.Raiser raiser, boolean valid)
	{
		super( raiser , valid ) ;
	}
	 
	public  HypsometricCurveEvent(star.hydrology.events.HypsometricCurveEvent event)
	{
		super( event ) ;
	}
	 
	public  HypsometricCurveEvent(star.hydrology.events.HypsometricCurveRaiser raiser)
	{
		super( raiser ) ;
	}
	 
	public void raise()
	{
		raiseImpl();
	}
	 
}