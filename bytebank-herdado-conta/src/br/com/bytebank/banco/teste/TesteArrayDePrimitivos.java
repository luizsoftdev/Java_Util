package br.com.bytebank.banco.teste;

public class TesteArrayDePrimitivos {

    //Array []
    public static void main(String[] args) {

        int[]idades = new int[5]; //Também poderia ser int idades[];

        //Iniciamos os arrays acima com os valores padrões
//        idades[0] = 29;
//        idades[1] = 39;
//        idades[2] = 49;
//        idades[3] = 59;
//        idades[4] = 69;
//
//        int idade1 = idades[4];

//        int idade 2 = idades[12] // Acessando uma posição inválida teríamos ArrayIndexOutOfBoundsException
//
//        System.out.println(idade1);
//
//        System.out.println(idades.length);

        for(int i =0;i<idades.length;i++){
            idades[i] = i*i;
        }


        for(int i =0;i<idades.length;i++){
            System.out.println(idades[i]);
        }

        int[] refs = {1,2,3,4,5}; // Forma literal de criar um array

    }
}
