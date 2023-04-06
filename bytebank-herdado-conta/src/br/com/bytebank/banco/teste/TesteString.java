package br.com.bytebank.banco.teste;

public class TesteString {

    public static void main(String[] args) {

        //A classe String é um charSequence assim como a String Builder

        String nome = "Alura"; //object literal
        //String nome = new String("Alura");

//        char c = 'A';
//        char d = 'a';
//        //O objeto da classe string sofre de imutabilidade, logo temos que criar outra string se quisermos uma modificação da string original
//        String outronome = nome.replace(c,d);
//        System.out.println(outronome);

//        char c = nome.charAt(0);
//        System.out.println(c);

//        int pos = nome.indexOf("ur");
//        System.out.println(pos);

//        String sub = nome.substring(1);
//        System.out.println(sub);

//        System.out.println(nome.length());
//        for(int i = 0;i< nome.length();i++){
//            System.out.println(nome.charAt(i));
//        }

//        String vazio = "   Alura    ";
//        String outrovazio = vazio.trim();
//        System.out.println(vazio);
//        System.out.println(outrovazio);


//        System.out.println(nome.contains("A"));

//        String texto = "Socorram";
//        String texto2 = texto.concat("-");
//        String texto3 = texto2.concat("me");
//        String texto4 = texto3.concat(", ");
//        String texto5 = texto4.concat("subi ");
//        String texto6 = texto5.concat("no ");
//        String texto7 = texto6.concat("ônibus ");
//        String texto8 = texto7.concat("em ");
//        String texto9 = texto8.concat("Marrocos");
//        System.out.println(texto9);

        String texto = "Socorram";
        texto = texto.concat("-");
        texto = texto.concat("me");
        texto = texto.concat(", ");
        texto = texto.concat("subi ");
        texto = texto.concat("no ");
        texto = texto.concat("ônibus ");
        texto = texto.concat("em ");
        texto = texto.concat("Marrocos");
        System.out.println(texto);

        StringBuilder builder = new StringBuilder("Socorram");
        builder.append("-");
        builder.append("me");
        builder.append(", ");
        builder.append("subi ");
        builder.append("no ");
        builder.append("ônibus ");
        builder.append("em ");
        builder.append("Brasília");
        String texto10 = builder.toString();
        System.out.println(texto10);
    }
}


