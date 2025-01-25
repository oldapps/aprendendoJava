package aula07;
public class Lutador {
    // Atributos
    //  Variaveis dentro de uma clase
    private String nome = "Pretty Boy";
    private String nacionalidade = "França";
    private int idade = 31;
    private float altura = 1.75f;
    private float peso = 68.9f;
    private String categoria = "Leve";
    private int vitorias = 11;
    private int derrotas = 2;
    private int empates = 1;
    
    // Métodos
    // São como nossas funções e procedimento dentro de uma classe
    
    public void apresentar(){
        System.out.println("Lutador: " + getNome());
        System.out.println("Origem: " + getNacionalidade());
        System.out.println(getIdade() + " anos");    
        System.out.println(getAltura() + "m de altura");
        System.out.println("Pesando :" + getPeso());
        System.out.println("Ganhou: " + getVitorias());
        System.out.println("Perdeu :" + getDerrotas());
        System.out.println("Empatou: " + getEmpates());
    }   
    
    public void status(){
        System.out.println(getNome());
        System.out.println("E um peso " + getCategoria());
        System.out.println(getVitorias() + "Vitorias");
        System.out.println(getVitorias() + "Derrotas");
        System.out.println(getVitorias() + "Empates");
    }
    public void ganharLuta(){
        setVitorias(getVitorias() + 1 );        
    }
    public void perderLuta(){
        setDerrotas(getDerrotas() + 1);
    }
    public void empatarLuta(){
        setEmpates(getEmpates() + 1);
    }
    
    public void Lutador(String no, String na, int id, float al, float pe, int vi, int de, int em){
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
        return empates;
    }
    public int getEmpates(){
        return empates;
    }
    
    
    public void setNome(String no){
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
    public void setPeso(float pe){
        this.peso = peso;
        setCategoria();
    }
    public void setCategoria(){
        if (getPeso() <52.2) {
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

    
    
        
        
        
    

    
    
    
    
    

