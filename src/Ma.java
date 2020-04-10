public class Ma
{
    public static void main(String[]args)
    {
        usandoEnun();



    }
    private static void usandoEnun()
    {
        DiaSemana x=DiaSemana.Domingo;
        mostraDias(x);


    }
    private static void mostraDias(DiaSemana x)
    {

     if(x== DiaSemana.Segunda)
     {
         System.out.println(DiaSemana.Segunda);
     }
        if (x==DiaSemana.Domingo)
        {
            System.out.println(DiaSemana.Domingo);
        }
        if (x==DiaSemana.Sabado)
        {
            System.out.println(DiaSemana.Sabado);
        }
        if (x==DiaSemana.Quarta)
        {
            System.out.println(DiaSemana.Quarta);
        }
        if (x==DiaSemana.Quinta)
        {
            System.out.println(DiaSemana.Quinta);
        }
        if (x==DiaSemana.Terca)
        {
            System.out.println(DiaSemana.Terca);
        }
        if(x==DiaSemana.Sexta)
        {
            System.out.println(DiaSemana.Sexta);
        }
    }

}
