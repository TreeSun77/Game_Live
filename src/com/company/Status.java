package com.company;

public enum Status {
	NONE, // status 1
	BORN, // status 2
	LIVE, // status 3
	DIED;  // status 4

	public Status step1 (int around)
	{
		switch (this)
		{
			case NONE : return (around == 3) ? BORN : NONE;
			case LIVE : return  (around <= 1 || around >= 4) ? DIED : LIVE;
			default   : return this;
 		}
	}

	public Status step2()
	{
		switch (this)
		{
			case BORN : return LIVE;
			case DIED : return NONE;
			default   : return this;
		}

	}
}
