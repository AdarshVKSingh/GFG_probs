#User function Template for python3

class Solution:
    def rotate(self, N, D):
        # code here
        
        l = bin(N)[2:]
        f = (16 -len(l))*"0" + l
        D = D % len(f)
        k = f[D:] + f[0:D]
        m = f[len(k)-D:] + f[0:len(k)-D]
       # print(k+" " + m)
        return [int(k,2),int(m,2)]


#{ 
 # Driver Code Starts
#Initial Template for Python 3

if __name__ == '__main__':
    t = int(input())
    for _ in range(t):
        n, d = input().strip().split(" ")
        n, d = int(n), int(d)
        ob = Solution()
        ans = ob.rotate(n, d)
        print(ans[0])
        print(ans[1])
# } Driver Code Ends