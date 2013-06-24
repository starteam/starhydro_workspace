/* Generated by star.annotations.GeneratedClass, all changes will be lost */

package app.worker.map;

public abstract class FlowAccomulationWorker_generated extends app.worker.AbstractWorker implements star.event.EventController, star.event.GatedListener, star.event.Listener, star.hydrology.events.map.FlowaccumulationMapLayerRaiser
{
	private static final long serialVersionUID = 1L;

	public  FlowAccomulationWorker_generated()
	{
		super();
	}
	 
	public void addNotify()
	{
		super.addNotify();
		getAdapter().addGatedAnd( new Class[]{ star.hydrology.events.map.FilledMapLayerEvent.class,star.hydrology.events.map.FlowdirectionMapLayerEvent.class},new Class[]{ star.hydrology.events.map.FlowaccumulationMapLayerEvent.class},true);
	}
	 
	private void eventAndGateRaisedHandles(final star.event.Event in_event[], final boolean valid)
	{
		final star.event.Event[] event = in_event;
		if( !valid && event[0].getClass().getName().equals( "star.hydrology.events.map.FilledMapLayerEvent" ) && event[1].getClass().getName().equals( "star.hydrology.events.map.FlowdirectionMapLayerEvent" ) &&  true )
		{
			(new star.hydrology.events.map.FlowaccumulationMapLayerEvent(this,false)).raise();
			utils.Runner.runOnThread(new Runnable() { 
			 public void run() { 
			long start = System.nanoTime();invalidate( (star.hydrology.events.map.FilledMapLayerRaiser)event[0].getSource(),(star.hydrology.events.map.FlowdirectionMapLayerRaiser)event[1].getSource() );
			long end = System.nanoTime();
				if( end - start > 500000000 ) { System.out.println( this.getClass().getName() + ".invalidate "  + ( end-start )/1000000 ); } }},this,2);
		}
		if( event != null && valid && event.length == 2 && event[0].getClass().getName().equals( "star.hydrology.events.map.FilledMapLayerEvent" ) && event[1].getClass().getName().equals( "star.hydrology.events.map.FlowdirectionMapLayerEvent" ) &&  true )
		{
			(new star.hydrology.events.map.FlowaccumulationMapLayerEvent(this,false)).raise();
			utils.Runner.runOnThread(new Runnable() { 
				public void run() { 
					long start = System.nanoTime();
					handle( (star.hydrology.events.map.FilledMapLayerRaiser)event[0].getSource(),(star.hydrology.events.map.FlowdirectionMapLayerRaiser)event[1].getSource() );
					long end = System.nanoTime();
				if( end - start > 500000000 ) { System.out.println( this.getClass().getName() + ".handle "  + ( end-start )/1000000 ); } }},this,2);
		}
	}
	 
	public void eventRaised(final star.event.Event event)
	{
		super.eventRaised( event );
	}
	 
	public void eventsRaised(final star.event.Event event[], final boolean valid)
	{
		eventAndGateRaisedHandles(event,valid);
	}
	 
	abstract void handle(star.hydrology.events.map.FilledMapLayerRaiser filledMapRaiser, star.hydrology.events.map.FlowdirectionMapLayerRaiser flowDir);
	 
	abstract void invalidate(star.hydrology.events.map.FilledMapLayerRaiser filledMapRaiser, star.hydrology.events.map.FlowdirectionMapLayerRaiser flowDir);
	 
	public void raise_FlowaccumulationMapLayerEvent()
	{
		(new star.hydrology.events.map.FlowaccumulationMapLayerEvent(this)).raise();
	}
	 
	public void removeNotify()
	{
		super.removeNotify();
		getAdapter().removeGatedAnd( new Class[]{ star.hydrology.events.map.FilledMapLayerEvent.class,star.hydrology.events.map.FlowdirectionMapLayerEvent.class},new Class[]{ star.hydrology.events.map.FlowaccumulationMapLayerEvent.class});
	}
	 
}