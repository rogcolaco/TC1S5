import java.util.ArrayList;

public class ExplosaoSolarDiaria {

    private int cicloSolar;
    private String data;
    private float nivelMaximoRaioX;
    private ArrayList<String> listaClassesExplosoes;

    public ExplosaoSolarDiaria(int cicloSolar, String data, float nivelMaximoRaioX, ArrayList<String> listaClassesExplosoes) {
        this.cicloSolar = cicloSolar;
        this.data = data;
        this.nivelMaximoRaioX = nivelMaximoRaioX;
        this.listaClassesExplosoes = listaClassesExplosoes;
    }

    public int getCicloSolar() {
        return cicloSolar;
    }

    public void setCicloSolar(int cicloSolar) {
        this.cicloSolar = cicloSolar;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public float getNivelMaximoRaioX() {
        return nivelMaximoRaioX;
    }

    public void setNivelMaximoRaioX(float nivelMaximoRaioX) {
        this.nivelMaximoRaioX = nivelMaximoRaioX;
    }

    public ExplosaoSolarDiaria clona(){
        ExplosaoSolarDiaria novaExplosaoSolarDiaria = new ExplosaoSolarDiaria(this.cicloSolar, this.data, this.nivelMaximoRaioX, this.listaClassesExplosoes);
        return  novaExplosaoSolarDiaria;
    }

    public Boolean adiciona1ClasseExplosao(String classe){
        if(classe.length()<=4){
            listaClassesExplosoes.add(classe);
            return true;
        }
        return false;
    }

    public ArrayList<String> retornaClassesExplosoes(){
        return  listaClassesExplosoes;
    }
}
