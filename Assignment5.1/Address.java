
public class Address {

	private String[] addressList;
	private int count;
	
	public Address()
	{
		addressList=new String[3];
	}
	
	public void setAddress(String a, int index)
	{
		if (index<3) {
			addressList[index]=a;
			count++;
		}
		else System.out.println("Only three addresses allowed to be stored.");
	}
	
	public String[]  getAddress()
	{
		return addressList;
		
	}
	
	public String toString()
	{
		String s="";
		for (int i=0;i<3;i++)
		{
			s=s+addressList[i]+ "\n";
		}
		return s;
	}
	
	
}
