public class Colores {
    public static void main(String[] args) {

        // Colores del texto
        System.out.println("\033[30mGris\033[0m");
        System.out.println("\033[31mRojo\033[0m");
        System.out.println("\033[32mVerde\033[0m");
        System.out.println("\033[33mAmarillo\033[0m");
        System.out.println("\033[34mAzul\033[0m");
        System.out.println("\033[35mMagenta\033[0m");
        System.out.println("\033[36mCian\033[0m");
        System.out.println("\033[37mBlanco\033[0m");

        // Salto de linea
        System.out.println();

        // Colores del fondo
        System.out.println("\033[40mGris\033[0m");
        System.out.println("\033[41mRojo\033[0m");
        System.out.println("\033[42mVerde\033[0m");
        System.out.println("\033[43mAmarillo\033[0m");
        System.out.println("\033[44mAzul\033[0m");
        System.out.println("\033[45mMagenta\033[0m");
        System.out.println("\033[46mCian\033[0m");
        System.out.println("\033[47mBlanco\033[0m");

        // Salto de linea
        System.out.println();

        // Estilos de texto
        System.out.println("\033[1mNegrita\033[0m");
        System.out.println("\033[2mAtenuado\033[0m");
        System.out.println("\033[3mCursiva\033[0m");
        System.out.println("\033[4mSubrayado\033[0m");
        System.out.println("\033[7mInvertir colores\033[0m");
        System.out.println("\033[9mTachado\033[0m");

        // Salto de linea
        System.out.println();

        // RGB
        System.out.println("\033[38;2;255;100;50mHola RGB\033[0m");

        // Salto de linea
        System.out.println();

        // Emotes
        System.out.println("\033[38;2;50;255;80m🐸 RANA\033[0m");
        System.out.println("\033[38;2;255;100;0m🔥 FUEGO\033[0m");
        System.out.println("\033[1;38;2;255;255;255;48;2;80;20;150m🤠 JAVA\033[0m");

        // Calculo
        int a = 21;
        int b = 15;
        int r = 0;

        float c = 14.4f;

        r = a * b;

        System.out.printf("El resultado de %d por %d es igual a %d\n",a,b,r);
        System.out.printf("El resultado de " + a + " por " + b + " es igual a " + r);

        System.out.printf("\nEl descuento es de %.2f %%",c);
    }
}