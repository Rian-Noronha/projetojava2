package projetojava2;

public class ObjGarrafa {

	public static void main(String[] args) {
		
		Garrafa garrafa = new Garrafa("vermelha", "1000ml", "GarrafaPET", 25);
		
		System.out.println("Nome da garrafa -> " + garrafa.getNome());
		
		Garrafa garrafa1 = new Garrafa("amarela", "300ml", "Garrafa_Minions", 12.4);
		
		System.out.println("Nome garrafa -> " + garrafa1.getNome());
		
		

	}

}
