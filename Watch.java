class Watch
{
	String countryMade;
	Types watchType=Types.Smart;
	Watch()
	{
		System.out.println("no argument Constructor");
	}

	Watch(String countryMade, Types watchType)
	{
		this.countryMade=countryMade;
		this.watchType=watchType;
	}

	void displayDetails()
	{ 
		System.out.println("CountryMade:"+countryMade);
		System.out.println("Watchtype:"+watchType);
	}	
} 