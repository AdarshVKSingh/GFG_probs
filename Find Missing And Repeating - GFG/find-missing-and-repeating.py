#User function Template for python3

class Solution:
    def findTwoElement( self,arr, n): 
        arrsum = sum(set(arr))
        arrsum2 =  sum(arr)
        
        a = arrsum2-arrsum
        b = (n*(n+1))/2 - arrsum;
        return (a,int(b))


#{ 
 # Driver Code Starts
#Initial Template for Python 3

if __name__ == '__main__': 

    tc=int(input())
    while tc > 0:
        n=int(input())
        arr=list(map(int, input().strip().split()))
        ob = Solution()
        ans=ob.findTwoElement(arr, n)
        print(str(ans[0])+" "+str(ans[1]))
        tc=tc-1
# } Driver Code Ends