package final2;
//Karmaşık haldeki sayıları sıraya koyma.

import java.util.Arrays;
public class Final2 {

    static int sirala()        //sırala adında metot oluşturduk.
    {
        int[] dizi = {1, 234, 456, 678, 8910};  //dizi tanımlayıp içine rastgele sayı değerleri girdik.

        Arrays.sort (dizi);         //diziyi array sort sıralama mantığı ile sıralayacağız.
        for (int i = 0; i < dizi.length; i++)   //döngümüz dizi elemanları sayısı kadar döndüreceğiz.
        {
        System.out.println("Girilen Sayılar Sırasıyla :"+dizi[i]);      //ekrana sıralanmış şekilde yazdırıyoruz.
        }
        return 0;   //geriye değer döndürmüyoruz
    }

    public static void main(String[] args)    //ana kısım.	
    {
        sirala(); //sırala metotunu çağırıp ekrana yazılmasını sağladık.
      
    }
}