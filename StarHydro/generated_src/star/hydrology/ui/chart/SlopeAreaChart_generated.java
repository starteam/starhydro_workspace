/* Generated by star.annotations.GeneratedClass, all changes will be lost */

package star.hydrology.ui.chart;

public abstract class SlopeAreaChart_generated extends star.hydrology.ui.chart.AbstractChart implements star.event.EventController, star.event.Listener
{
	private star.event.Adapter adapter;
	private static final long serialVersionUID = 1L;

	public  SlopeAreaChart_generated()
	{
		super();
	}
	 
	public void addNotify()
	{
		super.addNotify();
		getAdapter().addHandled(star.hydrology.events.SlopeAreaEvent.class);
	}
	 
	public void eventRaised(final star.event.Event event)
	{
		eventRaisedHandles(event);
	}
	 
	private void eventRaisedHandles(final star.event.Event event)
	{
		if( event.getClass().getName().equals( "star.hydrology.events.SlopeAreaEvent" ) && event.isValid() ) 
		{
			 utils.Runner.runOnThread(new Runnable() { public void run() { 
			 long start = System.nanoTime();
			handleRainfall( (star.hydrology.events.SlopeAreaRaiser)event.getSource());
			 long end = System.nanoTime();
			 if( end - start > 500000000 ) { System.out.println( this.getClass().getName() + ".handleRainfall "  + ( end-start )/1000000 ); } }},this,2);
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
	 
	abstract void handleRainfall(star.hydrology.events.SlopeAreaRaiser r);
	 
	public void removeNotify()
	{
		super.removeNotify();
		getAdapter().removeHandled(star.hydrology.events.SlopeAreaEvent.class);
	}
	 
}