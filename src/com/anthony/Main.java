package com.anthony;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    static class Cir {
        protected Integer radius;

        public void setRadius(Integer r){
            radius = r;
        }

        public Integer getRadius(){
            return radius;
        }

        public Double calcArea(){
            return Math.PI * Math.pow(getRadius(), 2);
        }

    }

    static class Esfe extends Cir{
        public Double calcArea(){
            return 4 * Math.PI * Math.pow(getRadius(), 2);
        }
    }

    static class Cilic extends Cir{

        protected Integer altura;

        public void setAltura(Integer a){
            altura = a;
        }

        public Integer getAltura(){
            return altura;
        }

        public Double calcArea(){
            return 2 * Math.PI * getRadius() * (getRadius() + getAltura());
        }
    }

    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);

        BufferedReader br = new BufferedReader (isr);

        Integer confirm = 1;
        Integer option;


        while(confirm == 1){

            System.out.println("------------------------");
            System.out.println("-----------Menú---------");
            System.out.println("------------------------");

            System.out.println("¿De que figura le gustaria calcular el area?");
            System.out.println("1 para Circulo.");
            System.out.println("2 para Esfera.");
            System.out.println("3 para Cilindro Recto.");

            System.out.println("------------------------");

            option = Integer.parseInt(br.readLine());

            System.out.println("------------------------");

            switch(option){
                case 1: {
                    Cir circulo = new Cir();
                    System.out.println("Introduzca el radio: ");
                    circulo.setRadius(Integer.parseInt(br.readLine()));
                    System.out.println("El area de un circulo es : " + Math.round(circulo.calcArea()));
                    break;
                }
                case 2:{
                    Esfe esfera = new Esfe();
                    System.out.println("Introduzca el radio: ");
                    esfera.setRadius(Integer.parseInt(br.readLine()));
                    System.out.println("El area de una esfera es : " + Math.round(esfera.calcArea()));
                    break;
                }
                case 3: {
                    Cilic cilindro = new Cilic();
                    System.out.println("Introduzca el radio: ");

                    cilindro.setRadius(Integer.parseInt(br.readLine()));

                    System.out.println("Introduzca la altura: ");

                    cilindro.setAltura(Integer.parseInt(br.readLine()));

                    System.out.println("El area de una esfera es : " + Math.round(cilindro.calcArea()));
                    break;
                }

                default: break;
            }

            System.out.println("------------------------");

            System.out.println("¿ Desea calcular denuevo otra figura?");
            System.out.println("1 para ver el menu.");
            System.out.println("0 para salir del sistema.");

            confirm = Integer.parseInt(br.readLine());

        }

        System.out.println("------------------------");

        System.out.println("Muchas gracias");

    }
}


//        2. Diseñe tres clases  Cir, Esfe, Cilinc con atributos protegidos:
//        ofrezca un menú que calcule el área de un círculo, esfera o de
//        un cilindro cerrado, Aplique herencia.