package br.com.digitalhouse;

public class princ {
    public static void main(String[] args) {
        Filho filhoUm = new Filho("Maria", "Jorge", "Jose");
        Filho filhoDois = new Filho ("Maria", "Fernando", "Ana");

        mesmaMae(filhoUm, filhoDois);
        mesmoPai(filhoUm, filhoDois);

        System.out.println(saoMeioIrmaos(filhoUm, filhoDois));

    }
        }
        public static String maeDe(Filho filho){
    return filho.getMae();
        }

        public static String paiDe(Filho filho){
    return filho.getPai();
        }

        public static boolean mesmaMae(Filho filhoUm, Filho filhoDois){
    return maeDe((filhoUm) == maeDe(filhoDois);
        }

        public static boolean mesmoPai(Filho filhoUm, Filho filhoDois){
    if (paiDe(filhoUm) == paiDe(filhoDois)){
        return true;
        else{
            return false;
        }

        public static boolean saoMeioIrmaos (Filho filhoUm, Filho filhoDois){
            return mesmaMae(filhoUm, filhoDois) && !mesmoPai(filhoUm, filhoDois)
                    || !mesmaMae(filhoUm, filhoDois) && mesmoPai(filhoUm, filhoDois);
        }

            }
        }
