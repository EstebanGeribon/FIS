
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
        if(hijos>0){
            double a = (hijos * 0.03);
            if(a>0.5){
                imp = imp/2;            
                } else {
                        imp = imp/(a+1);
                 }
        }
               
        return imp;
    }
}
