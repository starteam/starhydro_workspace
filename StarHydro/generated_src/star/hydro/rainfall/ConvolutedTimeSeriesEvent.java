/* Generated by star.annotations.GeneratedClass, all changes will be lost */

package star.hydro.rainfall;

public class ConvolutedTimeSeriesEvent extends star.event.Event
{
	private static final long serialVersionUID = 1L;

	public  ConvolutedTimeSeriesEvent(star.event.Raiser raiser, boolean valid)
	{
		super( raiser , valid ) ;
	}
	 
	public  ConvolutedTimeSeriesEvent(star.hydro.rainfall.ConvolutedTimeSeriesEvent event)
	{
		super( event ) ;
	}
	 
	public  ConvolutedTimeSeriesEvent(star.hydro.rainfall.ConvolutedTimeSeriesRaiser raiser)
	{
		super( raiser ) ;
	}
	 
	public void raise()
	{
		raiseImpl();
	}
	 
}