import java.util.Scanner;
class exp3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n=sc.nextInt();
        int team[][]=new int[n][];
        for(int i=0;i<n;i++){
            System.out.print("\nEnter the number of matches for Player "+(i+1)+" : ");
            int m=sc.nextInt();
            team[i]=new int[m+1];
            team[i][0]=i+1;
            for(int j=0;j<m;j++){
                System.out.print("Enter runs in match "+(j+1)+" : ");
                team[i][j+1]=sc.nextInt();
            }
        }
        System.out.println();
        for(int i=0;i<n;i++){
            System.out.println("Player "+(i+1)+" Stats");
            System.out.println("------------------------\nNumber of Matches Played : "+(team[i].length-1));
            double totalRuns=0;
            for(int j=1;j<team[i].length;j++){
                System.out.println("Runs in Match "+(j)+" : "+team[i][j]);
                totalRuns+=team[i][j];
            }
            System.out.println("Total Runs : "+totalRuns);
            System.out.println("Batting Average : "+totalRuns/(team[i].length-1));
            System.out.println();
        }
    }
}