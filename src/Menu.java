import java.util.Arrays;

public class Menu {

    public String interfaz(){
        return """

                *********************************
                * MENU                          *
                * 1. Aritmeticas                *
                * 2. Trigonometricas            *
                * 3. Estadisticas               *
                * 4. Calculo                    *
                * 5. Salir                      *
                *********************************
                """;

    }
    public String aritmeticas(){
        return """

                *********************************
                * Aritmetica                    *
                * 1. Suma                       *
                * 2. Resta                      *
                * 3. Multiplicacion             *
                * 4. Division                   *                
                * 5. Potencia                   *
                * 6. Salir                      *
                *********************************
                """;

    }
    public String trigonometria(){
        return """

                *********************************
                * Trigonometria                 *
                * 1. Seno                       *
                * 2. Coseno                     *
                * 3. Tangente                   *
                * 4. Salir                      *                                   
                *********************************
                """;

    }
    public String estadistica() {
        return """

                *********************************
                * Estadistica                   *
                * 1. Promedio                   *
                * 2. Media                      *
                * 3. Moda                       *
                * 4. Varianza                   *
                * 5. Desviacion estandar        *
                * 6. Salir                      *                                   
                *********************************
                """;
    }
    public String gaussJordan() {
        return """

                *************************************************************************
                * Calculo                                                               *
                * 1. Resolver sistema de ecuaciones lineales NxN con Gauss-Jordan       *
                * 2. Salir                                                              *                                  
                *************************************************************************
                """;
    }

    public long factorial(int n){
        long st = 1;
        int i =1;
        while(i <= n){
            st = st*i;
            i++;
        }
        return st;

    }
    public double potencia(double b, int e){
        double pot=1;
        if(e==0){
            pot=1;
        }else{
            for (int i=1;i<=e;i++){
                pot=pot*b;
            }
        }

        return pot;

    }

    public int removeDupli(int arr[], int n){
        if (n==0 || n==1){
            return n;
        }
        int j = 0;//for next element
        for (int i=0; i < n-1; i++){
            if (arr[i] != arr[i+1]){
                arr[j++] = arr[i];
            }
        }
        arr[j++] = arr[n-1];
        return j;
    }
public double varianzaM(String data){
    System.out.println("Ingrese los numeros separados por una coma para determinar su varianza:");
    String[] dataArs = data.split(",");
    int[] dataAr = new int[dataArs.length];
    int[] aux0 = new int[dataArs.length];
    Integer[][] dataF = new Integer[dataArs.length][2];//array final1.0
    for (int i = 0; i < dataArs.length; i++) {
        dataAr[i] = Integer.parseInt(dataArs[i]);
    }
    for (int i = 0; i < dataArs.length; i++) {
        aux0[i] = Integer.parseInt(dataArs[i]);
    }

    Arrays.sort(dataAr);
    Arrays.sort(aux0);


    int cont1 = 0;
    int elm1 = 0;
    int pos1 = 0;

    for (int i = 0; i < dataAr.length; i++) {
        int tmelm1 = dataAr[i];
        int tcont1 = 0;
        for (int j = 0; j < dataAr.length; j++) {
            if (dataAr[j] == tmelm1) {
                tcont1++;

            }

        }


        dataF[pos1][0] = tmelm1;
        dataF[pos1][1] = tcont1;
        tcont1 = 0;
        pos1++;
    }


    int l1 = aux0.length;
    l1 = removeDupli(aux0, l1);
    int[][] tabla0 = new int[l1][2];
    for (int i = 0; i < l1; i++) {
        tabla0[i][0] = aux0[i];
        tabla0[i][1] = -1;

    }

    int cont2 = 0;
    int elm2 = 0;


    for (int i = 0; i < dataAr.length; i++) {
        int tmelm2 = dataAr[i];
        int tcont2 = 0;
        for (int j = 0; j < dataAr.length; j++) {
            if (dataAr[j] == tmelm2) {
                tcont2++;
            }
        }
        for (int k = 0; k < tabla0.length; k++) {
            if (tabla0[k][0] == tmelm2 && tabla0[k][1] != tcont2) {
                tabla0[k][1] = tcont2;
            }

        }
        tcont2 = 0;
    }

                         /*   System.out.println("tabla preliminar");
                            for (int i = 0; i < tabla0.length; i++) {

                                for (int j = 0; j < tabla0[i].length; j++) {
                                    System.out.print(tabla0[i][j] + "\t");
                                }
                                System.out.println();
                            } */
    double nvar=0;
    double auxF=0;
    for (int i=0;i< tabla0.length;i++){
        nvar=tabla0[i][1]+nvar;
    }
    // System.out.println("total de datos ingresados="+nvar);
    double [][] tablaF = new double[tabla0.length][5];
    for (int i=0;i< tablaF.length;i++){
        tablaF[i][0]=tabla0[i][0];
        tablaF[i][1]=tabla0[i][1];
        tablaF[i][2]=Double.parseDouble(String.valueOf(tabla0[i][1]))/nvar;
        tablaF[i][3]=tablaF[i][2]*100;
        auxF=tablaF[i][1]+auxF;
        tablaF[i][4]=auxF;
    }
                       /* System.out.println("tabla preliminar completa");
                        for (int i = 0; i < tablaF.length; i++) {

                            for (int j = 0; j < tablaF[i].length; j++) {
                                System.out.print(tablaF[i][j] + "\t");
                            }
                            System.out.println();
                        } */
    double [][] tablaVar = new double[tablaF.length][6];
    for (int i=0; i<tablaVar.length;i++){
        tablaVar[i][0]=tablaF[i][0];
        tablaVar[i][1]=tablaF[i][1];
        tablaVar[i][2]=tablaVar[i][0]*tablaVar[i][1];
    }
    double sumxf=0;
    for (int i=0; i<tablaVar.length;i++){
        sumxf=tablaVar[i][2]+sumxf;
    }
    double promx = sumxf/nvar;
    double[]cs4aux=new double[tablaVar.length];
    for (int i=0;i<cs4aux.length;i++){
        cs4aux[i]=tablaVar[i][0]-promx;
    }
    for (int i=0;i< tablaVar.length;i++){
        tablaVar[i][3]=cs4aux[i]*cs4aux[i];
        tablaVar[i][4]=tablaVar[i][3]*tablaVar[i][1];
    }
    double sumcs5=0;
    for (int i=0; i<tablaVar.length;i++){
        sumcs5=tablaVar[i][4]+sumcs5;
    }
                     /*  System.out.println("tabla de varianza:");
                        for (int i = 0; i < tablaVar.length; i++) {

                            for (int j = 0; j < tablaVar[i].length; j++) {
                                System.out.print(tablaVar[i][j] + "\t");
                            }
                            System.out.println();
                        } */
    // System.out.println("sumcs5 = " + sumcs5);
    double varianza = sumcs5/nvar;
    //System.out.println("La varianza para los datos ingresados es: "+varianza);
        return varianza;

}



}

