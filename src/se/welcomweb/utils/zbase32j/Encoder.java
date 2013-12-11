package se.welcomweb.utils.zbase32j;

public class Encoder extends ZBase32 {
    
    public String encode(String in) {
        return this.encode(in.getBytes());
    }
    
    public String encode(byte[] in) {
        byte[] input         = in;
        StringBuilder output = new StringBuilder();
        
        int special = input.length % 5;
        int normal  = input.length - special;
        
        for (int i = 0; i < normal; i += 5) {
            output.append(
                    encoding[((input[i] & 0xff) >> 3) & 0x1f]
                );
            output.append(
                    encoding[(((input[i] & 0xff) << 2) | ((input[i + 1] & 0xff) >> 6)) & 0x1f]
                );
            output.append(
                    encoding[((input[i + 1] & 0xff) >> 1) & 0x1f]
                );
            output.append(
                    encoding[(((input[i + 1] & 0xff) << 4) | ((input[i + 2] & 0xff) >> 4)) & 0x1f]
                );
            output.append(
                    encoding[(((input[i + 2] & 0xff) << 1) | ((input[i + 3] & 0xff) >> 7)) & 0x1f]
                );
            output.append(
                    encoding[((input[i + 3] & 0xff) >> 2) & 0x1f]
                );
            output.append(
                    encoding[(((input[i + 3] & 0xff) << 3) | ((input[i + 4] & 0xff) >> 5)) & 0x1f]
                );
            output.append(
                    encoding[(input[i + 4] & 0xff) & 0x1f]
                );
        }
        
        switch(special) {
            case 1:
                    output.append(
                            encoding[((input[normal] & 0xff) >> 3) & 0x1f]
                        );
                    output.append(
                            encoding[((input[normal] & 0xff) >> 2) & 0x1f]
                        );
                    output.append(
                            "======"
                        );
                    break;
            case 2:
                    output.append(
                            encoding[((input[normal] & 0xff) >> 3) & 0x1f]
                        );
                    output.append(
                            encoding[(((input[normal] & 0xff) << 2) | ((input[normal + 1] & 0xff) >> 6)) & 0x1f]
                        );
                    output.append(
                            encoding[((input[normal + 1] & 0xff) >> 1) & 0x1f]
                        );
                    output.append(
                            encoding[((input[normal + 1] & 0xff) << 4) & 0x1f]
                        );
                    output.append(
                            "===="
                        );
                    break;
            case 3:
                    output.append(
                            encoding[((input[normal] & 0xff) >> 3) & 0x1f]
                        );
                    output.append(
                            encoding[(((input[normal] & 0xff) << 2) | ((input[normal + 1] & 0xff) >> 6)) & 0x1f]
                        );
                    output.append(
                            encoding[((input[normal + 1] & 0xff) >> 1) & 0x1f]
                        );
                    output.append(
                            encoding[(((input[normal + 1] & 0xff) << 4) | ((input[normal + 2] & 0xff) >> 4)) & 0x1f]
                        );
                    output.append(
                            encoding[((input[normal + 2] & 0xff) << 1) & 0x1f]
                        );
                    output.append(
                            "==="
                        );
                    break;
            case 4:
                    output.append(
                            encoding[((input[normal] & 0xff) >> 3) & 0x1f]
                        );
                    output.append(
                            encoding[(((input[normal] & 0xff) << 2) | ((input[normal + 1] & 0xff) >> 6)) & 0x1f]
                        );
                    output.append(
                            encoding[((input[normal + 1] & 0xff) >> 1) & 0x1f]
                        );
                    output.append(
                            encoding[(((input[normal + 1] & 0xff) << 4) | ((input[normal + 2] & 0xff) >> 4)) & 0x1f]
                        );
                    output.append(
                            encoding[(((input[normal + 2] & 0xff) << 1) | ((input[normal + 3] & 0xff) >> 7)) & 0x1f]
                        );
                    output.append(
                            encoding[((input[normal + 3] & 0xff) >> 2) & 0x1f]
                        );
                    output.append(
                            encoding[((input[normal + 3] & 0xff) << 3) & 0x1f]
                        );
                    output.append(
                            "="
                        );
                    break;
        }
        
        return output.toString();
    }
}
