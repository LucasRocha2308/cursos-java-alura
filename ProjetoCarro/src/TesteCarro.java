
public class TesteCarro {
	public static void main(String[] args) {
		Carro carro = new Carro(2013, "Gol", 35000.00);
		Carro outroCarro = new Carro("Civic", 95000.0);
		
		System.out.println(outroCarro.getAno());
	}
}
