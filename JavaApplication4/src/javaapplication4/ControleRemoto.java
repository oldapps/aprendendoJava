package javaapplication4;


public class ControleRemoto  {
    private int volume;
    private boolean ligado;
    private boolean tocando;

    
    public void ControleRemoto() {
        this.setVolume(50);
        this.setLigado(false);
        this.setTocando(false);
    }

    private int getVolume(){
        return volume;
    }
    private boolean getLigado(){
        return ligado;
    }
    private boolean getTocando(){
        return tocando;
    }
    
    private void setVolume(int v){
        this.volume = v;
    }
    private void setLigado(boolean l){
        this.ligado = l;
    }
    private void setTocando(boolean t){
        this.tocando = t;
    }
    
   public void  ligar(){
       this.ligado = true;
       
   }
   public void  desligar(){
       this.ligado = false;
   }
   public void  abrirMenu(){
       if (this.getLigado() == true) {
           System.out.println(this.getLigado());
           System.out.println(this.getVolume());
           System.out.println("Menu\n------------------------");
           System.out.println("Volume " + this.getVolume() + "%");
       } else {
           System.out.println("Tv desligada");
       }
   }
   public void  fecharMenu(){
       System.out.println("Menu fechado");
   }
   public void  maisVolume(){
       if (this.getLigado() == true) {
           this.setVolume(this.getVolume() + 1);       
           
       } else {
           System.out.println("Tv desligada");
       }
   }
   public void  menosVolume(){
       if (this.getLigado() == true) {
           this.setVolume(this.getVolume() - 1);       
           
       } else {
           System.out.println("Tv desligada");
       }
       
   }
   public void  ligarMudo(){
       if (this.getLigado() == true && this.volume > 0) {
           this.setVolume(0);
           
       } else {
       }
   }
   public void  desligarMudo(){
       if (this.getLigado() == true && this.volume == 0) {
           this.setVolume(50);
           
       } else {
       }
   }
   public void  play(){
       if (this.getLigado() == true) {
           this.setTocando = true;
           
       } else {
           
       }
   }
   public void  pause(){
       if (this.getLigado() == true)
           this.setTocando = false;
   } else {
}
    
}



        
    
    
    
    
    
    
    
    

