package com.leonealejandro;

public class Main {

    public static void main(String[] args) {
        double distance1;
        double distance2;
        double distance3;
        double[] P1   = new double[2];
        double[] P2   = new double[2];
        double[] P3   = new double[2];
        double[] ex   = new double[2];
        double[] ey   = new double[2];
        double[] p3p1 = new double[2];
        double jval  = 0;
        double temp  = 0;
        double ival  = 0;
        double p3p1i = 0;
        double triptx;
        double xval;
        double yval;
        double t1;
        double t2;
        double t3;
        double t;
        double exx;
        double d;
        double eyy;

        //TRANSFORMA OS PONTOS EM VETORES
        //PONTO 1
        P1[0] = -50;
        P1[1] = -10;
        //PONTO 2
        P2[0] = 10;
        P2[1] = -10;
        //PONTO 3
        P3[0] = 50;
        P3[1] = 10;

        //TRANSFORMA O VALOR DE METROS PARA A UNIDADE DO MAPA
        //DISTANCIA ENTRE O PONTO 1 E A MINHA LOCALIZACAO
        distance1 = 100;
        //DISTANCIA ENTRE O PONTO 2 E A MINHA LOCALIZACAO
        distance2 = 115.5;
        //DISTANCIA ENTRE O PONTO 3 E A MINHA LOCALIZACAO
        distance3 = 142.7;

        for (int i = 0; i < P1.length; i++) {
            t1   = P2[i];
            t2   = P1[i];
            t    = t1 - t2;
            temp += (t*t);
        }
        d = Math.sqrt(temp);
        for (int i = 0; i < P1.length; i++) {
            t1    = P2[i];
            t2    = P1[i];
            exx   = (t1 - t2)/(Math.sqrt(temp));
            ex[i] = exx;
        }
        for (int i = 0; i < P3.length; i++) {
            t1      = P3[i];
            t2      = P1[i];
            t3      = t1 - t2;
            p3p1[i] = t3;
        }
        for (int i = 0; i < ex.length; i++) {
            t1 = ex[i];
            t2 = p3p1[i];
            ival += (t1*t2);
        }
        for (int  i = 0; i < P3.length; i++) {
            t1 = P3[i];
            t2 = P1[i];
            t3 = ex[i] * ival;
            t  = t1 - t2 -t3;
            p3p1i += (t*t);
        }
        for (int i = 0; i < P3.length; i++) {
            t1 = P3[i];
            t2 = P1[i];
            t3 = ex[i] * ival;
            eyy = (t1 - t2 - t3)/Math.sqrt(p3p1i);
            ey[i] = eyy;
        }
        for (int i = 0; i < ey.length; i++) {
            t1 = ey[i];
            t2 = p3p1[i];
            jval += (t1*t2);
        }
        xval = (Math.pow(distance1, 2) - Math.pow(distance2, 2) + Math.pow(d, 2))/(2*d);
        yval = ((Math.pow(distance1, 2) - Math.pow(distance3, 2) + Math.pow(ival, 2) + Math.pow(jval, 2))/(2*jval)) - ((ival/jval)*xval);

        t1 = ponto1.getX();
        t2 = ex[0] * xval;
        t3 = ey[0] * yval;
        triptx = t1 + t2 + t3;
        retorno.setX(triptx);
        t1 = ponto1.getY();
        t2 = ex[1] * xval;
        t3 = ey[1] * yval;
        triptx = t1 + t2 + t3;
        retorno.setY(triptx);

        System.out.println(xval);
        System.out.println(yval);

    }
}
