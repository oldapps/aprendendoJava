package aula07;
public class Aula07 {
public static void main(String[] args) {
    
    Lutador[] L = new Lutador[6];
    
    L[4] = new Lutador("Pretty Boy", "França", 31, 1.75f, 68.9f, 11, 3, 1);
    
    L[1] = new Lutador("Putscript", "Brasil", 29, 1.68f, 57.8f, 14, 4, 3);
    
    L[2] = new Lutador("Snapshadow", "Eua", 35, 1.65f, 80.9f, 12, 2, 1);
    
    L[3] = new Lutador("Dead code", "Austrália", 28, 1.93f, 81.6f, 13, 0, 2);
    
    L[0] = new Lutador("Andrei", "Brasil", 27, 1.84f, 115.0f, 20, 3, 3);
    
    L[5] = new Lutador("UFOCobol", "Argentina", 44, 1.90f, 122.0f, 55, 33, 20);
    
    
    
    L[0].apresentar();
    L[0].status();
    
    L[1].apresentar();
    L[1].status();
    
    L[2].apresentar();
    L[2].status();
    
    L[3].apresentar();
    L[3].status();
    
    L[4].apresentar();
    L[4].status();
    
    
    
}
}
            