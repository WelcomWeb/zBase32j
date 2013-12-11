zBase32j
========

A Z-Base32 implementation in Java

## Usage

	import se.welcomweb.utils.zbase32j;

	public class Main {
		public static void main(String ... args) {

			ZBase32 z      = new ZBase32();
			String text    = "Your text goes here";

			String encoded = z.encode(s);
			System.out.println("encoded == " + encoded);
			/* encoded == mfzzkhtyqt1zo7byc7zskh3ypb1zr3e= */

			String result  = z.decode(encoded);
			System.out.println("result == " + result);
			/* result == Your text goes here */

		}
	}
