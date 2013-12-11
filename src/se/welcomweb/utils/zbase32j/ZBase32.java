package se.welcomweb.utils.zbase32j;

public abstract class ZBase32 {
    protected char[] encoding = "ybndrfg8ejkmcpqxot1uwisza345h769".toCharArray();
    protected byte[] decoding;
    
    public ZBase32() {

        this.decoding = new byte[0x80];

        for (int i = 0; i < this.encoding.length; i++) {

            this.decoding[this.encoding[i]] = (byte) i;
            
        }

    }
}
