package trabajo;

import java.util.*;

class Clase {
	private int contadorTotalDinero = 0;
	private int vidas = 5;
	private int preguntasFormuladas = 0;
	private Scanner scanner = new Scanner(System.in);
	private String salaActual = "";
	private Set<String> salasVisitadas = new HashSet<>();

	public void iniciarJuego() {
		System.out.println("¡Bienvenido a ¡Hazte Millonario Escape Room!");
		System.out.println("Puedes usar entre los comandos:\n\n'cd' para entrar en una sala \n'pwd' para recordar en que sala estás \n'ls' para recordar los comandos que puedes usar \n");
		System.out.println("Selecciona una sala para empezar. Introduce 'cd' + 'salaX' para entrar:");

		while (preguntasFormuladas < 20 && vidas > 0) {
			System.out.print("> ");
			String entrada = scanner.nextLine().trim().toLowerCase();;

			if (entrada.equals("ls")) {
				mostrarOpciones();
				continue;
			} else if (entrada.equals("pwd")) {
				mostrarSalaActual();
				continue;
			}

			if (entrada.startsWith("cd ")) {
				String salaSolicitada = entrada.substring(3);
				if (salasVisitadas.contains(salaSolicitada)) {
					System.out.println("\nYa has visitado esta sala. Elige otra.");
					continue;
				}
				salasVisitadas.add(salaSolicitada);
				salaActual = salaSolicitada;
			} else {
				System.out.println("\nComando no válido. Utiliza 'cd' 'pwd' o 'ls'");
				continue;
			}

			switch (salaActual) {
			case "sala1":
				sala1();
				break;
			case "sala2":
				sala2();
				break;
			case "sala3":
				sala3();
				break;
			case "sala4":
				sala4();
				break;
			case "sala5":
				sala5();
				break;
			case "sala6":
				sala6();
				break;
			case "sala7":
				sala7();
				break;
			case "sala8":
				sala8();
				break;
			case "sala9":
				sala9();
				break;
			case "sala10":
				sala10();
				break;
			case "sala11":
				sala11();
				break;
			case "sala12":
				sala12();
				break;
			case "sala13":
				sala13();
				break;
			case "sala14":
				sala14();
				break;
			case "sala15":
				sala15();
				break;
			case "sala16":
				sala16();
				break;
			case "sala17":
				sala17();
				break;
			case "sala18":
				sala18();
				break;
			case "sala19":
				sala19();
				break;
			case "sala20":
				sala20();
				break;
			default:
				System.out.println("\nSala no válida, dame un valor entre : 'cd sala1 & cd sala20'");
				continue;
			}
			preguntasFormuladas++;
		}

		if (vidas == 0) {
			//comprueba si tiene vidas disponible para seguir jugando
		} else {
			System.out.println("\n¡Enhorabuena!");
			System.out.println("Has ganado el juego.");
			System.out.println("Has ganado " + contadorTotalDinero + " euros! :O.");
			System.out.println("Gracias por jugar a este juego tan bacano.");
		}
	}

	private void mostrarOpciones() {
		System.out.println("\nOpciones disponibles:");
		System.out.println("- 'cd salaX': Ir a la sala X");
		System.out.println("- 'ls': Mostrar opciones disponibles");
		System.out.println("- 'pwd': Mostrar la sala actual");
	}

	private void mostrarSalaActual() {
		if (salaActual.isEmpty()) {
			System.out.println("\nNo estás en ninguna sala actualmente.");
		} else {
			System.out.println("\nTe encuentras en la sala: " + salaActual);
		}
	}

	private void sala1() {
		pregunta("\n¿Qué significa HTML?", "Hypertext Markup Language", "Hypertext Makeup Language", "Hypertext Markup Language", "Home Tool Markup Language");
	}

	private void sala2() {
		pregunta("\n¿Qué es un algoritmo?", "Un conjunto de pasos ordenados para realizar una tarea", "Un conjunto de pasos ordenados para realizar una tarea", "Una aplicación de software", "Un lenguaje de programación");
	}

	private void sala3() {
		pregunta("\n¿Cuál es el lenguaje de programación más utilizado en el desarrollo web?", "JavaScript", "Java", "Python", "JavaScript");
	}

	private void sala4() {
		pregunta("\n¿Qué es un 'boolean' en programación?", "Un tipo de dato que puede tener uno de dos valores: verdadero o falso", "Una estructura de control", "Un lenguaje de programación", "Un tipo de dato que puede tener uno de dos valores: verdadero o falso");
	}

	private void sala5() {
		pregunta("\n¿Qué es un 'IDE' en programación?", "Entorno de Desarrollo Integrado", "Entorno de Desarrollo Integrado", "Interfaz de Desarrollo Extendido", "Ingeniería de Desarrollo de Software");
	}

	private void sala6() {
		pregunta("\n¿Qué significa 'HTTP' en el contexto de internet?", "Protocolo de Transferencia de Hipertexto", "Hypertext Tool Protocol", "Home Transfer Tool", "Protocolo de Transferencia de Hipertexto");
	}

	private void sala7() {
		pregunta("\n¿Qué es un 'pseudocódigo'?", "Un lenguaje de programación de alto nivel simplificado", "Una técnica de cifrado", "Un lenguaje de programación de alto nivel simplificado", "Un tipo de software de seguridad");
	}

	private void sala8() {
		pregunta("\n¿Cuál es el lenguaje de programación más utilizado para análisis de datos?", "Python", "Python", "R", "Java");
	}

	private void sala9() {
		pregunta("\n¿Qué es un 'byte'?", "Una unidad de almacenamiento de datos que consiste en 8 bits", "Una unidad de medida de longitud", "Una unidad de tiempo", "Una unidad de almacenamiento de datos que consiste en 8 bits");
	}

