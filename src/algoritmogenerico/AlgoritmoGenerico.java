
package algoritmogenerico;

public class AlgoritmoGenerico {

    public static void llenarVacante(Vacante m_base, Maestro[] maestros, boolean llena, Vacante m_opt) {
 
      //si esta llena
      if (llena) {
          //compruebo si tiene mas Capacidades que otra
          if (m_base.getCapacidades() > m_opt.getCapacidades()) {
 
              Maestro[] maestrosMochBase = m_base.getmaestros();
              m_opt.clear();
 
              //metemos los maestros
              for (Maestro e : maestrosMochBase) {
                  if (e != null) {
                      m_opt.aniadirMaestro(e);
                  }
 
              }
 
          }
 
      } else {
          //Recorre los maestros
          for (int i = 0; i < maestros.length; i++) {
              //si existe el Maestro
              if (!m_base.existeMaestro(maestros[i])) {
                  //Si el ValorPagar de la Vacante se supera, indicamos que esta llena
                  if (m_base.getPresupuesto()> m_base.getValorPagar()+ maestros[i].getValorPagar()) {
                      m_base.aniadirMaestro(maestros[i]); //añadimos
                      llenarVacante(m_base, maestros, false, m_opt);
                      m_base.eliminarMaestro(maestros[i]); // lo eliminamos
                  } else {
                      llenarVacante(m_base, maestros, true, m_opt);
                  }
 
              }
 
          }
 
      }
 
  }
    
    public static void main(String[] args) {
        Maestro[] maestros = {
            new Maestro(5000000, 9),
            new Maestro(2000000, 4),
            new Maestro(3500000, 6),
            new Maestro(4200000, 7),
            new Maestro(2700000, 5)
        };
 
        Vacante m_base = new Vacante(8500000, maestros.length);
        Vacante m_opt = new Vacante(8500000, maestros.length);
 
        llenarVacante(m_base, maestros, false, m_opt);
 
        System.out.println(m_opt);
    }
    
}




