
import java.util.Arrays;
import java.util.Scanner;

public class Operaciones {
    Scanner scanner = new Scanner(System.in);
    Menu menu = new Menu();

    public void Salida(){
        int cvx =0;
        String enter = "Presione Espacio y Enter para continuar ->";
        do{
            System.out.print(enter);
            enter = scanner.nextLine();
        }while(enter.equals(""));


            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
            MenuPrincipal();



}
    public void SalidaAr(){
        int cvx =0;
        String enter = "Presione Espacio y Enter para continuar ->";
        do{
            System.out.print(enter);
            enter = scanner.nextLine();
        }while(enter.equals(""));


        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        OpAritmetica();



    }
    public void SalidaTri(){
        int cvx =0;
        String enter = "Presione Espacio y Enter para continuar ->";
        do{
            System.out.print(enter);
            enter = scanner.nextLine();
        }while(enter.equals(""));


        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        OpTrigonometria();



    }
    public void SalidaEst(){
        int cvx =0;
        String enter = "Presione Espacio y Enter para continuar ->";
        do{
            System.out.print(enter);
            enter = scanner.nextLine();
        }while(enter.equals(""));


        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        OpEstadistica();



    }
    public void SalidaCal(){
        int cvx =0;
        String enter = "Presione Espacio y Enter para continuar ->";
        do{
            System.out.print(enter);
            enter = scanner.nextLine();
        }while(enter.equals(""));


        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        OpCalculo();



    }
    public void MenuPrincipal(){

        System.out.println(menu.interfaz());
        int op = 0;
        do {
            try {
                System.out.println("-> Ingrese una opcion:");
                op = scanner.nextInt();
            } catch (Exception e) {
                System.out.println("Debe ingresar una de las opciones!");
                break;
            }
        } while (op != 1 && op != 2 && op != 3 && op != 4 && op != 5);
        switch (op) {
            case 1:
                OpAritmetica();

            case 2:
                OpTrigonometria();

            case 3:
                OpEstadistica();

            case 4:
                OpCalculo();

            case 5:
                System.out.println("Saliendo de la aplicacion...");
                System.exit(0);
                break;
        }

    }
    public void OpAritmetica(){
        int opArt = 0;
        System.out.println(menu.aritmeticas());
        do {
            try {
                System.out.println("-> Ingrese una opcion:");
                opArt = scanner.nextInt();
            } catch (Exception e) {
                System.out.println("Debe ingresar una de las opciones!");
                break;
            }
        } while (opArt != 1 && opArt != 2 && opArt != 3 && opArt != 4 && opArt != 5 && opArt != 6);
        switch (opArt) {
            case 1:
                String sumT;
                System.out.println("Ingrese los numeros a sumar separados por una coma:");
                sumT = scanner.next();
                String[] sumTa = sumT.split(",");
                double sumTotal = 0;
                for (int i = 0; i < sumTa.length; i++) {
                    sumTotal = sumTotal + Double.parseDouble(sumTa[i]);
                }
                System.out.println("El resultado de la suma es:" + sumTotal+"\n");
                SalidaAr();
                break;


            case 2:
                String resT;
                System.out.println("Ingrese los numeros a restar separados por una coma:");
                resT = scanner.next();
                String[] resTa = resT.split(",");
                double resTotal = Double.parseDouble(resTa[0]) - Double.parseDouble(resTa[1]);
                System.out.println("El resultado de la resta es:" + resTotal);
                SalidaAr();
                break;
            case 3:
                String mulT;
                System.out.println("Ingrese los numeros a multiplicar separados por una coma:");
                mulT = scanner.next();
                String[] mulTa = mulT.split(",");
                double mulTotal = Double.parseDouble(mulTa[0]) * Double.parseDouble(mulTa[1]);
                System.out.println("El resultado de la multiplicacion es:" + mulTotal);
                SalidaAr();
                break;

            case 4:
                String divT;
                String[] divTa;
                do {
                    System.out.println("Ingrese los numeros a dividir separados por una coma:");
                    divT = scanner.next();
                    divTa = divT.split(",");
                } while (Double.parseDouble(divTa[0]) == 0);
                double divTotal = Double.parseDouble(divTa[0]) / Double.parseDouble(divTa[1]);
                System.out.println("El resultado de la division es:" + divTotal);
                SalidaAr();
                break;
            case 5:
                int pot2;
                int pot1;
                do {
                    System.out.println("Ingrese el numero base de la potencia:");
                    pot1 = scanner.nextInt();
                    System.out.println("Ingrese el numero exponente de la potencia:");
                    pot2 = scanner.nextInt();
                } while (pot2 <= 0);
                int potTotal = pot1;
                for (int i = 0; i < pot2 - 1; i++) {
                    potTotal = potTotal * pot1;
                }
                System.out.println("El resultado de la potencia es:" + potTotal);
                SalidaAr();
                break;
            case 6:
                MenuPrincipal();
        }


    }
    public void OpTrigonometria(){
        int opTrigo = 0;
        System.out.println(menu.trigonometria());
        do {
            try {
                System.out.println("-> Ingrese una opcion:");
                opTrigo = scanner.nextInt();
            } catch (Exception e) {
                System.out.println("Debe ingresar una de las opciones!");
                break;
            }
        } while (opTrigo != 1 && opTrigo != 2 && opTrigo != 3 && opTrigo != 4);
        switch (opTrigo) {
            case 1:
                System.out.println("Ingrese el angulo deseado (en radianes) para calcular su Seno:");
                double var = scanner.nextDouble();
                System.out.println("Ingrese el iterador i (1-20):");
                int ite = scanner.nextInt();
                double arr = 0;
                double abb = 0;
                double senT = 0;
                for (int i = 0; i < ite; i++) {
                    arr = menu.potencia(-1, i) * menu.potencia(var, 2 * i + 1);
                    abb = menu.factorial(2 * i + 1);
                    senT = senT + arr / abb;
                }
                System.out.println("El total es:" + senT);
                SalidaTri();
                break;

            case 2:
                System.out.println("Ingrese el angulo deseado (en radianes) para calcular su Coseno:");
                double var1 = scanner.nextDouble();
                System.out.println("Ingrese el iterador i (1-20):");
                int ite1 = scanner.nextInt();
                double arr1 = 0;
                double abb1 = 0;
                double cosT = 0;
                for (int i = 0; i < ite1; i++) {
                    arr1 = menu.potencia(-1, i) * menu.potencia(var1, 2 * i);
                    abb1 = menu.factorial(2 * i);
                    cosT = cosT + arr1 / abb1;
                }
                System.out.println("El total es:" + cosT);
                SalidaTri();
                break;

            case 3:
                System.out.println("Ingrese el angulo deseado (en radianes) para calcular su Tangente:");
                double var2 = scanner.nextDouble();
                System.out.println("Ingrese el iterador i (1-20):");
                int ite2 = scanner.nextInt();
                double arrs = 0;
                double abbs = 0;
                double senTs = 0;
                for (int i = 0; i < ite2; i++) {
                    arrs = menu.potencia(-1, i) * menu.potencia(var2, 2 * i + 1);
                    abbs = menu.factorial(2 * i + 1);
                    senTs = senTs + arrs / abbs;
                }
                double arrc = 0;
                double abbc = 0;
                double cosTc = 0;
                for (int i = 0; i < ite2; i++) {
                    arrc = menu.potencia(-1, i) * menu.potencia(var2, 2 * i);
                    abbc = menu.factorial(2 * i);
                    cosTc = cosTc + arrc / abbc;
                }
                System.out.println("El total es" + senTs / cosTc);
                SalidaTri();
                break;

            case 4:

                MenuPrincipal();

        }
    }
    public void OpEstadistica(){
        int opEst = 0;
        System.out.println(menu.estadistica());
        do {
            try {
                System.out.println("-> Ingrese una opcion:");
                opEst = scanner.nextInt();
            } catch (Exception e) {
                System.out.println("Debe ingresar una de las opciones!");
                break;
            }
        } while (opEst != 1 && opEst != 2 && opEst != 3 && opEst != 4 && opEst != 5 && opEst != 6);
        switch (opEst) {
            case 1:
                String promT;
                System.out.println("Ingrese los numeros a promediar separados por una coma:");
                promT = scanner.next();
                String[] promTa = promT.split(",");
                double promTotal = 0;
                for (int i = 0; i < promTa.length; i++) {
                    promTotal = promTotal + Double.parseDouble(promTa[i]);
                }
                System.out.println("El total del promedio es: " + promTotal / promTa.length);
                SalidaEst();
                break;
            case 2:
                String medT;
                System.out.println("Ingrese los numeros para realizar la media separados por una coma:");
                medT = scanner.next();
                String[] medTa = medT.split(",");
                double medTotal = 0;
                for (int i = 0; i < medTa.length; i++) {
                    medTotal = medTotal + Double.parseDouble(medTa[i]);
                }
                System.out.println("La media es: " + medTotal / medTa.length);
                SalidaEst();
                break;

            case 3:
                String mod;
                System.out.println("Ingrese los numeros separados por una coma para determinar su moda:");
                mod = scanner.next();
                String[] modArSt = mod.split(",");
                Integer[] modAr = new Integer[modArSt.length];
                for (int i = 0; i < modArSt.length; i++) {
                    modAr[i] = Integer.parseInt(modArSt[i]);
                }
                int cont = 0;
                int elm = 0;
                for (int i = 0; i < modAr.length; i++) {
                    int tmelm = modAr[i];
                    int tcont = 0;
                    for (int j = 0; j < modAr.length; j++) {
                        if (modAr[j] == tmelm) {
                            tcont++;
                            if (tcont > cont) {
                                elm = tmelm;
                                cont = tcont;
                            }
                        }


                    }

                }
                System.out.println("La moda es: " + elm);
                SalidaEst();
                break;


            case 4:

                System.out.println("Ingrese los numeros separados por una coma para determinar su varianza:");
                String data = scanner.next();
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
                l1 = menu.removeDupli(aux0, l1);
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
                double nvar = 0;
                double auxF = 0;
                for (int i = 0; i < tabla0.length; i++) {
                    nvar = tabla0[i][1] + nvar;
                }
                // System.out.println("total de datos ingresados="+nvar);
                double[][] tablaF = new double[tabla0.length][5];
                for (int i = 0; i < tablaF.length; i++) {
                    tablaF[i][0] = tabla0[i][0];
                    tablaF[i][1] = tabla0[i][1];
                    tablaF[i][2] = Double.parseDouble(String.valueOf(tabla0[i][1])) / nvar;
                    tablaF[i][3] = tablaF[i][2] * 100;
                    auxF = tablaF[i][1] + auxF;
                    tablaF[i][4] = auxF;
                }
                       /* System.out.println("tabla preliminar completa");
                        for (int i = 0; i < tablaF.length; i++) {

                            for (int j = 0; j < tablaF[i].length; j++) {
                                System.out.print(tablaF[i][j] + "\t");
                            }
                            System.out.println();
                        } */
                double[][] tablaVar = new double[tablaF.length][6];
                for (int i = 0; i < tablaVar.length; i++) {
                    tablaVar[i][0] = tablaF[i][0];
                    tablaVar[i][1] = tablaF[i][1];
                    tablaVar[i][2] = tablaVar[i][0] * tablaVar[i][1];
                }
                double sumxf = 0;
                for (int i = 0; i < tablaVar.length; i++) {
                    sumxf = tablaVar[i][2] + sumxf;
                }
                double promx = sumxf / nvar;
                double[] cs4aux = new double[tablaVar.length];
                for (int i = 0; i < cs4aux.length; i++) {
                    cs4aux[i] = tablaVar[i][0] - promx;
                }
                for (int i = 0; i < tablaVar.length; i++) {
                    tablaVar[i][3] = cs4aux[i] * cs4aux[i];
                    tablaVar[i][4] = tablaVar[i][3] * tablaVar[i][1];
                }
                double sumcs5 = 0;
                for (int i = 0; i < tablaVar.length; i++) {
                    sumcs5 = tablaVar[i][4] + sumcs5;
                }
                     /*  System.out.println("tabla de varianza:");
                        for (int i = 0; i < tablaVar.length; i++) {

                            for (int j = 0; j < tablaVar[i].length; j++) {
                                System.out.print(tablaVar[i][j] + "\t");
                            }
                            System.out.println();
                        } */
                // System.out.println("sumcs5 = " + sumcs5);
                double varianza = sumcs5 / nvar;
                System.out.println("La varianza para los datos ingresados es: " + varianza);
                SalidaEst();
                break;


            case 5:
                System.out.println("Ingrese los numeros separados por una coma para determinar su desviacion estandar:");
                String d1 = scanner.next();
                double varEj = menu.varianzaM(d1);
                double temp;
                double sr = varEj / 2;
                do {
                    temp = sr;
                    sr = (temp + (varEj / temp)) / 2;
                } while ((temp - sr) != 0);

                System.out.println("La desviacion estandar para los datos ingresados es: " + sr);
                SalidaEst();
                break;

            case 6:

                MenuPrincipal();

        }



    }
    public void OpCalculo(){
        int opCal = 0;
        System.out.println(menu.gaussJordan());
        do {
            try {
                System.out.println("-> Ingrese una opcion:");
                opCal = scanner.nextInt();
            } catch (Exception e) {
                System.out.println("Debe ingresar una de las opciones!");
                break;
            }
        } while (opCal != 1 && opCal != 2);
        switch (opCal) {

            case 1:
                int nf = 0;
                int nc = 0;
                System.out.println("Ingrese el numero de filas: ");
                nf = scanner.nextInt();
                System.out.println("Ingrese el numero de columnas: ");
                nc = scanner.nextInt();
                int[][] tablaGj = new int[nf][nc];
                int contf = 1;
                for (int i = 0; i < nf; i++) {
                    System.out.print("Ingrese los elementos de la fila " + contf + ":");
                    String aux = scanner.next();
                    String[] auxAr = aux.split(",");
                    for (int j = 0; j < nc; j++) {
                        tablaGj[i][j] = Integer.parseInt(auxAr[j]);
                    }
                    contf++;
                }
                      /*  for (int i = 0; i < tablaGj.length; i++) {

                            for (int j = 0; j < tablaGj[i].length; j++) {
                                System.out.print(tablaGj[i][j] + "\t");
                            }
                            System.out.println();
                        } */
                     /*  int[] numerosaux = new int[nf];
                        int piv = nf;
                        for (int i = 0; i < numerosaux.length; i++) {
                            numerosaux[i] = tablaGj[i][numerosaux.length - piv];
                            piv--;
                        }
                        System.out.println("numeros auxiliares:");
                        for (int i = 0; i < numerosaux.length; i++) {
                            System.out.print(numerosaux[i] + "\t");
                        } */
                int[][]tablaGjFinal=new int[nf][nc];
                for (int i = 0; i < tablaGjFinal.length; i++) {

                    for (int j = 0; j < tablaGjFinal[i].length; j++) {
                        tablaGjFinal[i][j]=tablaGj[i][j];
                    }


                }
                int aux0=tablaGj[0][0];
                int aux1=tablaGj[1][0];
                int contaux=0;

                for (int i=0;i < 1;i++){
                    contaux++;
                    for (int j=0;j<tablaGjFinal[i].length;j++){
                        tablaGjFinal[1][j]=(tablaGj[0][j])*(aux1)-(tablaGj[1][j])*(aux0);
                    }
                }

                if(contaux==1){
                    contaux=0;
                    System.arraycopy(tablaGjFinal,0,tablaGj,0,tablaGj.length);
                    System.out.print("");
                    aux0=tablaGj[0][0];
                    aux1=tablaGj[2][0];
                }
                for (int i=0;i < 1;i++){
                    contaux++;
                    for (int j=0;j<tablaGjFinal[i].length;j++){
                        tablaGjFinal[2][j]=(tablaGj[0][j])*(aux1)-(tablaGj[2][j])*(aux0);
                    }
                }

                if(contaux==1){
                    contaux=0;
                    System.arraycopy(tablaGjFinal,0,tablaGj,0,tablaGj.length);
                    System.out.print("");
                    aux0=tablaGj[1][1];
                    aux1=tablaGj[0][1];
                }

                for (int i=0;i < 1;i++){
                    contaux++;
                    for (int j=0;j<tablaGjFinal[i].length;j++){
                        tablaGjFinal[0][j]=(tablaGj[1][j])*(aux1)-(tablaGj[0][j])*(aux0);
                    }
                }
                if(contaux==1){
                    contaux=0;
                    System.arraycopy(tablaGjFinal,0,tablaGj,0,tablaGj.length);
                    System.out.print("");
                    aux0=tablaGj[1][1];
                    aux1=tablaGj[2][1];
                }
                for (int i=0;i < 1;i++){
                    contaux++;
                    for (int j=0;j<tablaGjFinal[i].length;j++){
                        tablaGjFinal[2][j]=(tablaGj[1][j])*(aux1)-(tablaGj[2][j])*(aux0);
                    }
                }
                if(contaux==1){
                    contaux=0;
                    System.arraycopy(tablaGjFinal,0,tablaGj,0,tablaGj.length);
                    System.out.print("");
                    aux0=tablaGj[2][2];
                    aux1=tablaGj[0][2];
                }
                for (int i=0;i < 1;i++){
                    contaux++;
                    for (int j=0;j<tablaGjFinal[i].length;j++){
                        tablaGjFinal[0][j]=(tablaGj[2][j])*(aux1)-(tablaGj[0][j])*(aux0);
                    }
                }
                if(contaux==1){
                    contaux=0;
                    System.arraycopy(tablaGjFinal,0,tablaGj,0,tablaGj.length);
                    System.out.print("");
                    aux0=tablaGj[2][2];
                    aux1=tablaGj[1][2];
                }
                for (int i=0;i < 1;i++){
                    contaux++;
                    for (int j=0;j<tablaGjFinal[i].length;j++){
                        tablaGjFinal[1][j]=(tablaGj[2][j])*(aux1)-(tablaGj[1][j])*(aux0);
                    }
                }
                if(contaux==1){
                    contaux=0;
                    System.arraycopy(tablaGjFinal,0,tablaGj,0,tablaGj.length);
                    System.out.print("");
                    aux0=tablaGj[2][2];
                    aux1=tablaGj[1][2];
                }


                System.out.println();
                int x=(tablaGj[0][3])/(tablaGj[0][0]);
                int y=(tablaGj[1][3])/(tablaGj[1][1]);
                int z=(tablaGj[2][3])/(tablaGj[2][2]);
                System.out.println("La solucion para la ecuacion es: x="+x+"\t y="+y+"\t z="+z);
                SalidaCal();
                break;


                      /*  System.out.println("tabla final");
                        for (int i = 0; i < tablaGjFinal.length; i++) {

                            for (int j = 0; j < tablaGjFinal[i].length; j++) {
                                System.out.print(tablaGjFinal[i][j] + "\t");
                            }
                            System.out.println();
                        } */





            case 2:

                MenuPrincipal();
        }
    }





















}
