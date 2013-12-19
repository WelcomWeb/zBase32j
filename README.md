zBase32j
========

A Z-Base32 implementation in Java, converted from .NET ([My Ten Pennies original in C#](http://mytenpennies.wikidot.com/blog%3Abase-32-encoder)) to Java.

## Usage

	import se.welcomweb.utils.zbase32j;

	public class TestZBase32J {
		
		public static void main(String ... args) {
			
			ZBase32j zbase = new ZBase32j();
			
			String message = "Hello, world!";
			String encoded = zbase.encode(message);
			System.out.println("Encoded: " + encoded);
			
			String decoded = zbase.decode(encoded);
			System.out.println("Decoded: " + decoded);
			
		}
		
	}


[![githalytics.com alpha](https://cruel-carlota.pagodabox.com/06a91afc9fa97ecd86fbf6f6591c5d63 "githalytics.com")](http://githalytics.com/WelcomWeb/zBase32j)