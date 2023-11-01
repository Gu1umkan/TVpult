/*TV пульт*/
import java.sql.SQLOutput;
import java.util.Scanner;
import static java.lang.Integer.parseInt;

public class Main {
    public static void main(String[] args) {
        int channel = 0;
        while(true){
            turnOnOff("off");
            pultTV();
           String chekOut = new Scanner(System.in).nextLine();
               if(chekOut.equals("on")){
                  turnOnOff(chekOut);
                  pultTV();
                  boolean  bool = true;
                  while (bool){
                            String control = new Scanner(System.in).nextLine();
                            if(control.equals("on")){
                                turnOnOff(control);
                                pultTV();}
                            else if(control.equals("off"))  {  bool = false;}
                            if(control.equals("menu"))
                                { menu();  pultTV(); }
                            else {
                             switch (control){
                                 case "next":{
                                         if(channel < 9)         { channel++;  channelsTV(channel);   pultTV();  }
                                         else if (channel == 9)  { channel = 1; channelsTV(channel);  pultTV();  }
                                      break;}
                                 case "back":{
                                             if(channel > 1)     { channel--;  channelsTV(channel);   pultTV();}
                                             else if (channel == 1) { channel = 9;  channelsTV(channel);   pultTV();}
                                     break;}
                                    }
                                 }
                            String channels = "123456789";
                            if(channels.contains(control)){
                                channel = Integer.parseInt(control);
                            switch (channel){
                                case  1: {    channelsTV(channel);      pultTV();   break; }
                                case  2: {    channelsTV(channel);      pultTV();   break; }
                                case  3: {    channelsTV(channel);      pultTV();   break; }
                                case  4: {    channelsTV(channel);      pultTV();   break; }
                                case  5: {    channelsTV(channel);      pultTV();   break; }
                                case  6: {    channelsTV(channel);      pultTV();   break; }
                                case  7: {    channelsTV(channel);      pultTV();   break; }
                                case  8: {    channelsTV(channel);      pultTV();   break; }
                                case  9: {    channelsTV(channel);      pultTV();   break; }
                                       }
                                     }
                                }
                         }
              else System.out.println("\u001B[31mТелевизорду жандырмайынча башка коммандаларды баса албайсын!\u001B[0m");
        }
    }

public static void pultTV(){
    System.out.println("""
                        TV пульт
                +--------------------+
                |   off         on   |
                |        (menu)      |
                |   back       next  |
                |    1     2     3   |
                |                    |
                |    4     5     6   |
                |                    |
                |    7     8     9   |
                +--------------------+
             Телевизорду күйгүзүү үчүн "on" сөзүн жазыңыз.
             Телевизорду өчүрүү үчүн "off" сөзүн жазыңыз.
             Менюга кирүү үчүн "menu" сөзүн жазыныз.
             Каалаган каналга өтүү үчүн каналдын номерин жазыңыз.
             Кийинки каналга өтүү үчүн "next" сөзүн жазыныз.
             Арткы каналга кайтуу  үчүн "back" сөзүн жазыныз.
            """);
    }
        public static void menu() {
            System.out.println(""" 
                                    +===============================================+
                                    ||--------------------MENU---------------------||                             
                                    ||  1)KTRK       | 4)ELTR       | 7) Muz Tv    ||
                                    ||  2)Ala-Too 24 | 5)KTRK sport | 8) NTS       ||
                                    ||  3)Balastan   | 6)Madaniyat  | 9) Manas Tv  ||
                                    ||_____________________________________________||
                                    +===============================================+
                                    """);
        }
        public static void turnOnOff(String onOff){
            String[] turnOffOn ={ """ 
                                    +=================================+
                                    ||------------------------------ ||                             
                                    ||           WELCOME TO          ||
                                    ||      SAMSUNG SMART TV         ||
                                    ||                               ||
                                    +=================================+
                                    """, """   
                                                SAMSUNG TV
                                    +=================================+
                                    ||------------------------------ ||                             
                                    ||                               ||
                                    ||                               ||
                                    ||                               ||
                                    +=================================+
                                 """};
            if(onOff.equals("on"))  System.out.println( turnOffOn[0]);
            else {  System.out.println( turnOffOn[1]); }
        }
        public static void channelsTV(int a) {
           String[] channels = {""" 
                                    +=================================+
                                    ||------------------------------ ||                             
                                    ||  channel-1              KTRK  ||
                                    ||                               ||
                                    ||                               ||
                                    +=================================+
                                    """, """
                                    +=================================+
                                    ||------------------------------ ||                             
                                    ||  channel-2        Ala-TOO 24  ||
                                    ||                               ||
                                    ||                               ||
                                    +=================================+
                                    """, """ 
                                    +=================================+
                                    ||------------------------------ ||                             
                                    ||  channel-3           Balastan ||
                                    ||                               ||
                                    ||                               ||
                                    +=================================+
                                    """, """ 
                                    +=================================+
                                    ||------------------------------ ||                             
                                    ||  channel-4              ELTR  ||
                                    ||                               ||
                                    ||                               ||
                                    +=================================+
                                    """, """ 
                                    +=================================+
                                    ||------------------------------ ||                             
                                    ||  channel-5         KTRK Sport ||
                                    ||                               ||
                                    ||                               ||
                                    +=================================+
                                    """, """ 
                                    +=================================+
                                    ||------------------------------ ||                             
                                    ||  channel-6         Madaniyat  ||
                                    ||                               ||
                                    ||                               ||
                                    +=================================+
                                    """, """ 
                                    +=================================+
                                    ||------------------------------ ||                             
                                    ||  channel-7            Muz TV  ||
                                    ||                               ||
                                    ||                               ||
                                    +=================================+
                                    """, """ 
                                    +=================================+
                                    ||------------------------------ ||                             
                                    ||  channel-8               NTS  ||
                                    ||                               ||
                                    ||                               ||
                                    +=================================+
                                    """,""" 
                                    +=================================+
                                    ||------------------------------ ||                             
                                    ||  channel-9          Manas Tv  ||
                                    ||                               ||
                                    ||                               ||
                                    +=================================+
                                    """};
            System.out.println(channels[a-1]);
           }
        }








