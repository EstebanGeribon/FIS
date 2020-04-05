
public class FuncionesUsuario {
    //aaaaa
    
    public double calculoImpuestos(Usuario user){
        double impuesto;
        if(user.getEdad()<18){
            impuesto =0;
        }else {    
            if(user.getEdad()<31){
                impuesto = fhijos(2000, user.getCantHijos());
        } else {
                if(user.getEdad()<66){
                    impuesto = fhijos(7000, user.getCantHijos());
                } else {
                        impuesto = fhijos(2000, user.getCantHijos());
                }
            }
        }
        return impuesto;
    }
    
    public double fhijos(double imp, int hijos) {
        double a = ((hijos * 3)/100)+1;
        if(a>0.5){
            imp = imp/0.5;            
            } else {
                    imp = imp/a;
        }
        return imp;
    }
}
