/* Generated by star.annotations.GeneratedClass, all changes will be lost */

package star.hydrology.ui.chart.horton;

public abstract class TrendLine_generated extends javax.swing.JCheckBox implements star.event.EventController, star.event.Listener, star.hydrology.ui.chart.horton.TrendLineRaiser
{
	private star.event.Adapter adapter;
	private static final long serialVersionUID = 1L;

	public  TrendLine_generated()
	{
		super();
	}
	 
	public  TrendLine_generated(java.lang.String string, boolean boolean0)
	{
		super( string,boolean0);
	}
	 
	public  TrendLine_generated(java.lang.String string, javax.swing.Icon icon, boolean boolean0)
	{
		super( string,icon,boolean0);
	}
	 
	public  TrendLine_generated(java.lang.String string, javax.swing.Icon icon)
	{
		super( string,icon);
	}
	 
	public  TrendLine_generated(java.lang.String string)
	{
		super( string);
	}
	 
	public  TrendLine_generated(javax.swing.Action action)
	{
		super( action);
	}
	 
	public  TrendLine_generated(javax.swing.Icon icon, boolean boolean0)
	{
		super( icon,boolean0);
	}
	 
	public  TrendLine_generated(javax.swing.Icon icon)
	{
		super( icon);
	}
	 
	public void addNotify()
	{
		super.addNotify();
		getAdapter().addHandled(star.hydrology.ui.chart.horton.LogScaleEvent.class);
	}
	 
	public void eventRaised(final star.event.Event event)
	{
		eventRaisedHandles(event);
	}
	 
	private void eventRaisedHandles(final star.event.Event event)
	{
		if( event.getClass().getName().equals( "star.hydrology.ui.chart.horton.LogScaleEvent" ) && event.isValid() ) 
		{
			(new star.hydrology.ui.chart.horton.TrendLineEvent(this,false)).raise();
		 utils.Runner.runOnThread(new Runnable() { public void run() { 
			 long start = System.nanoTime();
			handleLogScaleEvent( (star.hydrology.ui.chart.horton.LogScaleRaiser)event.getSource());
			 long end = System.nanoTime();
			 if( end - start > 500000000 ) { System.out.println( this.getClass().getName() + ".handleLogScaleEvent "  + ( end-start )/1000000 ); } }},this,2);
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
	 
	abstract void handleLogScaleEvent(star.hydrology.ui.chart.horton.LogScaleRaiser r);
	 
	public void raise_TrendLineEvent()
	{
		(new star.hydrology.ui.chart.horton.TrendLineEvent(this)).raise();
	}
	 
	public void removeNotify()
	{
		super.removeNotify();
		getAdapter().removeHandled(star.hydrology.ui.chart.horton.LogScaleEvent.class);
	}
	 
}