package br.com.poo.listalp2;
import java.util.logging.Logger;
//testando logger
public class ExercicioLogger {
	
	private static final Logger log = Logger.getLogger(ExercicioLogger.class.getName());
	
	public static void main(String[] args) {
		log.info("Isso é uma Informação");
		log.warning("Esta é uma mensagem de aviso.");
        log.severe("Esta é uma mensagem de erro grave.");
		
	}
}
