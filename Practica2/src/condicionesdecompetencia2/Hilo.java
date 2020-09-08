
package condicionesdecompetencia2;

import javax.swing.JTextArea;

/*@author Juan Angel Gonzalez Flores*/
public class Hilo extends Thread implements Runnable{
    private JTextArea Lienzo;
    private boolean Pausa;
    private boolean Stop;
    private RC rc;
    
    public Hilo(JTextArea Lienzo, RC rc){
        this.Lienzo = Lienzo;
        this.rc = rc;
        this.Pausa = false;
        this.Stop = false;
    }
    
    public void run(){
      
            while(true){
                try {
                    rc.setRecursoCompartido(this.getName());
                    Lienzo.append(rc.getRecursoCompartido()+"\n");
                    sleep(100);

                    synchronized(this){ // <---- Para pausar el hilo
                        while(Pausa == true){
                            wait();
                        }
                    }

                    if(Stop == true){ // <---Para salir del hilo
                        break;
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
                
                
            }
      
    }
    
    //Metodo para pausar hilo
    synchronized void pausarHilo(){
        Pausa = true;
        Stop = false;
        notify();
    }
    
    //Metodo para detener el hilo
    synchronized void detenerHilo(){
        Stop = true;
    }
    
    //Metodo para reanudar hilo
    synchronized void reanudarHilo(){
        Pausa = false;
        notify();
    }
    
    
}
