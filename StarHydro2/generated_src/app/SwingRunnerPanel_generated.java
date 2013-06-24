/* Generated by star.annotations.GeneratedClass, all changes will be lost */

package app;

public abstract class SwingRunnerPanel_generated extends javax.swing.JPanel implements star.event.EventController, star.event.Listener
{
	private star.event.Adapter adapter;
	private static final long serialVersionUID = 1L;

	public void addNotify()
	{
		super.addNotify();
		getAdapter().addHandled(starhydro.events.BackgroundProcessEvent.class);
	}
	 
	public void eventRaised(final star.event.Event event)
	{
		eventRaisedHandles(event);
	}
	 
	private void eventRaisedHandles(final star.event.Event event)
	{
		if( event.getClass().getName().equals( "starhydro.events.BackgroundProcessEvent" ) && event.isValid() ) 
		{
			 utils.Runner.runOnThread(new Runnable() { public void run() { 
			 long start = System.nanoTime();
			handle( (starhydro.events.BackgroundProcessRaiser)event.getSource());
			 long end = System.nanoTime();
			 if( end - start > 500000000 ) { System.out.println( this.getClass().getName() + ".handle "  + ( end-start )/1000000 ); } }},this,2);
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
	 
	protected abstract void handle(starhydro.events.BackgroundProcessRaiser raiser);
	 
	public void removeNotify()
	{
		super.removeNotify();
		getAdapter().removeHandled(starhydro.events.BackgroundProcessEvent.class);
	}
	 
}