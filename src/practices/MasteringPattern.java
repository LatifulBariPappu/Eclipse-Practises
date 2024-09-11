package practices;

public class MasteringPattern {

	public static void main(String[] args) {
		int n=5;
		System.out.println("following is the increasing pattern : \n");
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(" *");
			}
			System.out.println();
		}
		System.out.println("\nfollowing is the decreasing pattern : \n");
		for(int i=1;i<=n;i++) {
			for(int j=i;j<=n;j++) {
				System.out.print(" *");
			}
			System.out.println();
		}
	}
}
