
public class Hairetu3 {

	public static void main(String[] args) {
		int [] nums = {8,5,9,2,4};
		for (int i:nums) {

			System.out.print(i + " ");
		}
		System.out.println("\naaaaaaaaaaaaa");

		int sum = 0;
		for (int i:nums) {
			sum+=i;
		}
		System.out.print(sum);
		System.out.println("\naaaaaaaaaaaaa");

		int cnt=0;
		for (int i:nums) {
			if (i >5) {
				cnt++;
			}
		}

		System.out.print(cnt);
		System.out.println("\naaaaaaaaaaaaa");

		for (int i=0;i<5;i++) {

				nums[i] =nums[i]*2;
		}
		for (int i:nums) {

			System.out.print(i + " ");
		}
		System.out.println("\naaaaaaaaaaaaa");
		int mx=nums[0];
		for (int i=1;i<5;i++) {
			if (nums[i]>mx) {
				mx = nums[i];
			}

		}
		System.out.print(mx);
		System.out.println("\naaaaaaaaaaaaa");

	}

}
