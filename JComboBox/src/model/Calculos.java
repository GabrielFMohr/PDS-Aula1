package model;

public class Calculos {
	public float vDiesel,vComum,vAditiv,vEtanool,v500ml,v1L,q500ml,q1L,t500ml,t1L,tComb,tOleo;
	public String TT;
	
	public String Diesel(float qL)
	{
		String vTotal=String.valueOf(vDiesel*qL);
		tComb=Float.valueOf(vTotal);
		return vTotal;
	}
	public String Comum(float qL)
	{
		String vTotal=String.valueOf(vComum*qL);
		tComb=Float.valueOf(vTotal);
		return vTotal;
	}
	public String Aditiv(Float qL)
	{
		String vTotal=String.valueOf(vAditiv*qL);
		tComb=Float.valueOf(vTotal);
		return vTotal;
	}
	public String Etanol(float qL)
	{
		String vTotal=String.valueOf(vEtanool*qL);
		tComb=Float.valueOf(vTotal);
		return vTotal;
	}
	public String c500ml()
	{
		String vTotal=String.valueOf(q500ml*v500ml);
		t500ml=Float.valueOf(vTotal);
		return vTotal;
	}
	public String c1L()
	{
		String vTotal=String.valueOf(q1L*v1L);
		t1L= Float.valueOf(vTotal);
		return vTotal;
	}
	public String totalOleo()
	{
		String vTotal=String.valueOf(t500ml+t1L);
		tOleo=Float.valueOf(vTotal);
		return vTotal;
	}
	public String TotalpagarVista()
	{
		String total=String.valueOf((tComb+tOleo)-((tComb+tOleo)*0.10));
		TT=total;
		return total;
	}
	public String totalPagarPrazo()
	{
		
		String total=String.valueOf((tComb+tOleo));
		return total;
	}
	public String totalPagarPrazo30()
	{
		String total=String.valueOf((tComb+tOleo)+((tComb+tOleo)*0.10));
		return total;
	}
}
