package org.arca.textsblocks;

public class TestTextBlocks {
	
	public static void main(String[] args) {
		String txt1 = "Ola meu irmao \n Este é um momemento \n Java";
		
		System.out.println("Com barra n"+txt1);
		
		String txt2 = """
						Ola meu irmao 
						Este é um momemento
						Java
						""";
		System.out.println("Com bloco: "+ txt2);

	}

}
