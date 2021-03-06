/* Generated by star.annotations.GeneratedClass, all changes will be lost */

package star.hydrology.ui.chart.pdf;

public abstract class ElevationPDFChart_generated extends star.hydrology.ui.chart.AbstractChart implements star.event.EventController, star.event.Listener
{
	private star.event.Adapter adapter;
	private static final long serialVersionUID = 1L;

	public  ElevationPDFChart_generated()
	{
		super();
	}
	 
	public void addNotify()
	{
		super.addNotify();
		getAdapter().addHandled(star.hydrology.events.ElevationPDFEvent.class);
		getAdapter().addHandled(star.hydrology.events.regionalization.RegElevationPDFEvent.class);
	}
	 
	public void eventRaised(final star.event.Event event)
	{
		eventRaisedHandles(event);
	}
	 
	private void eventRaisedHandles(final star.event.Event event)
	{
		if( event.getClass().getName().equals( "star.hydrology.events.ElevationPDFEvent" ) && !event.isValid() ) 
		{
			 utils.Runner.runOnThread(new Runnable() { public void run() { 
			 long start = System.nanoTime();
			handleInvalidEvent( (star.hydrology.events.ElevationPDFRaiser)event.getSource());
			 long end = System.nanoTime();
			 if( end - start > 500000000 ) { System.out.println( this.getClass().getName() + ".handleInvalidEvent "  + ( end-start )/1000000 ); } }},this,2);
		}if( event.getClass().getName().equals( "star.hydrology.events.ElevationPDFEvent" ) && event.isValid() ) 
		{
			 utils.Runner.runOnThread(new Runnable() { public void run() { 
			 long start = System.nanoTime();
			handleEvent( (star.hydrology.events.ElevationPDFRaiser)event.getSource());
			 long end = System.nanoTime();
			 if( end - start > 500000000 ) { System.out.println( this.getClass().getName() + ".handleEvent "  + ( end-start )/1000000 ); } }},this,2);
		}if( event.getClass().getName().equals( "star.hydrology.events.regionalization.RegElevationPDFEvent" ) && event.isValid() ) 
		{
			 utils.Runner.runOnThread(new Runnable() { public void run() { 
			 long start = System.nanoTime();
			handleEvent( (star.hydrology.events.regionalization.RegElevationPDFRaiser)event.getSource());
			 long end = System.nanoTime();
			 if( end - start > 500000000 ) { System.out.println( this.getClass().getName() + ".handleEvent "  + ( end-start )/1000000 ); } }},this,2);
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
	 
	abstract void handleEvent(star.hydrology.events.ElevationPDFRaiser r);
	 
	abstract void handleEvent(star.hydrology.events.regionalization.RegElevationPDFRaiser r);
	 
	abstract void handleInvalidEvent(star.hydrology.events.ElevationPDFRaiser raiser);
	 
	public void removeNotify()
	{
		super.removeNotify();
		getAdapter().removeHandled(star.hydrology.events.ElevationPDFEvent.class);
		getAdapter().removeHandled(star.hydrology.events.regionalization.RegElevationPDFEvent.class);
	}
	 
}