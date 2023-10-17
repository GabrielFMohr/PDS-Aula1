package model;

public class PrecoMarmita {
	public float Calculo(float preco, float peso)
	{
		float precoFinal=(float) ((peso-0.5)*preco);
		
		return precoFinal;
	}

}
