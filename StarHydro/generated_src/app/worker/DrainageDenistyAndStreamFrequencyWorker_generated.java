/* Generated by star.annotations.GeneratedClass, all changes will be lost */

package app.worker;

public abstract class DrainageDenistyAndStreamFrequencyWorker_generated extends java.lang.Object implements star.event.EventController, star.event.Listener, star.hydrology.events.DrainageDensityAndStreamFrequencyRaiser
{
	private star.event.Adapter adapter;
	private float drainageDensity;
	private float[] orderArea;
	private int[] orderCount;
	private float[] orderLength;
	private static final long serialVersionUID = 1L;
	private float streamFrequency;

	public  DrainageDenistyAndStreamFrequencyWorker_generated()
	{
		super();
	}
	 
	public void addNotify()
	{
		getAdapter().addHandled(star.hydrology.events.StreamOrderStatisticsEvent.class);
	}
	 
	public void eventRaised(final star.event.Event event)
	{
		eventRaisedHandles(event);
	}
	 
	private void eventRaisedHandles(final star.event.Event event)
	{
		if( event.getClass().getName().equals( "star.hydrology.events.StreamOrderStatisticsEvent" ) && event.isValid() ) 
		{
			(new star.hydrology.events.DrainageDensityAndStreamFrequencyEvent(this,false)).raise();
		 utils.Runner.runOnThread(new Runnable() { public void run() { 
			 long start = System.nanoTime();
			setStats( (star.hydrology.events.StreamOrderStatisticsRaiser)event.getSource());
			 long end = System.nanoTime();
			 if( end - start > 500000000 ) { System.out.println( this.getClass().getName() + ".setStats "  + ( end-start )/1000000 ); } }},this,2);
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
	 
	public float getDrainageDensity()
	{
		return this.drainageDensity ;
	}
	 
	protected float getOrderArea(int i)
	{
		return this.orderArea[i] ;
	}
	 
	protected float[] getOrderArea()
	{
		return this.orderArea ;
	}
	 
	protected int getOrderCount(int i)
	{
		return this.orderCount[i] ;
	}
	 
	protected int[] getOrderCount()
	{
		return this.orderCount ;
	}
	 
	protected float getOrderLength(int i)
	{
		return this.orderLength[i] ;
	}
	 
	protected float[] getOrderLength()
	{
		return this.orderLength ;
	}
	 
	public float getStreamFrequency()
	{
		return this.streamFrequency ;
	}
	 
	public void raise_DrainageDensityAndStreamFrequencyEvent()
	{
		(new star.hydrology.events.DrainageDensityAndStreamFrequencyEvent(this)).raise();
	}
	 
	public void removeNotify()
	{
		getAdapter().removeHandled(star.hydrology.events.StreamOrderStatisticsEvent.class);
	}
	 
	protected void setDrainageDensity(float drainageDensity)
	{
		this.drainageDensity = drainageDensity ;
	}
	 
	protected void setOrderArea(float[] orderArea)
	{
		this.orderArea = orderArea ;
	}
	 
	protected void setOrderCount(int[] orderCount)
	{
		this.orderCount = orderCount ;
	}
	 
	protected void setOrderLength(float[] orderLength)
	{
		this.orderLength = orderLength ;
	}
	 
	abstract void setStats(star.hydrology.events.StreamOrderStatisticsRaiser r);
	 
	protected void setStreamFrequency(float streamFrequency)
	{
		this.streamFrequency = streamFrequency ;
	}
	 
}