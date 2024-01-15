package exercicios_gerais.semaforos.version001.meu_package;

/*
 *  Rodrigo Pereira Faria
 *  09/12/2023
 */

import java.util.Scanner;

public class Semaforos {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String semaforoLesteOeste = "";
        String semaforoNorteSul = "";
        String fluxoDeCarros = "";

        boolean flag = false; //Anotação
        
        
        
        //Fluxo 01
        System.out.println("Fluxo 01");
        System.out.print("Digitando o semáforo leste-oeste: ");
        semaforoLesteOeste = input.nextLine();
        //Condições
        boolean semaforoLesteOesteVerde = semaforoLesteOeste.equalsIgnoreCase("verde");
        boolean semaforoLesteOesteAmarelo = semaforoLesteOeste.equalsIgnoreCase("amarelo");
        boolean semaforoLesteOesteVermelho = semaforoLesteOeste.equalsIgnoreCase("vermelho");
        
        if(!flag){    
            flag = true;
            if(semaforoLesteOesteVerde){
                semaforoNorteSul = "vermelho";
                fluxoDeCarros = "leste-oeste";
            }
            else if(semaforoLesteOesteAmarelo){
                semaforoNorteSul = "amarelo";
                fluxoDeCarros = "bloqueado";
            }
            else if(semaforoLesteOesteVermelho){
                semaforoNorteSul = "verde";
                fluxoDeCarros = "norte-sul";
            }
            else{
                System.out.println("Erro na digitação");
                flag = false;
            }
        }

        if (flag){
            System.out.printf(
            "semaforo Leste-Oeste: %s%nSemáforo Norte-Sul: %s%nFluxo de carros: %s%n%n"
            , semaforoLesteOeste
            , semaforoNorteSul
            , fluxoDeCarros
            );
        }

        flag = false;
        
        //Fluxo 02
        System.out.println("Fluxo 02");
        System.out.print("Digitando o sinal Norte-sul: ");
        semaforoNorteSul = input.nextLine();
        input.close();

        //Condições
        boolean semaforoNorteSulVerde = semaforoNorteSul.equalsIgnoreCase("verde");
        boolean semaforoNorteSulAmarelo = semaforoNorteSul.equalsIgnoreCase("amarelo");
        boolean semaforoNorteSulVermelho = semaforoNorteSul.equalsIgnoreCase("vermelho");

        if(!flag){
            flag = true;
            if(semaforoNorteSulVerde){
                semaforoLesteOeste = "vermelho";
                fluxoDeCarros = "norte-sul";
            }
            else if(semaforoNorteSulAmarelo){
                semaforoLesteOeste = "amarelo";
                fluxoDeCarros = "bloqueado";
            }
            else if(semaforoNorteSulVermelho){
                semaforoLesteOeste = "verde";
                fluxoDeCarros = "leste-oeste";
            }
            else{
                System.out.println("Erro na digitação.");
                flag = false;
            }
        }
        if(flag){
            System.out.printf(
                "Semáforo Norte-sul: %s%nSemáforo Leste-Oeste: %s%nFluxo de Carros: %s%n"
                , semaforoNorteSul
                , semaforoLesteOeste
                , fluxoDeCarros
                );
        }
        

        //Isso se torna melhor com estruturas de repetição
    }
}

/*
 * Simulando semáforos em um cruzamento.
 * 
 * Sentidos:
 * leste-oeste
 * norte-sul
 * 
 * Se leste-oeste = verde; então norte-sul = vermelho;
 * Fluxo de carros: leste-oeste
 * 
 * Se norte-sul = verde; então leste-oeste = vermelho
 * Fluxo de carros: norte-sul
 * 
 * Se norte-sul e leste-oeste amarelos ou vermelhos; então
 * fluxo de carros bloqueado
 * 
 * Como fazer?
 * 
 * Dê entrada no valor do semáforo leste-oeste (verde ou vermelho)
 * Então semáforo norte-sul vermelho e fluxo de carros = leste-oeste;
 * 
 * Semáforo leste-oeste = amarelo;
 * Semáforo norte-sul = amarelo;
 * fluxo de carros bloqueado;
 * 
 * semáforo norte-sul = verde, se semáforo norte-sul verde;
 * Então semáforo leste-oeste e fluxo de carros = norte-sul
 * 
 * Vou separar por fluxos. Fluxo 01 vai receber a entrada leste-oeste e fluxo 02 para norte-sul.
 * 
 * Anotação = flag é uma espécie de sentinela que auxilia no controle das condições, para que certas instruções não sejam executadas. O exemplo está para quando há o erro na digitação. Se houver erro, não vai exibir as informações do fluxo.
 * 
 * Utilizar tempo em Java com a classe Timer e TimerTask;
 */
