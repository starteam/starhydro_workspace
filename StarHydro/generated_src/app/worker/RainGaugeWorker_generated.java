/* Generated by star.annotations.GeneratedClass, all changes will be lost */

package app.worker;

public abstract class RainGaugeWorker_generated extends java.lang.Object implements star.event.EventController, star.event.GatedListener, star.event.Listener, star.hydrology.events.LayerChangedRaiser, star.hydrology.events.RainfallGaugesRaiser, star.hydrology.events.RainfallGaugesTimeseriesRaiser
{
	private star.event.Adapter adapter;
	private star.hydrology.events.interfaces.PaletteRenderableLayer flowAccomulation;
	private star.hydrology.events.interfaces.PaletteRenderableLayer flowDirection;
	private static final long serialVersionUID = 1L;
	private star.hydrology.events.interfaces.PaletteRenderableLayer terrain;

	public  RainGaugeWorker_generated()
	{
		super();
	}
	 
	public void addNotify()
	{
		getAdapter().addHandled(star.hydrology.events.map.FilledMapLayerEvent.class);
		getAdapter().addHandled(star.hydrology.events.Select3DEvent.class);
		getAdapter().addHandled(star.hydrology.events.ApplicableLayerEvent.class);
		getAdapter().addHandled(star.hydrology.events.RainfallGaugesTimeseriesEvent.class);
		getAdapter().addGatedAnd( new Class[]{ star.hydrology.events.map.FilledMapLayerEvent.class,star.hydrology.events.map.FlowaccumulationMapLayerEvent.class,star.hydrology.events.map.FlowdirectionMapLayerEvent.class},new Class[]{},true);
	}
	 
	abstract void createLayer(star.hydrology.events.map.FilledMapLayerRaiser raiser);
	 
	private void eventAndGateRaisedHandles(final star.event.Event in_event[], final boolean valid)
	{
		final star.event.Event[] event = in_event;
		if( event != null && valid && event.length == 3 && event[0].getClass().getName().equals( "star.hydrology.events.map.FilledMapLayerEvent" ) && event[1].getClass().getName().equals( "star.hydrology.events.map.FlowaccumulationMapLayerEvent" ) && event[2].getClass().getName().equals( "star.hydrology.events.map.FlowdirectionMapLayerEvent" ) &&  true )
		{
			
			utils.Runner.runOnThread(new Runnable() { 
				public void run() { 
					long start = System.nanoTime();
					setLayers( (star.hydrology.events.map.FilledMapLayerRaiser)event[0].getSource(),(star.hydrology.events.map.FlowaccumulationMapLayerRaiser)event[1].getSource(),(star.hydrology.events.map.FlowdirectionMapLayerRaiser)event[2].getSource() );
					long end = System.nanoTime();
				if( end - start > 500000000 ) { System.out.println( this.getClass().getName() + ".setLayers "  + ( end-start )/1000000 ); } }},this,2);
		}
	}
	 
	public void eventRaised(final star.event.Event event)
	{
		eventRaisedHandles(event);
	}
	 
	private void eventRaisedHandles(final star.event.Event event)
	{
		if( event.getClass().getName().equals( "star.hydrology.events.map.FilledMapLayerEvent" ) && event.isValid() ) 
		{
			(new star.hydrology.events.LayerChangedEvent(this,false)).raise();
		 utils.Runner.runOnThread(new Runnable() { public void run() { 
			 long start = System.nanoTime();
			createLayer( (star.hydrology.events.map.FilledMapLayerRaiser)event.getSource());
			 long end = System.nanoTime();
			 if( end - start > 500000000 ) { System.out.println( this.getClass().getName() + ".createLayer "  + ( end-start )/1000000 ); } }},this,2);
		}if( event.getClass().getName().equals( "star.hydrology.events.Select3DEvent" ) && event.isValid() ) 
		{
			(new star.hydrology.events.RainfallGaugesEvent(this,false)).raise();
		 utils.Runner.runOnThread(new Runnable() { public void run() { 
			 long start = System.nanoTime();
			findDrainagePoint( (star.hydrology.events.Select3DRaiser)event.getSource());
			 long end = System.nanoTime();
			 if( end - start > 500000000 ) { System.out.println( this.getClass().getName() + ".findDrainagePoint "  + ( end-start )/1000000 ); } }},this,2);
		}if( event.getClass().getName().equals( "star.hydrology.events.ApplicableLayerEvent" ) && event.isValid() ) 
		{
			 utils.Runner.runOnThread(new Runnable() { public void run() { 
			 long start = System.nanoTime();
			findDrainagePoint( (star.hydrology.events.ApplicableLayerRaiser)event.getSource());
			 long end = System.nanoTime();
			 if( end - start > 500000000 ) { System.out.println( this.getClass().getName() + ".findDrainagePoint "  + ( end-start )/1000000 ); } }},this,2);
		}if( event.getClass().getName().equals( "star.hydrology.events.RainfallGaugesTimeseriesEvent" ) && event.isValid() ) 
		{
			 utils.Runner.runOnThread(new Runnable() { public void run() { 
			 long start = System.nanoTime();
			loadTimeseries( (star.hydrology.events.RainfallGaugesTimeseriesRaiser)event.getSource());
			 long end = System.nanoTime();
			 if( end - start > 500000000 ) { System.out.println( this.getClass().getName() + ".loadTimeseries "  + ( end-start )/1000000 ); } }},this,2);
		}
	}
	 
