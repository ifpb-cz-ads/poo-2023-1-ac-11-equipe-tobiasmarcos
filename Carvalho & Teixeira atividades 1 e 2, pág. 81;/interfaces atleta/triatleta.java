public class triatleta extends pessoa implements nadador, corredor, ciclista{
    public triatleta(String nome){
        super(nome);
    }
    public void aquecer(){
        System.out.println(this.getNome() + "está aquecendo");
    }
    public void nadar(){
        System.out.println(this.getNome() + "está nadando");
    }
    public void correr(){
        System.out.println(this.getNome() + "está correndo");
    }
    public void correrDeBicicleta(){
        System.out.println(this.getNome() + "está correndo de bike");
    }
}
