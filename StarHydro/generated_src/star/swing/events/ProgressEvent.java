/* Generated by star.annotations.GeneratedClass, all changes will be lost */

package star.swing.events;

public class ProgressEvent extends star.event.Event
{
	private static final long serialVersionUID = 1L;

	public  ProgressEvent(star.event.Raiser raiser, boolean valid)
	{
		super( raiser , valid ) ;
	}
	 
	public  ProgressEvent(star.swing.events.ProgressEvent event)
	{
		super( event ) ;
	}
	 
	public  ProgressEvent(star.swing.events.ProgressRaiser raiser)
	{
		super( raiser ) ;
	}
	 
	public void raise()
	{
		raiseImpl();
	}
	 
}