	public void eventsRaised(final star.event.Event event[], final boolean valid)
	{
		eventAndGateRaisedHandles(event,valid);
	}
	 
	abstract void findDrainagePoint(star.hydrology.events.ApplicableLayerRaiser tab);
	 
	abstract void findDrainagePoint(star.hydrology.events.Select3DRaiser r);
	 
	public star.event.Adapter getAdapter()
	{
		if( adapter == null )
		{
			adapter = new star.event.Adapter(this);
		}
		return adapter;
	}
	 
	protected star.hydrology.events.interfaces.PaletteRenderableLayer getFlowAccomulation()
	{
		return this.flowAccomulation ;
	}
	 
	protected star.hydrology.events.interfaces.PaletteRenderableLayer getFlowDirection()
	{
		return this.flowDirection ;
	}
	 
	protected star.hydrology.events.interfaces.PaletteRenderableLayer getTerrain()
	{
		return this.terrain ;
	}
	 
	abstract void loadTimeseries(star.hydrology.events.RainfallGaugesTimeseriesRaiser raiser);
	 
	public void raise_LayerChangedEvent()
	{
		(new star.hydrology.events.LayerChangedEvent(this)).raise();
	}
	 
	public void raise_RainfallGaugesEvent()
	{
		(new star.hydrology.events.RainfallGaugesEvent(this)).raise();
	}
	 
	public void raise_RainfallGaugesTimeseriesEvent()
	{
		(new star.hydrology.events.RainfallGaugesTimeseriesEvent(this)).raise();
	}
	 
	public void removeNotify()
	{
		getAdapter().removeHandled(star.hydrology.events.map.FilledMapLayerEvent.class);
		getAdapter().removeHandled(star.hydrology.events.Select3DEvent.class);
		getAdapter().removeHandled(star.hydrology.events.ApplicableLayerEvent.class);
		getAdapter().removeHandled(star.hydrology.events.RainfallGaugesTimeseriesEvent.class);
		getAdapter().removeGatedAnd( new Class[]{ star.hydrology.events.map.FilledMapLayerEvent.class,star.hydrology.events.map.FlowaccumulationMapLayerEvent.class,star.hydrology.events.map.FlowdirectionMapLayerEvent.class},new Class[]{});
	}
	 
	protected void setFlowAccomulation(star.hydrology.events.interfaces.PaletteRenderableLayer flowAccomulation)
	{
		this.flowAccomulation = flowAccomulation ;
	}
	 
	protected void setFlowDirection(star.hydrology.events.interfaces.PaletteRenderableLayer flowDirection)
	{
		this.flowDirection = flowDirection ;
	}
	 
	abstract void setLayers(star.hydrology.events.map.FilledMapLayerRaiser filled, star.hydrology.events.map.FlowaccumulationMapLayerRaiser flowAcc, star.hydrology.events.map.FlowdirectionMapLayerRaiser flowDir);
	 
	protected void setTerrain(star.hydrology.events.interfaces.PaletteRenderableLayer terrain)
	{
		this.terrain = terrain ;
	}
	 
}