package com.jwebmp.plugins.simplebar;

import com.jwebmp.core.base.html.*;

public class SimpleBar extends DivSimple<SimpleBar>
{
	private SimpleBarOptions options;
	public SimpleBar()
	{
		setTag("ngx-simplebar");
	}
	
	@Override
	public void init()
	{
		if (options != null)
		{
			addAttribute("options", options.toJson(true));
		}
		super.init();
	}
	
	@Override
	public SimpleBarOptions getOptions()
	{
		return options;
	}
	
	public SimpleBar setOptions(SimpleBarOptions options)
	{
		this.options = options;
		return this;
	}
}
