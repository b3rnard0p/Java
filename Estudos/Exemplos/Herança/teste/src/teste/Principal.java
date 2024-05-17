package teste;

public class Principal {

	public static void main(String[] args) {
		Onibus o = new Onibus();
		o.setNome("Marcopolo");
		o.setModelo("OF-1519");
		
		o.exibeMsg();
		
		System.out.println("O nome do carro: "+o.getNome());
		System.out.println("Modelo do onibus: "+o.getModelo());
	}

}
