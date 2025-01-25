package aula07;
public class Aula07 {
public static void main(String[] args) {
    
    Lutador[] l = new Lutador[6];
    
    l[4] = new Lutador("Pretty Boy", "França", 31, 1.75f, 68.9f, 11, 3, 1);
    
    l[1] = new Lutador("Putscript", "Brasil", 29, 1.68f, 57.8f, 14, 4, 3);
    
    l[2] = new Lutador("Snapshadow", "Eua", 35, 1.65f, 80.9f, 12, 2, 1);
    
    l[3] = new Lutador("Dead code", "Austrália", 28, 1.93f, 81.6f, 13, 0, 2);
    
    l[0] = new Lutador("Andrei", "Brasil", 27, 1.84f, 115.0f, 20, 3, 3);
    
    l[5] = new Lutador("UFOCobol", "Argentina", 44, 1.90f, 115.0f, 55, 33, 20);
    
    Luta UEC01 = new Luta();
    UEC01.marcarLuta(l[5], l[0]);
    UEC01.lutar();
    System.out.println("\n");
    l[5].status();
    System.out.println("\n");
    l[0].status();
    
    
}
}
            