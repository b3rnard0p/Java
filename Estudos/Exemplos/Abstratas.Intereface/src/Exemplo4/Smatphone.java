package Exemplo4;

public class Smatphone implements Celular, PC {
   String tel;
   String email;
   
   public Smatphone(String tel, String email) {
		this.tel = tel;
		this.email = email;
	}
   
   public void verificaEmail() {
	System.out.println("Verificando E-emails");
   }
  
   public void realizarChamada() {
	   System.out.println("Realizando chamada");
   }
   
   
}
