package practiseproject22;



public class rangequires
{ 
    static int k = 10;
    static int N = 10000; 
    static long table[][] = new long[N][k + 1]; 
    static void buildSparseTable(int arr[], int n) 
    { 
        for (int i = 0; i < n; i++) 
            table[i][0] = arr[i]; 
        for (int j = 1; j <= k; j++) 
            for (int i = 0; i <= n - (1 << j); i++) 
                table[i][j] = table[i][j - 1] + table[i + (1 << (j - 1))][j - 1]; 
    } 
    static long query(int L, int R) 
    {
        long answer = 0; 
        for (int j = k; j >= 0; j--)  
        { 
            if (L + (1 << j) - 1 <= R)  
            { 
                answer = answer + table[L][j];
                L += 1 << j; 
            } 
        } 
        return answer; 
    }
    public static void main(String args[]) 
    { 
        int arr[] = { 3, 7, 2, 5, 8, 9, 5 }; 
        int n = arr.length; 
        buildSparseTable(arr, n); 
        System.out.println(query(0, 4)); 
        System.out.println(query(3, 5)); 
        System.out.println(query(3, 4)); 
    } 
}
