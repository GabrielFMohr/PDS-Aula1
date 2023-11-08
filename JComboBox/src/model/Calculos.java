package model;

public class Calculos {
	public float vDiesel,vComum,vAditiv,vEtanool,v500ml,v1L,q500ml,q1L;
	
	public String Diesel(float qL)
	{
		String vTotal=String.valueOf(vDiesel*qL);
		return vTotal;
	}
	public String Comum(float qL)
	{
		String vTotal=String.valueOf(vComum*qL);
		return vTotal;
	}
	public String Aditiv(Float qL)
	{
		String vTotal=String.valueOf(vAditiv*qL);
		return vTotal;
	}
	public String Etanol(float qL)
	{
		String vTotal=String.valueOf(vEtanool*qL);
		return vTotal;
	}
	public String c500ml()
	{
		String vTotal=String.valueOf(q500ml*v500ml);
		return vTotal;
	}
	public String c1L()
	{
		String vTotal=String.valueOf(q1L*v1L);
		return vTotal;
	}
}
