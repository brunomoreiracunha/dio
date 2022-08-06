package basecamp.com.dio.blocos;

public class Main {
	public static void main(String[] args) {
		
		ifFlecha();
		ifSemFlecha();
		ifFerias();
		ifMaior();
		
		switchFerias();
		switchNumero();
		switchSemana();
		
	}
	
	public static void ifFlecha() {
		
		int mes = 9;
		
		if(mes == 1) {
			System.out.println("Janeiro");
		} else { 
			if (mes == 2) {
				System.out.println("Fevereiro");
			} else { 
				if (mes == 3) {
					System.out.println("Março");
				} else {
					if (mes == 4) {
						System.out.println("Abril");
					} else {
						if (mes == 5) {
							System.out.println("Maio");
						} else {
							if (mes == 6) {
								System.out.println("Junho");
							} else {
								if (mes == 7) {
									System.out.println("Julho");
								} else { 
									if (mes == 8) {
										System.out.println("Agosto");
									} else {
										if (mes == 9) {
											System.out.println("Setembro");
										} else {
											if (mes == 10) {
												System.out.println("Outubro");
											} else {
												if (mes == 11) {
													System.out.println("Novembro");
												} else {
													if (mes == 12) {
														System.out.println("Dezembro");
													} else {
														System.out.println("Mês indefinido");
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}
	
	public static void ifSemFlecha() {
		
		int mes = 9;
		
		if(mes == 1) {
			System.out.println("Janeiro");
		} else if (mes == 2) {
			System.out.println("Fevereiro");
		} else if (mes == 3) {
			System.out.println("Março");
		} else if (mes == 4) {
			System.out.println("Abril");
		} else if (mes == 5) {
			System.out.println("Maio");
		} else if (mes == 6) {
			System.out.println("Junho");
		} else if (mes == 7) {
			System.out.println("Julho");
		} else if (mes == 8) {
			System.out.println("Agosto");
		} else if (mes == 9) {
			System.out.println("Setembro");
		} else if (mes == 10) {
			System.out.println("Outubro");
		} else if (mes == 11) {
			System.out.println("Novembro");
		} else if (mes == 12) {
			System.out.println("Dezembro");
		} else {
			System.out.println("Mês indefinido");
		}
	}
	
	public static void ifFerias() {
		String mes = "Julho";
		
		if(mes == "Julho" || mes == "Abril" || mes == "Junho") {
			System.out.println("Férias");
		}
	}
	
	public static void ifMaior() {
		double salarioMensal = 1824.25d;
		double mediaSalarial = 1212.00d;
		
		int quantidadeDependentes = 0;
		int mediaDependentes = 2;
		
		if((salarioMensal < mediaSalarial) && (quantidadeDependentes < mediaDependentes)) {
			System.out.println("Funcionario deve receber auxilio.");
		}
		
		boolean salarioBaixo = salarioMensal < mediaSalarial;
		boolean muitosDependentes = quantidadeDependentes >= mediaDependentes;
		
		if((salarioBaixo) && (muitosDependentes)) {
			System.out.println("Funcionario deve receber auxilio.");
		}
		
		boolean recebeAuxilio = (salarioBaixo) && (muitosDependentes);
		
		if(recebeAuxilio) {
			System.out.println("Funcionario deve receber auxilio.");
		} else {
			System.out.println("Funcionario não deve receber auxilio.");
		}
	}
	
	public static void switchSemana() {
		String dia = "Terça";
		switch(dia) {
			case "Domingo":
				System.out.println(1);
			break;
			case "Segunda":
				System.out.println(2);
				break;
			case "Terça":
				System.out.println(3);
				break;
			case "Quarta":
				System.out.println(4);
				break;
			case "Quinta":
				System.out.println(5);
				break;
			case "Sexta":
				System.out.println(6);
				break;
			case "Sabado":
				System.out.println(7);
				break;
			default:
				System.out.println("dia invalido.");
				break;
		}
	}
	
	public static void switchNumero() {
		int numero = 4;
		switch(numero) {
			case 1:
			case 2:
			case 3:
			case 4:
				System.out.println("Certo");
				break;
			case 5:
			case 6:
			case 7:
				System.out.println("Errado");
				break;
			case 8:
			case 9:
			case 10:
				System.out.println("Talvez");
				break;
			default:
				System.out.println("Valor Indefinido.");
				break;
		}
	}
	
	public static void switchFerias() {
		String mes = "Dezembro";
		switch(mes) {
			case "Janeiro":
			case "Fevereiro":
			case "Março":
			case "Abril":
			case "Maio":
			case "Junho":
			case "Julho":
			case "Agosto":
			case "Setembro":
			case "Outubro":
			case "Novembro":
			case "Dezembro":
				System.out.println("Ferias");
				break;
			default:
				System.out.println("Mes Inválido.");
				break;
		}
	}
}
