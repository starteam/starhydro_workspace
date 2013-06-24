/* Generated by star.annotations.GeneratedClass, all changes will be lost */

package app;

public abstract class PickerBehaviour_generated extends javax.media.j3d.Behavior implements star.event.EventController, star.event.Listener, star.hydrology.events.Select3DRaiser
{
	private star.event.Adapter adapter;
	private static final long serialVersionUID = 1L;

	public  PickerBehaviour_generated()
	{
		super();
	}
	 
	public void addNotify()
	{
		getAdapter().addHandled(star.hydrology.events.map.FilledMapLayerEvent.class);
		getAdapter().addHandled(star.hydrology.events.Pick3DEvent.class);
	}
	 
	abstract void enablePicking(star.hydrology.events.Pick3DRaiser pick);
	 
	public void eventRaised(final star.event.Event event)
	{
		eventRaisedHandles(event);
	}
	 
	private void eventRaisedHandles(final star.event.Event event)
	{
		if( event.getClass().getName().equals( "star.hydrology.events.map.FilledMapLayerEvent" ) && event.isValid() ) 
		{
			 utils.Runner.runOnThread(new Runnable() { public void run() { 
			 long start = System.nanoTime();
			getCenter( (star.hydrology.events.map.FilledMapLayerRaiser)event.getSource());
			 long end = System.nanoTime();
			 if( end - start > 500000000 ) { System.out.println( this.getClass().getName() + ".getCenter "  + ( end-start )/1000000 ); } }},this,2);
		}if( event.getClass().getName().equals( "star.hydrology.events.map.FilledMapLayerEvent" ) && event.isValid() ) 
		{
			 utils.Runner.runOnThread(new Runnable() { public void run() { 
			 long start = System.nanoTime();
			getTerrain( (star.hydrology.events.map.FilledMapLayerRaiser)event.getSource());
			 long end = System.nanoTime();
			 if( end - start > 500000000 ) { System.out.println( this.getClass().getName() + ".getTerrain "  + ( end-start )/1000000 ); } }},this,2);
		}if( event.getClass().getName().equals( "star.hydrology.events.Pick3DEvent" ) && event.isValid() ) 
		{
			 utils.Runner.runOnThread(new Runnable() { public void run() { 
			 long start = System.nanoTime();
			enablePicking( (star.hydrology.events.Pick3DRaiser)event.getSource());
			 long end = System.nanoTime();
			 if( end - start > 500000000 ) { System.out.println( this.getClass().getName() + ".enablePicking "  + ( end-start )/1000000 ); } }},this,2);
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
	 
	abstract void getCenter(star.hydrology.events.map.FilledMapLayerRaiser r);
	 
	abstract void getTerrain(star.hydrology.events.map.FilledMapLayerRaiser r);
	 
	public void raise_Select3DEvent()
	{
		(new star.hydrology.events.Select3DEvent(this)).raise();
	}
	 
	public void removeNotify()
	{
		getAdapter().removeHandled(star.hydrology.events.map.FilledMapLayerEvent.class);
		getAdapter().removeHandled(star.hydrology.events.Pick3DEvent.class);
	}
	 
}