public class Veiculo {

    private String tipo; //terreste, aquatico ou aéreo
    private String nroChassi;
    private int nroRodas;
    private int potenciaMotor;
    private float a;



    public Veiculo(String tipo, String nroChassi, int nroRodas, int potenciaMotor) {
        this.tipo = tipo;
        this.nroChassi = nroChassi;
        this.nroRodas = nroRodas;
        this.potenciaMotor = potenciaMotor;
    }

    public Veiculo(String tipo, String nroChassi, int nroRodas, int potenciaMotor, float a) {
        this.tipo = tipo;
        this.nroChassi = nroChassi;
        this.nroRodas = nroRodas;
        this.potenciaMotor = potenciaMotor;
        this.a = a;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNroChassi() {
        return nroChassi;
    }

    public void setNroChassi(String nroChassi) {
        this.nroChassi = nroChassi;
    }

    public int getNroRodas() {
        return nroRodas;
    }

    public void setNroRodas(int nroRodas) {
        this.nroRodas = nroRodas;
    }

    public int getPotenciaMotor() {
        return potenciaMotor;
    }

    public void setPotenciaMotor(int potenciaMotor) {
        this.potenciaMotor = potenciaMotor;
    }

    public float getA() {
        return a;
    }

    public void setA(float a) {
        this.a = a;
    }

    public Veiculo clonar(){
        Veiculo veiculo = new Veiculo(this.tipo, this.nroChassi,this.nroRodas, this.potenciaMotor);
        return veiculo;
    }

    public int compara1(Veiculo v1, Veiculo v2){
        if((v1.tipo.compareTo(v2.tipo) == 0 && v1.nroChassi.compareTo(v2.nroChassi) == 0)
        &&  (v1.nroRodas == v2.nroRodas) && (v1.potenciaMotor == v2.potenciaMotor)) {
            return 1;
        } else {
            return 0;
        }
    }

    public int compara2(Veiculo v1, Veiculo v2){
        if (v1 == v2) {
            return 1;
        } else {
            return 0;
        }
    }
}
