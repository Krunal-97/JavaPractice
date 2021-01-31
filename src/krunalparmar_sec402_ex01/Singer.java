package krunalparmar_sec402_ex01;

public class Singer
{
	// instance variables that would store singer's data
	private int singerId;
	private String singerName;
	private String singerAddress;
	private String singerDateOfBirth;
	private int singerNumberOfAlbumsPublished;
	
	// default constructor
	public Singer() 
	{

	}
	
	// overloaded constructor with 1 parameter
	public Singer(int singerId) 
	{
		this.singerId = singerId;
	}
	
	// overloaded constructor with 2 parameters
	public Singer(int singerId, String singerName) 
	{
		this.singerId = singerId;
		this.singerName = singerName;
	}
	
	// overloaded constructor with 3 parameters
	public Singer(int singerId, String singerName, String singerAddress) 
	{
		this.singerId = singerId;
		this.singerName = singerName;
		this.singerAddress = singerAddress;
	}
	
	// overloaded constructor with 4 parameters
	public Singer(int singerId, String singerName, String singerAddress, String singerDateOfBirth) 
	{
		this.singerId = singerId;
		this.singerName = singerName;
		this.singerAddress = singerAddress;
		this.singerDateOfBirth = singerDateOfBirth;
	}
	
	// overloaded constructor with 5 parameters
	public Singer(int singerId, String singerName, String singerAddress, String singerDateOfBirth, int singerNumberOfAlbumsPublished) 
	{
		this.singerId = singerId;
		this.singerName = singerName;
		this.singerAddress = singerAddress;
		this.singerDateOfBirth = singerDateOfBirth;
		this.singerNumberOfAlbumsPublished = singerNumberOfAlbumsPublished;
	}
	
	// several setters that would allow to set the values of individual instance variables of the object
	public void setSingerId(int newSingerId) 
	{
		this.singerId = newSingerId;
	}
	
	public void setSingerName(String newSingerName) 
	{
		this.singerName = newSingerName;
	}
	
	public void setSingerAddress(String newSingerAddress) 
	{
		this.singerAddress = newSingerAddress;
	}
	
	public void setSingerDateOfBirth(String newSingerDateOfBirth) 
	{
		this.singerDateOfBirth = newSingerDateOfBirth;
	}
	
	public void setSingerNumberOfAlbumsPublished(int newSingerNumberOfAlbumsPublished) 
	{
		this.singerNumberOfAlbumsPublished = newSingerNumberOfAlbumsPublished;
	}
	
	// setter that would allow to set all the values of the instance variables at once
	public void setSinger(int singerId, String singerName, String singerAddress, String singerDateOfBirth, int singerNumberOfAlbumsPublished)
	{
		this.singerId = singerId;
		this.singerName = singerName;
		this.singerAddress = singerAddress;
		this.singerDateOfBirth = singerDateOfBirth;
		this.singerNumberOfAlbumsPublished = singerNumberOfAlbumsPublished;
	}
	
	// several getters that would allow to get the current individual values of each instance variables of the object. 
	public int getSingerId() 
	{
		return singerId;
	}
	
	public String getSingerName() 
	{
		return singerName;
	}
	
	public String getSingerAddress() 
	{
		return singerAddress;
	}
	
	public String getSingerDateOfBirth() 
	{
		return singerDateOfBirth;
	}
	
	public int getSingerNumberOfAlbumsPublished() 
	{
		return singerNumberOfAlbumsPublished;
	}	
}