	private void sala10() {
		pregunta("\n¿Cuál de los siguientes no es un lenguaje de programación orientado a objetos?", "C", "Python", "C", "Java");
	}

	private void sala11() {
		pregunta("\n¿Qué es un 'framework' en desarrollo de software?", "Una estructura conceptual y técnica de soporte definida, que normalmente incluye programas de soporte, bibliotecas y un lenguaje interpretado en el que se codifica software a ejecutar en la plataforma", "Una biblioteca de libros", "Una red social para desarrolladores", "Una estructura conceptual y técnica de soporte definida, que normalmente incluye programas de soporte, bibliotecas y un lenguaje interpretado en el que se codifica software a ejecutar en la plataforma");
	}

	private void sala12() {
		pregunta("\n¿Qué es una 'API'?", "Interfaz de Programación de Aplicaciones, que permite la interacción entre distintos sistemas de software", "Un tipo de base de datos", "Un sistema de seguridad informática", "Interfaz de Programación de Aplicaciones, que permite la interacción entre distintos sistemas de software");
	}

	private void sala13() {
		pregunta("\n¿Qué es un 'bug' en programación?", "Un error en el código que produce un comportamiento no esperado", "Un fallo de la vida", "Un error en el código que produce un comportamiento no esperado", "Una característica nueva en el software");
	}

	private void sala14() {
		pregunta("\n¿Cuál es el protocolo de Internet que permite transferir archivos entre sistemas?", "FTP (File Transfer Protocol)", "FTP (File Transfer Protocol)", "HTTP (Hypertext Transfer Protocol)", "SMTP (Simple Mail Transfer Protocol)");
	}

	private void sala15() {
		pregunta("\n¿Qué es un 'router' en redes informáticas?", "Un dispositivo que interconecta redes de computadoras y dirige el tráfico de datos entre ellas", "Un dispositivo que interconecta redes de computadoras y dirige el tráfico de datos entre ellas", "Un software de seguridad", "Un tipo de cable de red");
	}

	private void sala16() {
		pregunta("\n¿Qué es un 'firewall'?", "Un sistema de seguridad que controla y regula el tráfico de red", "Un sistema de seguridad que controla y regula el tráfico de red", "Un programa de diseño gráfico", "Un dispositivo de almacenamiento externo");
	}

	private void sala17() {
		pregunta("\n¿Qué significa 'URL'?", "Uniform Resource Locator", "Universal Registry Locator", "Unified Resolution Link", "Uniform Resource Locator");
	}

	private void sala18() {
		pregunta("\n¿Cuál es el protocolo de seguridad estándar en Internet para proteger la comunicación entre dos sistemas?", "SSL (Secure Sockets Layer)", "FTP (File Transfer Protocol)", "HTTP (Hypertext Transfer Protocol)", "SSL (Secure Sockets Layer)");
	}

	private void sala19() {
		pregunta("\n¿Qué es un 'script' en programación?", "Un programa o secuencia de instrucciones que se ejecutan de forma automática", "Una función en lenguajes de programación", "Un programa o secuencia de instrucciones que se ejecutan de forma automática", "Un tipo de base de datos");
	}

	private void sala20() {
		pregunta("\n¿Qué es la 'ingeniería de software'?", "Una disciplina que se ocupa de todos los aspectos de la producción de software", "Una disciplina que se ocupa de todos los aspectos de la producción de software", "Un tipo de ingeniería mecánica", "Una rama de la biología");
	}

	private void pregunta(String enunciado, String respuestaCorrecta, String opcionA, String opcionB, String opcionC) {
		System.out.println(enunciado);
		System.out.println("a) " + opcionA);
		System.out.println("b) " + opcionB);
		System.out.println("c) " + opcionC);
		System.out.println("Dinero actual: " + contadorTotalDinero + " euros.");
		System.out.print("¡ELIGE LA OPCIÓN CORRECTA! '  A  /  B  / C  '");
		String opcionSeleccionada = scanner.nextLine().toLowerCase();
		String respuesta;
		switch (opcionSeleccionada) {
		case "a":
			respuesta = opcionA.toLowerCase();
			break;	
		case "b":
			respuesta = opcionB.toLowerCase();
			break;
		case "c":
			respuesta = opcionC.toLowerCase();
			break;
		default:
			System.out.println("Opción no válida, elige entre A, B o C");
			pregunta(enunciado, respuestaCorrecta, opcionA, opcionB, opcionC);
			return;
		}
		if (respuesta.equals(respuestaCorrecta.toLowerCase())) {
			int dineroGanado = 1000000; 
			contadorTotalDinero += dineroGanado;
			System.out.println("\n¡Respuesta correcta! Ganaste " + dineroGanado + " euros!!.");
			System.out.println("Ahora tienes : " + contadorTotalDinero);
			System.out.println("Te quedan " + vidas + " vidas.");
			System.out.println("¿Qué quieres hacer ahora? \nIntroduzca la siguiente sala o comando\n");

		} else {

			vidas--;

			if (vidas ==0) {
				System.out.println("\nVaya... respuesta incorrecta..");
				System.out.println("La respuesta correcta era: " + respuestaCorrecta);
				System.out.println("¡Vaya! te has quedado sin vidas..");
				System.out.println("Fin del juego. \nGracias por jugar!.");

			}else {
				System.out.println("\nVaya... respuesta incorrecta.. Perdiste la mitad de tu dinero.");
				System.out.println("La respuesta correcta era: " + respuestaCorrecta);
				contadorTotalDinero /= 2;
				System.out.println("Ahora tienes... : " + contadorTotalDinero);
				System.out.println("Te quedan " + vidas + " vidas.");
				System.out.println("Introduzca la siguiente sala o comando:");
			}
		}
	}
}