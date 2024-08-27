/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.uniensinojavaswing.murilo.swingcronometro.murilo.nata.nogueira.Controlador;
/**
 *
 * @author muril
 */
public class TimerControler {
    private int segundos = 0;
    private int minutos = 0;
    private int horas = 0;
    private boolean timerZerado = true;
    
    public String retornaTempo(){
        
        return formataTempo();
    }
    
    public void redefenirTempo(int segundos, int minutos, int horas){
        this.segundos = segundos;
        this.minutos = minutos;
        this.horas = horas;
        
        if(this.segundos == 0 && this.minutos == 0 && this.horas == 0) //Condição segura para timer
        {
            this.timerZerado = true;
        } else {
            this.timerZerado = false;
        }
        
    }
    
    public void efetuarLogicaCronometro(){
        segundos++;
        if(segundos > 59)
        {
            segundos = 0;
            minutos++;
        }
        
        if(minutos > 59) {
            minutos = 0;
            horas++;
        }
    }
    
    public void efetuarLogicaTemporizador(){
        if(segundos == 0 && minutos !=0)
        {
            segundos = 60;
            minutos--;
        }
        
        if(minutos > 0 && horas !=0) {
            minutos = 59;
            horas--;
        }
        segundos--;
        
        if(this.segundos == -1 && this.minutos == 0 && this.horas == 0)
        {
            this.timerZerado = true;
        }
    }
    
     private String formataTempo()
     {
     String textoAtual = "";
     if (horas < 10)
     {
         textoAtual += "0" + horas;
     }
     else
     {
         textoAtual += horas;
     }

     if (minutos < 10)
     {
         textoAtual += ":0" + minutos;
     }
     else
     {
         textoAtual += ":" + minutos;
     }

     if (segundos < 10)
     {
         textoAtual += ":0" + segundos;
     }
     else
     {
         textoAtual += ":" + segundos;
     }

     return textoAtual;
    }
    
    public void zerarTimer(){
        segundos = 0;
        minutos = 0;
        horas = 0;
        timerZerado = true;
    }

    public boolean isTimerZerado() {
        return timerZerado;
    }

    public void setTimerZerado(boolean timerZerado) {
        this.timerZerado = timerZerado;
    }
    
    
}
