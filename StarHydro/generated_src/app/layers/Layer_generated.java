/* Generated by star.annotations.GeneratedClass, all changes will be lost */

package app.layers;

public abstract class Layer_generated extends java.lang.Object implements star.event.EventController, star.event.Listener, star.hydrology.events.PaletteChangedRaiser, star.hydrology.events.VisibilityChangedRaiser
{
	private star.event.Adapter adapter;
	private java.util.prefs.Preferences preferences = null;
	private static final long serialVersionUID = 1L;

	public  Layer_generated()
	{
		super();
	}
	 
	public void addNotify()
	{
		getAdapter().addHandled(star.hydrology.events.PaletteChangedEvent.class);
		getAdapter().addHandled(star.hydrology.events.ViewerChangeEvent.class);
		getAdapter().addHandled(star.hydrology.events.VisibilityChangedEvent.class);
	}
	 
	public void eventRaised(final star.event.Event event)
	{
		eventRaisedHandles(event);
	}
	 
	private void eventRaisedHandles(final star.event.Event event)
	{
		if( event.getClass().getName().equals( "star.hydrology.events.PaletteChangedEvent" ) && event.isValid() ) 
		{
			 utils.Runner.runOnThread(new Runnable() { public void run() { 
			 long start = System.nanoTime();
			updatePalette( (star.hydrology.events.PaletteChangedRaiser)event.getSource());
			 long end = System.nanoTime();
			 if( end - start > 500000000 ) { System.out.println( this.getClass().getName() + ".updatePalette "  + ( end-start )/1000000 ); } }},this,2);
		}if( event.getClass().getName().equals( "star.hydrology.events.ViewerChangeEvent" ) && event.isValid() ) 
		{
			 utils.Runner.runOnThread(new Runnable() { public void run() { 
			 long start = System.nanoTime();
			updateMapLayer( (star.hydrology.events.ViewerChangeRaiser)event.getSource());
			 long end = System.nanoTime();
			 if( end - start > 500000000 ) { System.out.println( this.getClass().getName() + ".updateMapLayer "  + ( end-start )/1000000 ); } }},this,2);
		}if( event.getClass().getName().equals( "star.hydrology.events.VisibilityChangedEvent" ) && event.isValid() ) 
		{
			 utils.Runner.runOnThread(new Runnable() { public void run() { 
			 long start = System.nanoTime();
			updateVisibility( (star.hydrology.events.VisibilityChangedRaiser)event.getSource());
			 long end = System.nanoTime();
			 if( end - start > 500000000 ) { System.out.println( this.getClass().getName() + ".updateVisibility "  + ( end-start )/1000000 ); } }},this,2);
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
	 
	public java.util.prefs.Preferences getPreferences(java.lang.String name)
	{
		try
		{
			plugin.preferences.Preferences pref = (plugin.preferences.Preferences) plugin.Loader.getDefaultLoader().getPlugin(plugin.preferences.Preferences.class.getName(), plugin.preferences.PreferencesImplementation.class.getName());
			this.preferences = pref.getPreferences(name);
		}
		catch( plugin.PluginException ex )
		{
			ex.printStackTrace();
		}
		return preferences;
	}
	 
	public java.util.prefs.Preferences getPreferences()
	{
		if( preferences == null )
		{
			try
			{
				plugin.preferences.Preferences pref = (plugin.preferences.Preferences) plugin.Loader.getDefaultLoader().getPlugin(plugin.preferences.Preferences.class.getName(), plugin.preferences.PreferencesImplementation.class.getName());
				this.preferences = pref.getPreferences("app.layers.Layer");
			}
			catch( plugin.PluginException ex )
			{
				ex.printStackTrace();
			}
		}
		return preferences;
	}
	 
	public void raise_PaletteChangedEvent()
	{
		(new star.hydrology.events.PaletteChangedEvent(this)).raise();
	}
	 
	public void raise_VisibilityChangedEvent()
	{
		(new star.hydrology.events.VisibilityChangedEvent(this)).raise();
	}
	 
	public void removeNotify()
	{
		getAdapter().removeHandled(star.hydrology.events.PaletteChangedEvent.class);
		getAdapter().removeHandled(star.hydrology.events.ViewerChangeEvent.class);
		getAdapter().removeHandled(star.hydrology.events.VisibilityChangedEvent.class);
	}
	 
	abstract void updateMapLayer(star.hydrology.events.ViewerChangeRaiser r);
	 
	abstract void updatePalette(star.hydrology.events.PaletteChangedRaiser r);
	 
	abstract void updateVisibility(star.hydrology.events.VisibilityChangedRaiser r);
	 
}