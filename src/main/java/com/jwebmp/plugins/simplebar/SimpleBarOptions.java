package com.jwebmp.plugins.simplebar;

import com.jwebmp.core.htmlbuilder.javascript.*;

public class SimpleBarOptions extends JavaScriptPart<SimpleBarOptions>
{
	private Boolean autoHide;
	private Boolean forceVisible;
	
	public Boolean getAutoHide()
	{
		return autoHide;
	}
	
	public SimpleBarOptions setAutoHide(Boolean autoHide)
	{
		this.autoHide = autoHide;
		return this;
	}
	
	public Boolean getForceVisible()
	{
		return forceVisible;
	}
	
	public SimpleBarOptions setForceVisible(Boolean forceVisible)
	{
		this.forceVisible = forceVisible;
		return this;
	}
}
