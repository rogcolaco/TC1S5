public class Taxes {

    public String aliquota(float salario){
        if(salario<=1566.61) {
            return "Isento";
        }else if(salario>1566.61 && salario <=2347.85){
            return "7,5%";
        } else if(salario>2347.85 && salario <=3130.51) {
            return "15%";
        }else if(salario>3130.51 && salario <=3911.63) {
            return "22,5%";
        }else{
            return "27,5%";
        }
    }
}
