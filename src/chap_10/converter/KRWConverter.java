package chap_10.converter;

public class KRWConverter implements Convertable {
    @Override
    public void convert(int USD) {
        System.out.println(USD + " 달려 = " + (USD*1400));
    }
}
