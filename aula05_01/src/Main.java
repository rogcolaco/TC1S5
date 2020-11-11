public class Main {

    public static void main(String[] args) {
        Veiculo v1 = new Veiculo("terrestre", "12345", 4, 100);
        Veiculo v2 = null;
        v2 = v1.clonar();
        System.out.println(" Tipo: " +v2.getTipo() + "\n Chassi: " + v2.getNroChassi() +
                "\n Rodas: " + v2.getNroRodas() + "\n Poitencia: " + v2.getPotenciaMotor());
    }
}
