#User function Template for python3
class Solution:
	def setBits(self, N):
		x = bin(int(N))
		y = x[2:]
		lis = list(y)
		return lis.count("1")


#{ 
 # Driver Code Starts
#Initial Template for Python 3

if __name__ == '__main__':
	T=int(input())
	for i in range(T):
		N = int(input())
		ob = Solution()
		ans = ob.setBits(N)
		print(ans)




# } Driver Code Ends