/* Generated by star.annotations.GeneratedClass, all changes will be lost */

package star.hydro.rainfall;

public abstract class Convolute_generated extends java.lang.Object implements star.event.EventController, star.event.Listener, star.hydro.rainfall.ConvolutedTimeSeriesRaiser
{
	private star.event.Adapter adapter;
	private static final long serialVersionUID = 1L;

	public  Convolute_generated()
	{
		super();
	}
	 
	public void addNotify()
	{
		getAdapter().addHandled(star.hydrology.events.PaletteChangedEvent.class);
		getAdapter().addHandled(star.hydrology.events.RainfallGaugesTimeseriesEvent.class);
		getAdapter().addHandled(star.hydro.rainfall.TimeSeriesEvent.class);
		getAdapter().addHandled(star.hydrology.events.IUHEvent.class);
	}
	 
	public void eventRaised(final star.event.Event event)
	{
		eventRaisedHandles(event);
	}
	 
	private void eventRaisedHandles(final star.event.Event event)
	{
		if( event.getClass().getName().equals( "star.hydrology.events.PaletteChangedEvent" ) && event.isValid() ) 
		{
			 utils.Runner.runOnThread(new Runnable() { public void run() { 
			 long start = System.nanoTime();
			updatePalette( (star.hydrology.events.PaletteChangedRaiser)event.getSource());
			 long end = System.nanoTime();
			 if( end - start > 500000000 ) { System.out.println( this.getClass().getName() + ".updatePalette "  + ( end-start )/1000000 ); } }},this,2);
		}if( event.getClass().getName().equals( "star.hydrology.events.RainfallGaugesTimeseriesEvent" ) && event.isValid() ) 
		{
			(new star.hydro.rainfall.ConvolutedTimeSeriesEvent(this,false)).raise();
		 utils.Runner.runOnThread(new Runnable() { public void run() { 
			 long start = System.nanoTime();
			handleTimeSeries( (star.hydrology.events.RainfallGaugesTimeseriesRaiser)event.getSource());
			 long end = System.nanoTime();
			 if( end - start > 500000000 ) { System.out.println( this.getClass().getName() + ".handleTimeSeries "  + ( end-start )/1000000 ); } }},this,2);
		}if( event.getClass().getName().equals( "star.hydro.rainfall.TimeSeriesEvent" ) && event.isValid() ) 
		{
			(new star.hydro.rainfall.ConvolutedTimeSeriesEvent(this,false)).raise();
		 utils.Runner.runOnThread(new Runnable() { public void run() { 
			 long start = System.nanoTime();
			handleTimeSeries( (star.hydro.rainfall.TimeSeriesRaiser)event.getSource());
			 long end = System.nanoTime();
			 if( end - start > 500000000 ) { System.out.println( this.getClass().getName() + ".handleTimeSeries "  + ( end-start )/1000000 ); } }},this,2);
		}if( event.getClass().getName().equals( "star.hydrology.events.IUHEvent" ) && event.isValid() ) 
		{
			(new star.hydro.rainfall.ConvolutedTimeSeriesEvent(this,false)).raise();
		 utils.Runner.runOnThread(new Runnable() { public void run() { 
			 long start = System.nanoTime();
			handleTimeSeries( (star.hydrology.events.IUHRaiser)event.getSource());
			 long end = System.nanoTime();
			 if( end - start > 500000000 ) { System.out.println( this.getClass().getName() + ".handleTimeSeries "  + ( end-start )/1000000 ); } }},this,2);
		}
	}
	 
	public star.event.Adapter getAdapter()
	{
		if( adapter == null )
		{
			adapter = new star.event.Adapter(this);
		}
		return adapter;
	}
	 
	abstract void handleTimeSeries(star.hydro.rainfall.TimeSeriesRaiser ts);
	 
	abstract void handleTimeSeries(star.hydrology.events.IUHRaiser iuh);
	 
	abstract void handleTimeSeries(star.hydrology.events.RainfallGaugesTimeseriesRaiser rts);
	 
	public void raise_ConvolutedTimeSeriesEvent()
	{
		(new star.hydro.rainfall.ConvolutedTimeSeriesEvent(this)).raise();
	}
	 
	public void removeNotify()
	{
		getAdapter().removeHandled(star.hydrology.events.PaletteChangedEvent.class);
		getAdapter().removeHandled(star.hydrology.events.RainfallGaugesTimeseriesEvent.class);
		getAdapter().removeHandled(star.hydro.rainfall.TimeSeriesEvent.class);
		getAdapter().removeHandled(star.hydrology.events.IUHEvent.class);
	}
	 
	abstract void updatePalette(star.hydrology.events.PaletteChangedRaiser r);
	 
}