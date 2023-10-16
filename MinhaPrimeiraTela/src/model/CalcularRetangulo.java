package model;

public class CalcularRetangulo {

	public float CalcularPerimetro(float base, float altura)
	{
		float perimetro;
		perimetro=2*(altura+base);
		return perimetro;
	}
	public float CalcularArea(float base, float altura)
	{
		float area;
		area= base*altura;
		return area;
	}
}
