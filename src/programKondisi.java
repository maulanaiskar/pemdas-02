import java.util.Scanner;

public class programKondisi {
    public static void main(String[] args) {
        String Rumah;
        int Rumah1,Rumah2,Rumah3,Gaji=0,Cicil = 0,CicilanBulan = 0,jumlahcicil1,jumlahcicil2,jumlahcicil3,percicil = 0,percicil2,percicil3;
        //Insial
        Rumah1=150000000;
        Rumah2=200000000;
        Rumah3=250000000;
        Scanner input=new Scanner(System.in);

        System.out.print("Masukkan besarnya gaji/bulan\t:");
        Gaji=input.nextInt();

        System.out.print("Rencana lama mencicil(5-15 th)\t:");
        Cicil=input.nextInt();
        if((Cicil>=5)||(Cicil<=15));{
            System.out.println("");
            System.out.println("Hasil perhitungan :");
        }
        if((Cicil>15)||(Cicil<5)){
            System.out.print("Cicilan hanya bisa 5-15 tahun\n");
        }CicilanBulan=((Gaji*80)/100);
        int Bulan = Cicil*12;
        percicil=Rumah1/Bulan;
        if((CicilanBulan*Bulan<Rumah1)&&(percicil>CicilanBulan)&&(Cicil>=5)&&(Cicil<=15)){
            System.out.println("Gaji anda tidak sesuai syarat");
        } else if((CicilanBulan*Bulan<Rumah2) && (CicilanBulan*Bulan>=Rumah1) && (Cicil>=5)&&(Cicil<=15)){
            percicil=Rumah1/Bulan;
            System.out.println("Tipe Rumah yang bisa diambil\t:Rumah 1");
            System.out.println("Jumlah cicilan/bulan\t\t:Rp "+percicil);
        } else if((CicilanBulan*Bulan<Rumah3) && (CicilanBulan*Bulan>=Rumah2)&&(Cicil>=5)&&(Cicil<=15)){
            percicil2=Rumah2/Bulan;
            System.out.println("Tipe Rumah yang bisa diambil\t:Rumah 2");
            System.out.println("Jumlah cicilan/bulan\t\t:Rp "+percicil2);
        } else if((CicilanBulan*Bulan>Rumah3) && (Cicil>=5)&&(Cicil<=15)){
            percicil3=Rumah3/Bulan;
            System.out.println("Tipe Rumah yang bisa diambil\t:Rumah 3");
            System.out.println("Jumlah cicilan/bulan\t\t:Rp "+percicil3);
        }
     }
}
