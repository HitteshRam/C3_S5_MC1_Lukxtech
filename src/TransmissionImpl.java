import java.sql.SQLOutput;

public class TransmissionImpl {
    public static void main(String[] args) {

        Manual mp4 = new Manual("Manual", "MP4", 4,
                2.540f, 1.920f, 1.510f, 1.000f);
        Manual mp5= new Manual ("Manual", "Mp4", 5, 3.545f, 1.904f, 1.280f,
        0.914f, 0.757f);
        Manual mp6= new Manual("Manual", "MP6", 6, 3.010f, 2.070f, 1.430f,
        1.000f, 0.710f, 0.570f);
        Manual md5= new Manual("Manual", "MD5", 5, 3.545f, 1.904f, 1.233f,
                0.911f, 0.725f);
        Manual md6= new Manual("Manual", "MD6", 6, 3.640f, 2.150f, 1.360f,
                1.000f, 0.750f, 0.630f);

        AMT ampt4= new AMT("Automatic", "AMTP4", 4,
                2.540f, 1.920f, 1.510f, 1.000f);
        AMT amtd5= new AMT("Automatic", "AMTD5", 5,
                2.950f, 1.940f, 1.340f, 1.000f, 0.630f);

        Automatic_CVT cvt6= new Automatic_CVT("Automatic-CVT", "CVT6", 6, 2.631f, 1.440f,
                1.165f, 0.906f, 0.680f, 0.499f);

        Automatic_DCT dct8 = new Automatic_DCT("Automatic-DCT", "DCT8", 8, 4.714f, 3.143f,
                2.106f, 1.667f, 1.285f, 1.000f, 0.839f, 0.667f);


        System.out.println(ampt4.showSpecs()+ "\n\n");
        System.out.println(amtd5.showSpecs()+ "\n\n");
        System.out.println(mp4.showSpecs()+ "\n\n");
        System.out.println(mp5.showSpecs()+ "\n\n");
        System.out.println(mp6.showSpecs()+ "\n\n");
        System.out.println(md5.showSpecs()+ "\n\n");
        System.out.println(md6.showSpecs()+ "\n\n");
        System.out.println(cvt6.showSpecs()+ "\n\n");
        System.out.println(dct8.showSpecs()+ "\n\n");


    }
}
