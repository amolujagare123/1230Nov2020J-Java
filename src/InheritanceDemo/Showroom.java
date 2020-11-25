package InheritanceDemo;

public class Showroom {

    void volumeControl()
    {
        System.out.println("Showroom volumeControl");
    }

    void settings()
    {
        System.out.println("Showroom settings");
    }

    void channels()
    {
        System.out.println("Showroom channels");
    }
}


class  Samsumg extends  Showroom
{
    void volumeControl()
    {
        System.out.println("Samsumg volumeControl");
    }

    void settings()
    {
        System.out.println("Samsumg settings");
    }

    void channels()
    {
        System.out.println("Samsumg channels");
    }
}


class  Onida extends  Showroom
{
    void volumeControl()
    {
        System.out.println("Onida volumeControl");
    }

    void settings()
    {
        System.out.println("Onida settings");
    }

    void channels()
    {
        System.out.println("Onida channels");
    }
}

class  LG extends  Showroom
{
    void volumeControl()
    {
        System.out.println("LG volumeControl");
    }

    void settings()
    {
        System.out.println("LG settings");
    }

    void channels()
    {
        System.out.println("LG channels");
    }
}


class TestOverriding
{
    public static void main(String[] args) {

        Onida onida = new Onida();

        onida.channels();
        onida.settings();
        onida.volumeControl();


        Showroom showroom = new Onida(); // upcasting

        showroom.channels();
        showroom.settings();
        showroom.volumeControl();

           showroom =  new LG();

        showroom.channels();
        showroom.settings();
        showroom.volumeControl();

        showroom = new Samsumg();

        showroom.channels();
        showroom.settings();
        showroom.volumeControl();
/*

                int i =10;

                i =20;


                i=30;


                i=40;


                int a= i ;
*/

    }
}