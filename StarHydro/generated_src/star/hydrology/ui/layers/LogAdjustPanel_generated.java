/* Generated by star.annotations.GeneratedClass, all changes will be lost */

package star.hydrology.ui.layers;

public abstract class LogAdjustPanel_generated extends mit.swing.xJPanel implements star.event.EventController, star.event.Listener, star.hydrology.events.GridStatisticsProviderChangeRaiser
{
	private static final long serialVersionUID = 1L;

	public  LogAdjustPanel_generated()
	{
		super();
	}
	 
	public void addNotify()
	{
		super.addNotify();
		getAdapter().addExcludeExternal(mit.swing.event.ChangeEvent.class );
		getAdapter().addHandled(mit.swing.event.ChangeEvent.class);
		getAdapter().addHandled(star.hydrology.events.AdjustableValueEvent.class);
	}
	 
	public void eventRaised(final star.event.Event event)
	{
		eventRaisedHandles(event);
	}
	 
	private void eventRaisedHandles(final star.event.Event event)
	{
		if( event.getClass().getName().equals( "mit.swing.event.ChangeEvent" ) && event.isValid() ) 
		{
			(new star.hydrology.events.GridStatisticsProviderChangeEvent(this,false)).raise();
		 utils.Runner.runOnThread(new Runnable() { public void run() { 
			 long start = System.nanoTime();
			handleEvent( (mit.swing.event.ChangeRaiser)event.getSource());
			 long end = System.nanoTime();
			 if( end - start > 500000000 ) { System.out.println( this.getClass().getName() + ".handleEvent "  + ( end-start )/1000000 ); } }},this,2);
		}if( event.getClass().getName().equals( "star.hydrology.events.AdjustableValueEvent" ) && event.isValid() ) 
		{
			 utils.Runner.runOnThread(new Runnable() { public void run() { 
			 long start = System.nanoTime();
			handleEvent( (star.hydrology.events.AdjustableValueRaiser)event.getSource());
			 long end = System.nanoTime();
			 if( end - start > 500000000 ) { System.out.println( this.getClass().getName() + ".handleEvent "  + ( end-start )/1000000 ); } }},this,2);
		}
	}
	 
	abstract void handleEvent(mit.swing.event.ChangeRaiser raiser);
	 
	abstract void handleEvent(star.hydrology.events.AdjustableValueRaiser raiser);
	 
	public void raise_GridStatisticsProviderChangeEvent()
	{
		(new star.hydrology.events.GridStatisticsProviderChangeEvent(this)).raise();
	}
	 
	public void removeNotify()
	{
		super.removeNotify();
		getAdapter().removeExcludeExternal(mit.swing.event.ChangeEvent.class );
		getAdapter().removeHandled(mit.swing.event.ChangeEvent.class);
		getAdapter().removeHandled(star.hydrology.events.AdjustableValueEvent.class);
	}
	 
}