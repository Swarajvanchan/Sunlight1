public class Sunlight {

    static final int M=3  ;
    static final int N=2;

    static int contribution_height(int current, int previous)
    {
        return Math.abs(current - previous);
    }

    static int surfaceArea(int A[][])
    {
        int ans = 0;

        for (int i = 0; i < N; i++)
        {
            for (int j = 0; j < M; j++) {

                int up = 0;
                int left = 0;

                if (i > 0)

                    up = A[i - 1][j];
                if (j > 0)
                    left = A[i][j - 1];


                ans += contribution_height(A[i][j], up)
                        + contribution_height(A[i][j], left);


                if (i == N - 1)
                    ans += A[i][j];
                if (j == M - 1)
                    ans += A[i][j];
            }
        }

        ans += N * M * 2;
        return ans;
    }

    public static void main (String[] args)
    {
        int A[][] = {{4,0},
                {4,-5},
                {7,5}
                };
        System.out.println(surfaceArea(A));
    }
}
