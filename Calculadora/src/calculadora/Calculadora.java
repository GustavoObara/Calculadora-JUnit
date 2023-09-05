package calculadora;

public class Calculadora {

    public static void main(String[] args) {
        
        Somar sum        = new Somar();
        Subtrair sub     = new Subtrair();
        Dividir div      = new Dividir();
        Multiplicar mult = new Multiplicar();
        
        /*==============Teste Somar===========*/
        System.out.println("\n==============Teste Somar==============");
        
        /*===========Primeiro teste===========*/
        int teste_sum1 = sum.somar(70,30);
        System.out.println("Primeiro teste, dois números inteiros positivos: " + teste_sum1);
        /*=========Primeiro teste OK =========*/
        
        /*============Segundo teste===========*/
        int teste_sum2 = sum.somar(-60,-40);
        System.out.println("Segundo teste, dois números inteiros negativos: " + teste_sum2);
        /*==========Segundo teste OK =========*/
        
        /*===========Terceiro teste===========*/
        int teste_sum3 = sum.somar(150,-50);
        System.out.println("Terceiro teste, dois números inteiros um positivo e um negativo: " + teste_sum3);
        /*==========Terceiro teste OK ========*/
        
        /*=============Quarto teste===========*/
        int teste_sum4 = sum.somar(0,0);
        System.out.println("Quarto teste, dois numeros nulos: " + teste_sum4);
        /*===========Quarto teste OK =========*/
        
        /*=============Quinto teste===========*/
        int teste_sum5 = sum.somar(100,0);
        System.out.println("Quinto teste, dois numeros inteiros um nulo e um positivo: " + teste_sum5);
        /*===========Quinto teste OK =========*/
        
        /*==============Sexto teste===========*/
        int teste_sum6 = sum.somar(-100,0);
        System.out.println("Sexto teste, dois numeros inteiros um nulo e um negativo: " + teste_sum6);
        /*============Sexto teste OK =========*/
        
        
        
        /*==============Teste Subtrair===========*/
        System.out.println("\n==============Teste Subtrair==============");
        
        /*===========Primeiro teste===========*/
        int teste_sub1 = sub.subtrair(70,30);
        System.out.println("Primeiro teste, dois números inteiros positivos: " + teste_sub1);
        /*=========Primeiro teste OK =========*/
        
        /*============Segundo teste===========*/
        int teste_sub2 = sub.subtrair(-60,-40);
        System.out.println("Segundo teste, dois números inteiros negativos: " + teste_sub2);
        /*==========Segundo teste OK =========*/
        
        /*===========Terceiro teste===========*/
        int teste_sub3 = sub.subtrair(150,-50);
        System.out.println("Terceiro teste, dois números inteiros um positivo e um negativo: " + teste_sub3);
        /*==========Terceiro teste OK ========*/
        
        /*=============Quarto teste===========*/
        int teste_sub4 = sub.subtrair(0,0);
        System.out.println("Quarto teste, dois numeros nulos: " + teste_sub4);
        /*===========Quarto teste OK =========*/
        
        /*=============Quinto teste===========*/
        int teste_sub5 = sub.subtrair(100,0);
        System.out.println("Quinto teste, dois numeros inteiros um nulo e um positivo: " + teste_sub5);
        /*===========Quinto teste OK =========*/
        
        /*==============Sexto teste===========*/
        int teste_sub6 = sub.subtrair(-100,0);
        System.out.println("Sexto teste, dois numeros inteiros um nulo e um negativo: " + teste_sub6);
        /*============Sexto teste OK =========*/
        
        
        
        /*==============Teste Dividir===========*/
        System.out.println("\n==============Teste Dividir==============");
        
        /*===========Primeiro teste===========*/
        int teste_div1 = div.dividir(70,30);
        System.out.println("Primeiro teste, dois números inteiros positivos: " + teste_div1);
        /*=========Primeiro teste OK =========*/
        
        /*============Segundo teste===========*/
        int teste_div2 = div.dividir(-60,-40);
        System.out.println("Segundo teste, dois números inteiros negativos: " + teste_div2);
        /*==========Segundo teste OK =========*/
        
        /*===========Terceiro teste===========*/
        int teste_div3 = div.dividir(150,-50);
        System.out.println("Terceiro teste, dois números inteiros um positivo e um negativo: " + teste_div3);
        /*==========Terceiro teste OK ========*/
        
        /*=============Quarto teste===========*/
        /*
            int teste_div4 = div.dividir(0,0);
            System.out.println("Quarto teste, dois numeros nulos: " + teste_div4);
        /*===========Quarto teste Comentado =========*/
        
        /*=============Quinto teste===========*/
        /*
            int teste_div5 = div.dividir(100,0);
            System.out.println("Quinto teste, dois numeros inteiros um nulo e um positivo: " + teste_div5);
        /*===========Quinto teste Comentado =========*/
        
        /*==============Sexto teste===========*/
        /*
            int teste_div6 = div.dividir(-100,0);
            System.out.println("Sexto teste, dois numeros inteiros um nulo e um negativo: " + teste_div6);
        /*============Sexto teste Comentado =========*/
        
        /*==============Testes comentados, na matemática não existe divisão por 0===========*/
        
        
        
        /*==============Teste Multiplicar===========*/
        System.out.println("\n==============Teste Multiplicar==============");
        
        /*===========Primeiro teste===========*/
        int teste_mult1 = mult.multiplicar(70,30);
        System.out.println("Primeiro teste, dois números inteiros positivos: " + teste_mult1);
        /*=========Primeiro teste OK =========*/
        
        /*============Segundo teste===========*/
        int teste_mult2 = mult.multiplicar(-60,-40);
        System.out.println("Segundo teste, dois números inteiros negativos: " + teste_mult2);
        /*==========Segundo teste OK =========*/
        
        /*===========Terceiro teste===========*/
        int teste_mult3 = mult.multiplicar(150,-50);
        System.out.println("Terceiro teste, dois números inteiros um positivo e um negativo: " + teste_mult3);
        /*==========Terceiro teste OK ========*/
        
        /*=============Quarto teste===========*/
        int teste_mult4 = mult.multiplicar(0,0);
        System.out.println("Quarto teste, dois numeros nulos: " + teste_mult4);
        /*===========Quarto teste OK =========*/
        
        /*=============Quinto teste===========*/
        int teste_mult5 = mult.multiplicar(100,0);
        System.out.println("Quinto teste, dois numeros inteiros um nulo e um positivo: " + teste_mult5);
        /*===========Quinto teste OK =========*/
        
        /*==============Sexto teste===========*/
        int teste_mult6 = mult.multiplicar(-100,0);
        System.out.println("Sexto teste, dois numeros inteiros um nulo e um negativo: " + teste_mult6);
        /*============Sexto teste OK =========*/
    }
    
}