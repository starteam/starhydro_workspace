/* Generated by star.annotations.GeneratedClass, all changes will be lost */

package app.worker.pdf.reg;

public abstract class RegionalizationChannelMapGenerator_generated extends java.lang.Object implements star.event.EventController, star.event.Listener, star.hydrology.events.map.RegionalizeWorkerDiscreteColorMapLayerRaiser
{
	private star.event.Adapter adapter;
	private static final long serialVersionUID = 1L;

	public  RegionalizationChannelMapGenerator_generated()
	{
		super();
	}
	 
	public void addNotify()
	{
		getAdapter().addHandled(star.hydrology.events.map.RegionalizeWorkerMapLayerEvent.class);
	}
	 
	abstract void discretisizeLayer(star.hydrology.events.map.RegionalizeWorkerMapLayerRaiser r);
	 
	public void eventRaised(final star.event.Event event)
	{
		eventRaisedHandles(event);
	}
	 
	private void eventRaisedHandles(final star.event.Event event)
	{
		if( event.getClass().getName().equals( "star.hydrology.events.map.RegionalizeWorkerMapLayerEvent" ) && event.isValid() ) 
		{
			(new star.hydrology.events.map.RegionalizeWorkerDiscreteColorMapLayerEvent(this,false)).raise();
		 utils.Runner.runOnThread(new Runnable() { public void run() { 
			 long start = System.nanoTime();
			discretisizeLayer( (star.hydrology.events.map.RegionalizeWorkerMapLayerRaiser)event.getSource());
			 long end = System.nanoTime();
			 if( end - start > 500000000 ) { System.out.println( this.getClass().getName() + ".discretisizeLayer "  + ( end-start )/1000000 ); } }},this,2);
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
	 
	public void raise_RegionalizeWorkerDiscreteColorMapLayerEvent()
	{
		(new star.hydrology.events.map.RegionalizeWorkerDiscreteColorMapLayerEvent(this)).raise();
	}
	 
	public void removeNotify()
	{
		getAdapter().removeHandled(star.hydrology.events.map.RegionalizeWorkerMapLayerEvent.class);
	}
	 
}