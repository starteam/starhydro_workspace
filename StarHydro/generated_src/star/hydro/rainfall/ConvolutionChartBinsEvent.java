/* Generated by star.annotations.GeneratedClass, all changes will be lost */

package star.hydro.rainfall;

public class ConvolutionChartBinsEvent extends star.event.Event
{
	private static final long serialVersionUID = 1L;

	public  ConvolutionChartBinsEvent(star.event.Raiser raiser, boolean valid)
	{
		super( raiser , valid ) ;
	}
	 
	public  ConvolutionChartBinsEvent(star.hydro.rainfall.ConvolutionChartBinsEvent event)
	{
		super( event ) ;
	}
	 
	public  ConvolutionChartBinsEvent(star.hydro.rainfall.ConvolutionChartBinsRaiser raiser)
	{
		super( raiser ) ;
	}
	 
	public void raise()
	{
		raiseImpl();
	}
	 
}