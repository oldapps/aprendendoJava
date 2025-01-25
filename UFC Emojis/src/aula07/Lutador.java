package aula07;
public class Lutador {
    // Atributos
    //  Variaveis dentro de uma clase
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;
    
    // Métodos
    // São como nossas funções e procedimento dentro de uma classe
    
    public void apresentar(){
        System.out.println("\n");
        System.out.println("CHEGOU A HORA DE APRESENTAR O LUTADOR " + getNome());
        System.out.println("DIRETAMENTE DO " + getNacionalidade());
        System.out.println("COM " + getIdade() + " anos");    
        System.out.println("NA ALTURA DE " + getAltura() + "M");
        System.out.println("Pesando: " + getPeso());
        System.out.println("E JA GANHOU " + getVitorias() + " LUTAS");
        System.out.println("PERDEU " + getDerrotas());
        System.out.println("E EMPATOU " + getEmpates());
    }   
    
    public void status(){
        System.out.println(getVitorias() + " Vitorias");
        System.out.println(getDerrotas() + " Derrotas");
        System.out.println(getEmpates() + " Empates");
    }
    public void ganharLuta(){
        this.setVitorias(this.getVitorias() + 1);
    }
    public void perderLuta(){
        this.setDerrotas(this.getDerrotas() + 1);
    }
    public void empatarLuta(){
        this.setEmpates(this.getEmpates() + 1);
    }
    
    public Lutador(String no, String na, int id, float al, float pe, int vi, int de, int em){
        setNome(no);
        nacionalidade = na;
        idade = id;
        altura = al;
        setPeso(pe);
        vitorias = vi;
        derrotas = de;
        empates = em;
        }
    
    public String getNome(){
        return nome;
    }
    public String getNacionalidade(){
        return nacionalidade;
    }
    public int getIdade(){
        return idade;
    }
    public float getAltura(){
        return altura;
    }
     public float getPeso(){
        return peso;
    }
    public String getCategoria(){
        return categoria;
    }
    public int getVitorias(){
        return vitorias;
    }
    public int getDerrotas(){
        return derrotas;
    }
    public int getEmpates(){
        return empates;
    }
    
    
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setNacionalidade(){
        this.nacionalidade = nacionalidade;
    }
    public void setIdade(){
        this.idade = idade;
    }
    public void setAltura(){
        this.altura = altura;
    }
        public void setPeso(float peso){
        this.peso = peso;
        setCategoria();
    }
    private void setCategoria(){
        if (getPeso() < 52.2) {
            this.categoria = "Inválido";            
        } else if (getPeso() <= 70.3 ) {
            this.categoria = "Leve";
        } else if (getPeso() <= 83.9){
            this.categoria = "Médio";
        } else if (getPeso() <= 120.2){
            this.categoria = "Pesado";
        } else {
            this.categoria = "Inválido";
        }
    }
    public void setVitorias(int vitorias){
        this.vitorias = vitorias;
    }
    public void setDerrotas(int derrotas){
        this.derrotas = derrotas;        
    }
    public void setEmpates(int empates){
        this.empates = empates;
    }





}

    
    
        
        
        
    

    
    
    
    
    

